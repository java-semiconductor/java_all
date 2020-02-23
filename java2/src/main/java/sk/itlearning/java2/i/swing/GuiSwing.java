package sk.itlearning.java2.i.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Label");
		JButton button = new JButton("Action");
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(button);
		
		frame.setContentPane(panel);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + "X");
			}
		});
		
		// button.addActionListener(e -> label.setText(label.getText() + "Y"));
		
		frame.pack();
		frame.setBounds(300, 300, 400, 250);
		frame.setVisible(true);
	}
	
}
