import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint {
	public static void main(String[] args) {
		// Image icons
		// Start Colour Icons
		ImageIcon blackIcon = new ImageIcon("bin\\iconColours\\blackIcon.gif");
		ImageIcon redIcon = new ImageIcon("bin\\iconColours\\redIcon.gif");
		ImageIcon greenIcon = new ImageIcon("bin\\iconColours\\greenIcon.gif");
		ImageIcon yellowIcon = new ImageIcon("bin\\iconColours\\yellowIcon.gif");
		ImageIcon magentaIcon = new ImageIcon(
				"bin\\iconColours\\magentaIcon.gif");
		ImageIcon blueIcon = new ImageIcon("bin\\iconColours\\blueIcon.gif");
		ImageIcon clearIcon = new ImageIcon("bin\\iconColours\\clearIcon.gif");
		// End Colour Icons

		// Start tools Icons
		ImageIcon circleIcon = new ImageIcon("bin\\toolIcons\\circleIcon.gif");
		ImageIcon squareIcon = new ImageIcon("bin\\toolIcons\\squareIcon.gif");
		ImageIcon sharpieIcon = new ImageIcon("bin\\toolIcons\\sharpieIcon.gif");
		ImageIcon eraserIcon = new ImageIcon("bin\\toolIcons\\eraserIcon.gif");
		ImageIcon pencilIcon = new ImageIcon("bin\\toolIcons\\pencilIcon.gif");
		// End tools Icons
		// End Image Icons

		JFrame frame = new JFrame("Paint 2.0"); // sets title
		final Painter painter = new Painter(); // creates the paint program
		Container content = frame.getContentPane(); // Creates a Container
		content.setLayout(new BorderLayout()); // content layout style
		content.add(painter, BorderLayout.CENTER); // centers painter

		//
		// Creates the buttons with their events.

		JButton clearButton = new JButton(clearIcon);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.clear();
			}// End actionPerformed
		});// end actionListener

		JButton redButton = new JButton(redIcon);
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.red();
			}// End actionPerformed
		});// end actionListener

		JButton magentaButton = new JButton(magentaIcon);
		magentaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.magenta();
			}// End actionPerformed
		});// end actionListener

		JButton blueButton = new JButton(blueIcon);
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.blue();
			}// End actionPerformed
		});// end actionListener

		JButton greenButton = new JButton(greenIcon);
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.green();
			}// End actionPerformed
		});// end actionListener

		JButton yellowButton = new JButton(yellowIcon);
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.yellow();
			}// End actionPerformed
		});// end actionListener

		JButton blackButton = new JButton(blackIcon);
		blackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.black();
			}// End actionPerformed
		});// end actionListener

		JButton circleButton = new JButton(circleIcon);
		circleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.circleTool();
			}// End actionPerformed
		});// end actionListener

		JButton squareButton = new JButton(squareIcon);
		squareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.squareTool();
			}// End actionPerformed
		});// end actionListener

		JButton sharpieButton = new JButton(sharpieIcon);
		sharpieButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.sharpieTool();
			}// End actionPerformed
		});// End actionListener

		JButton eraserButton = new JButton(eraserIcon);
		eraserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.eraserTool();
			}
		});

		JButton pencilButton = new JButton(pencilIcon);
		pencilButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painter.pencilTool();
			}
		});

		// END BUTTON EVENTS
		//

		// Start button sizes:
		clearButton.setPreferredSize(new Dimension(16, 16));
		blackButton.setPreferredSize(new Dimension(16, 16));
		magentaButton.setPreferredSize(new Dimension(16, 16));
		redButton.setPreferredSize(new Dimension(16, 16));
		blueButton.setPreferredSize(new Dimension(16, 16));
		greenButton.setPreferredSize(new Dimension(16, 16));
		yellowButton.setPreferredSize(new Dimension(16, 16));
		// End set button sizes

		// START colourPanel
		JPanel colourPanel = new JPanel();
		// Setting the size of the panel.
		colourPanel.setPreferredSize(new Dimension(32, 32));
		colourPanel.setMinimumSize(new Dimension(32, 32));
		colourPanel.setMaximumSize(new Dimension(32, 68));
		// end JPanel Colour size settings
		// adds the buttons to the panel
		colourPanel.add(clearButton);
		colourPanel.add(redButton);
		colourPanel.add(magentaButton);
		colourPanel.add(blueButton);
		colourPanel.add(greenButton);
		colourPanel.add(yellowButton);
		colourPanel.add(blackButton);
		// end adding buttons
		// END colourPanel

		// Start toolButton size
		pencilButton.setPreferredSize(new Dimension(16, 16));
		circleButton.setPreferredSize(new Dimension(16, 16));
		sharpieButton.setPreferredSize(new Dimension(16, 16));
		eraserButton.setPreferredSize(new Dimension(16, 16));
		squareButton.setPreferredSize(new Dimension(16, 16));
		// end toolButton size

		// START toolPanel
		JPanel toolPanel = new JPanel();
		// setting the size of the toolPanel
		toolPanel.setPreferredSize(new Dimension(32, 32));
		toolPanel.setMinimumSize(new Dimension(32, 32));
		toolPanel.setMaximumSize(new Dimension(32, 68));
		// end size toolPanel
		toolPanel.add(circleButton);
		toolPanel.add(squareButton);
		toolPanel.add(sharpieButton);
		toolPanel.add(eraserButton);
		toolPanel.add(pencilButton);
		// END toolPanel

		// frame settings
		content.add(colourPanel, BorderLayout.NORTH); // sets panel west
		content.add(toolPanel, BorderLayout.WEST);
		frame.setSize(700, 600); // sets the size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes
		frame.setVisible(true);// Enables visible
		// end frame settings

	}// End main
}// End class
