import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Display extends JLabel implements ActionListener{
	private String data;
	private static final Font TEXT_FONT = new Font("Lucida Grande", Font.BOLD, 15);

	//////////////////////////////////////////////////////////////
	// For the math portions, create methods below and use them in the event handler 
	//////////////////////////////////////////////////////////////
	
	public Display() {
		super(" ", SwingConstants.RIGHT);
		setBorder(BorderFactory.createEtchedBorder());
		setFont(TEXT_FONT);
		data = "";
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		
		if (input.equals("+")) {
			// insert add code here
			
		}
		else if (input.equals("-")){
			// insert subtract code
		}
		else if (input.equals("X")) {
			// insert mult
		}
		else if (input.equals("/")) {
			// insert div
		}
		else if(input.equals("EXP")) {
			// insert for exponent
		}
		else if(input.equals("\u221A")) {
			// insert for sqrt
		}
		else if(input.equals("1/\u0078")) {
			// insert for inverse
			// Pressing +/ does not change display to "test"
			//will look further into issue
			setText("test");
			
		}
		else if(input.equals("Log")) {
			// insert code for log
		}
		else if(input.equals("sin")) {
			// insert for sin
		}
		else if(input.equals("cos")) {
			// insert for cos
		}
		else if(input.equals("tan")) {
			// insert for tan
		}
		else if(input.equals("+/-")) {
			// insert for change sign
		}
		else if(input.equals("(")) {
			// insert for parenthesis
		}
		else if(input.equals(")")) {
			// insert for parenthesis
		}
		else if (input.equals("Clear")) {
			// insert clear code USING a different method below
			Clear();
		}
		else if(input.equals("Enter")) {
			// insert code for enter
		}
		else if (input.equals("ANS")) {
			// insert code for ANS
		}
		else if (input.equals("\u232B")) {
			// insert code for
		}
		else {
			data = input;
			setText(getText() + data);
		}
		
	}
	
	
	public void Clear() {
		// write method for clear
		setText(" ");
		
	}
}
	
	

