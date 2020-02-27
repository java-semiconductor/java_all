package sk.itlearning.rest.track;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import sk.itlearning.rest.track.TrackTimes.TrackTimesInterval;
import sk.itlearning.rest.track.TrackTimes.TrackTimesRecord;
import sk.itlearning.rest.track.TrackTimes.TrackTimesTask;
import sk.itlearning.rest.track.TrackTimes.TrackTimesUser;

class TrackTimesUtils {

	static TrackTimes loadTrackTimes() {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream(TrackTimesRestServer.trackTimesFile))) {
			TrackTimes trackTimes = new Gson().fromJson(isr, TrackTimes.class);
			if (trackTimes == null) {
				trackTimes = new TrackTimes();
			}
			return trackTimes;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	static void saveTrackTimes(JLabel errorLabel, TrackTimes trackTimes) {
		try (FileOutputStream fos = new FileOutputStream(TrackTimesRestServer.trackTimesFile)) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			fos.write(gson.toJson(trackTimes).getBytes());
		} catch (Throwable e) {
			e.printStackTrace();
			errorLabel.setForeground(Color.red);
			errorLabel.setText("Failed to save task file: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	static void startDefaultTask(JLabel errorLabel, String userName) {
		try (InputStreamReader isr = new InputStreamReader(
				new FileInputStream(TrackTimesRestServer.trackTimesFile))) {

			TrackTimes trackTimes = loadTrackTimes();

			TrackTimesUser user = getTrackTimesUser(trackTimes, userName);

			TrackTimesRecord record = user.getRecords().stream().filter(r -> r.getDate().equals(LocalDate.now()))
					.findFirst().orElse(null);
			if (record == null) {
				record = trackTimes.new TrackTimesRecord();
				record.setDate(LocalDate.now());
				user.getRecords().add(record);
			}

			TrackTimesTask defaultTask = record.getTasks().stream().filter(t -> t.getName().equals("Default Startup Task"))
					.findFirst().orElse(null);
			if (defaultTask == null) {
				defaultTask = trackTimes.new TrackTimesTask();
				defaultTask.setName("Default Startup Task");
				record.getTasks().add(defaultTask);
			}

			defaultTask.setRunning(true);
			defaultTask.setCreated(new Date());
			TrackTimesInterval interval = trackTimes.new TrackTimesInterval();
			interval.setFrom(new Date());
			defaultTask.getIntervals().add(interval);

			saveTrackTimes(errorLabel, trackTimes);

		} catch (Throwable e) {
			e.printStackTrace();
			errorLabel.setForeground(Color.red);
			errorLabel.setText("Failed to start default task: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	static TrackTimesUser getTrackTimesUser(TrackTimes trackTimes, String userName) {
		TrackTimesUser user = trackTimes.getUsers().stream().filter(u -> u.getName().equals(userName)).findFirst()
				.orElse(null);
		if (user == null) {
			user = trackTimes.new TrackTimesUser();
			user.setName(userName);
			trackTimes.getUsers().add(user);
		}

		return user;
	}

}
