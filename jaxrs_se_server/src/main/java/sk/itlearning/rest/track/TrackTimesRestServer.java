package sk.itlearning.rest.track;

import java.awt.Color;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JLabel;

import com.google.gson.Gson;

import io.undertow.Undertow;
import io.undertow.Undertow.Builder;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.BlockingHandler;
import io.undertow.server.handlers.PathTemplateHandler;
import io.undertow.util.HttpString;
import sk.itlearning.rest.track.TrackTimes.TrackTimesUser;

public class TrackTimesRestServer {

	static File trackTimesFile;

	static Undertow createHttpServer(JLabel descriptionLabel) {
		try {
			Path runtimePath = Paths.get(new File(".").getCanonicalPath());

			trackTimesFile = Paths.get(runtimePath.toFile().getAbsolutePath(), "trackTimes.json").toFile();

			Builder serverBuilder = Undertow.builder().addHttpListener(8090, "localhost");

			serverBuilder.setHandler(new PathTemplateHandler()
					.add("/readTrackTimes", e -> readTrackTimes(e, descriptionLabel))
					.add("/saveTrackTimesUser", new BlockingHandler(e -> saveTrackTimesUser(e, descriptionLabel))));

			Undertow httpServer = serverBuilder.build();

			httpServer.start();

			return httpServer;
		} catch (Throwable e) {
			e.printStackTrace();
			descriptionLabel.setForeground(Color.red);
			descriptionLabel.setText("Failed to create http server: " + e.getMessage());
		}
		return null;
	}

	private static void readTrackTimes(HttpServerExchange ex, JLabel errorLabel) {
		try {
			errorLabel.setForeground(Color.black);
			errorLabel.setText("Waiting for next request...");
			ex.getResponseHeaders().put(new HttpString("Access-Control-Allow-Origin"), "*");
			TrackTimes trackTimes = TrackTimesUtils.loadTrackTimes();
			ex.getResponseSender().send(new Gson().toJson(trackTimes));
		} catch (Throwable e) {
			e.printStackTrace();
			errorLabel.setForeground(Color.red);
			errorLabel.setText("Failed to read track file: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	private static void saveTrackTimesUser(HttpServerExchange ex, JLabel errorLabel) {
		try {
			errorLabel.setForeground(Color.black);
			errorLabel.setText("Waiting for next request...");
			ex.getResponseHeaders().put(new HttpString("Access-Control-Allow-Origin"), "*");
			String userName = ex.getQueryParameters().get("user").getFirst();
			TrackTimes trackTimes = TrackTimesUtils.loadTrackTimes();
			TrackTimesUser user = TrackTimesUtils.getTrackTimesUser(trackTimes, userName);
			ex.startBlocking();
			TrackTimesUser requestUser = new Gson().fromJson(new InputStreamReader(ex.getInputStream()), TrackTimesUser.class);
			user.setRecords(requestUser.getRecords());
			TrackTimesUtils.saveTrackTimes(errorLabel, trackTimes);
			ex.getResponseSender().send(new Gson().toJson(trackTimes));
		} catch (Throwable e) {
			e.printStackTrace();
			errorLabel.setForeground(Color.red);
			errorLabel.setText("Failed to process save: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

}
