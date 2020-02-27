package sk.itlearning.rest.track;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import io.undertow.Undertow;

public class TrackTimesMain {

	static JFrame appFrame = new JFrame("Track Times REST Server");

	static Undertow httpServer = null;

	public static void main(String[] args) {

		appFrame.setResizable(false);
		appFrame.setAlwaysOnTop(true);
		appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		appFrame.setBounds(100, 100, 400, 150);
		appFrame.setVisible(true);

		// GUI COMPONENTS
		JLabel descriptionLabel = new JLabel();
		
		setDescriptionReady(descriptionLabel);

		JButton startBtn = new JButton("Start Tracking");
		startBtn.setBorderPainted(false);

		JButton stopBtn = new JButton("Stop Tracking");
		stopBtn.setBorderPainted(false);

		startBtn.setEnabled(false);
		stopBtn.setEnabled(false);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));

		panel.add(descriptionLabel);
		panel.add(startBtn);
		panel.add(stopBtn);

		appFrame.setSize(new Dimension(600, 200));

		appFrame.setContentPane(panel);

		// LISTENERS
		if (httpServer == null) {
			startBtn.setEnabled(true);
		} else {
			stopBtn.setEnabled(true);
		}

		startBtn.addActionListener(e -> {
			httpServer = TrackTimesRestServer.createHttpServer(descriptionLabel);
			setDescriptionStarted(descriptionLabel);
			startBtn.setEnabled(false);
			stopBtn.setEnabled(true);
		});

		stopBtn.addActionListener(e -> {
			try {
				httpServer.stop();
			} catch (Throwable ex) {
				// do nothing
			} finally {
				httpServer = null;
				setDescriptionReady(descriptionLabel);
			}
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
		});
	}
	
	private static void setDescriptionReady(JLabel descriptionLabel) {
		descriptionLabel.setForeground(Color.blue);
		descriptionLabel.setText("Track server ready to start...");
	}
	
	private static void setDescriptionStarted(JLabel descriptionLabel) {
		descriptionLabel.setForeground(Color.DARK_GRAY);
		descriptionLabel.setText("Track http server listening on port 8090...");
	}

}
