import java.awt.*;
import javax.swing.*;


public class Window extends JFrame{
	final int Width = 400;
	final int Height = 500;
	Font headlineFont = new Font("Arial", Font.PLAIN, 26);
	
	public Window() {
		super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
	}
	
	private void setupLayout()
    {
        Container     contentPane;

        setSize(300, 300); 

        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        Display display = new Display();
        contentPane.add(display, BorderLayout.NORTH);
        
        Buttons numpad = new Buttons(display);
        contentPane.add(numpad, BorderLayout.CENTER);

        
        // Layout this PINPadWindow
    }
	JFrame myFrame = new JFrame("Calculator");
	JPanel myPanel = new JPanel();
	
	
	
	
	
	

	
	


}
