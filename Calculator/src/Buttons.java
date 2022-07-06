import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



public class Buttons extends JPanel{
	
	
	private static final Font BUTTON_FONT = new Font("Lucida Grande", Font.BOLD, 15);
	private static Color AriColor = new Color(235, 152, 52);
	private static Color ClearColor = new Color(152, 171, 163);
	private static Color EnterColor = new Color(116, 171, 227);
	private ActionListener listener;
	
	public Buttons(ActionListener listener) {
		super();
		this.listener = listener;
		setupLayout();
	}
	
	public void addButton(String symbol, Color Background) {
		JButton jbutton = new JButton(symbol);
    	jbutton.setFont(BUTTON_FONT);
    	jbutton.setForeground(Color.WHITE);
    	jbutton.setBackground(Background);
    	add(jbutton);
    	jbutton.addActionListener(listener);
	}
	
	public void setupLayout()
    {
		setLayout(new GridLayout(7,4));	
		
		
		// adding buttons to panel
		addButton("EXP", Color.LIGHT_GRAY);
		addButton("\u221A", Color.LIGHT_GRAY);
		addButton("1/\u0078", Color.LIGHT_GRAY);
		addButton("Log", Color.LIGHT_GRAY);
		addButton("sin", Color.LIGHT_GRAY);
		addButton("cos", Color.LIGHT_GRAY);
		addButton("tan", Color.LIGHT_GRAY);
		addButton("+/-", Color.LIGHT_GRAY);
		addButton("!", Color.LIGHT_GRAY);
		addButton("\u03C0", Color.LIGHT_GRAY);
		addButton("Clear", ClearColor);
		addButton("\u232B", ClearColor);
		addButton("1", Color.DARK_GRAY);
		addButton("2", Color.DARK_GRAY);
		addButton("3", Color.DARK_GRAY);
		addButton("+", AriColor);
		addButton("4", Color.DARK_GRAY);
		addButton("5", Color.DARK_GRAY);
		addButton("6", Color.DARK_GRAY);
		addButton("-", AriColor);
		addButton("7", Color.DARK_GRAY);
		addButton("8", Color.DARK_GRAY);
		addButton("9", Color.DARK_GRAY);
		addButton("X", AriColor);
		addButton("0", Color.DARK_GRAY);
		addButton(".", Color.DARK_GRAY);
		addButton("Enter", EnterColor);
		addButton("/", AriColor);
	
    }
    
}
