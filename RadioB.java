/* RadioB.java
An example to illustrate event handling with interactive
radio buttons that control the font style of a textfield
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioB extends JPanel implements ItemListener {

	private JTextField text;
	private Font plainFont, boldFont, italicFont, boldItalicFont;
	private JRadioButton plain, bold, italic, boldItalic;
	private ButtonGroup radioButtons;
 
	// The constructor method is where the display is initially
	// built
	public RadioB() {
		// Create the test text string and set its font
		text = new JTextField("In what font style should I appear?", 25);
		text.setFont(plainFont);
		// Create radio buttons for the fonts and add them to 
		// a new button group
		plain = new JRadioButton("Plain", true);
		bold = new JRadioButton("Bold");
		italic = new JRadioButton("Italic");
		boldItalic = new JRadioButton("Bold Italic");
		radioButtons = new ButtonGroup(); 
		radioButtons.add(plain);
		radioButtons.add(bold);
		radioButtons.add(italic);
		radioButtons.add(boldItalic);

		// Create a panel and put the text and the radio
		// buttons in it; then add the panel to the frame
		JPanel radioPanel = new JPanel();
		radioPanel.add(text);
		radioPanel.add(plain);
		radioPanel.add(bold);
		radioPanel.add(italic);
		radioPanel.add(boldItalic);
		add(radioPanel, BorderLayout.LINE_START);

		// Register the event handlers 
		plain.addItemListener(this);
		bold.addItemListener(this);
		italic.addItemListener(this);
		boldItalic.addItemListener(this);

		// Create the fonts
		plainFont = new Font("Serif", Font.PLAIN, 16);
		boldFont = new Font("Serif", Font.BOLD, 16);
		italicFont = new Font("Serif", Font.ITALIC, 16);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 16);

	} // End of the constructor for RadioB
	
	// The event handler
	public void itemStateChanged(ItemEvent e) {

		// Determine which button is on and set the font 
		// accordingly
		if (plain.isSelected())
			text.setFont(plainFont);
		else if (bold.isSelected())
			text.setFont(boldFont);
		else if (italic.isSelected())
			text.setFont(italicFont);
		else if (boldItalic.isSelected())
			text.setFont(boldItalicFont);
	} // End of itemStateChanged 

	// The main method
	public static void main(String[] args) {
		// Create the window frame
		JFrame myFrame = new JFrame(" Radio button example");
		// Create the content pane and set it to the frame
		JComponent myContentPane = new RadioB();
		myContentPane.setOpaque(true);
		myFrame.setContentPane(myContentPane);
		// Display the window.
		myFrame.pack();
		myFrame.setVisible(true);
	}
	

} // End of RadioB 