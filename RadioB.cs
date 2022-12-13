// RadioB.cs
// An example to illustrate event handling with 
// interactive radio buttons that control the font 
// style of a string of text
namespace RadioB {
	
	using System;
	using System.Drawing;
	using System.Windows.Forms;
	
	public class RadioB : Form {
		
		private Label text = new Label();
		private RadioButton plain = new RadioButton();
		private RadioButton bold = new RadioButton();
		private RadioButton italic = new RadioButton();
		private RadioButton boldItalic = new RadioButton();
		// Constructor for RadioB
		public RadioB() {
			// Init ialize the attributes of the text and radio
			// buttons
			text.AutoSize = true;
			text.Text = "In what font style should I appear?";
			plain.Location = new Point(220,0);
			plain.Text = "Plain";
			plain.Checked = true;
			bold.Location = new Point(350, 0);
			bold.Text = "Bold";
			italic.Location = new Point(480, 0);
			italic.Text = "Italics";
			boldItalic.Location = new Point(610, 0);
			boldItalic.Text = "Bold/Italics";
			// Add the text and the radio buttons to the form
			Controls.Add(text);
			Controls.Add(plain);
			Controls.Add(bold);
			Controls.Add(italic);
			Controls.Add(boldItalic);
			// Register the event handler for the radio buttons
			plain.CheckedChanged += 
				new EventHandler(rb_CheckedChanged);
			bold.CheckedChanged += 
				new EventHandler(rb_CheckedChanged);
			italic.CheckedChanged += 
				new EventHandler(rb_CheckedChanged);
			boldItalic.CheckedChanged += 
				new EventHandler(rb_CheckedChanged);
		}
		
		// The main method is where execution begins
		static void Main() {
			Application.EnableVisualStyles();
			Application.SetCompatibleTextRenderingDefault(false);
			Application.Run(new RadioB());
		}
		
		// The event handler
		private void rb_CheckedChanged(object o, EventArgs e) {
			// Determine which button is on and set the font 
			// accordingly
			if (plain.Checked)
				text.Font = 
					new Font(text.Font.Name, text.Font.Size,
						FontStyle.Regular);
			if (bold.Checked)
				text.Font =
					new Font( text.Font.Name, text.Font.Size, 
						FontStyle.Bold);
			if (italic.Checked)
				text.Font = 
					new Font( text.Font.Name, text.Font.Size, 
						FontStyle.Italic);
			if (boldItalic.Checked)
				text.Font = 
					new Font( text.Font.Name, text.Font.Size, 
						FontStyle.Italic ^ FontStyle.Bold);
		} // End of radioButton_CheckedChanged

	} // End of RadioB
	
}
