package sk.itlearning.java2.i.swing;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel("A Magic Button");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JButton button = new JButton("DoIt");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		panel.add(label);
		panel.add(button);
		
		frame.setContentPane(panel);
		
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				button.setText(button.getText() + " DoIt");
//			}
//		});
		
		button.addActionListener(e -> {
			button.setText(button.getText() + " DoIt");	
		});
		
		frame.pack();
		frame.setBounds(300, 300, 600, 300);
		frame.setVisible(true);
	}
	
}
