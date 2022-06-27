
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Display extends JLabel implements ActionListener{
	private String data;
	private String sign = null;
	private double num = 0;
	
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
	
	// Convert to integer
	public double toDouble(String text) {
		text = text.replaceAll("\\s", "");
		double number = Double.parseDouble(text);
		return number;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		
		if (input.equals("+")) {
			// example of the first arithmetic
			num = toDouble(getText());
			setText(" ");
			sign = "+";
			
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
			setText(inverseFcn(toDouble(getText())));		// inverse function
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
			setText(changeSign(toDouble(getText())));		// changing signs
		}
		else if(input.equals("(")) {
			// insert for parenthesis
		}
		else if(input.equals(")")) {
			// insert for parenthesis
		}
		else if (input.equals("Clear")) {
			setText(" ");
		}
		else if(input.equals("Enter")) {
			// insert code for enter
			// num (math) then check for sign
			// num (math) toDouble(getText());
			// return the answer
			// example of the first one
			// this may be turned into a switch case
			// use try and catch (NullPointerException)
			if (sign.equals("+")) {
				num = num + toDouble(getText());
				setText(String.valueOf(num));
			}
			
		}
		else if (input.equals(".")) {
			setText(getText() + ".");
		}
		else if (input.equals("\u232B")) {
			// backspace
			try {
			setText(getText().substring(0, getText().length()-1));
			}
			catch(StringIndexOutOfBoundsException SE) {
				setText(" ");
			}
		}
		else {
			data = input;
			setText(getText() + data);
		}
		
	}
	
	//changing signs
	public String changeSign(double number) {
		number = number * -1;				// change to negative
		return String.valueOf(number);		// return as string
	}
	
	public String inverseFcn(double number) {
		number = 1/number;					// inverse
		return String.valueOf(number);		// return as string
	}


}
	
	

