package text;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

public class Notepad extends JFrame {
    public Actions actions = new Actions(this);
    private JTextPane textPane;

    public Notepad () {
    	textPane = new JTextPane();
    	getContentPane().add(textPane); 
    }
    
    public JTextComponent getTextComponent() {
    	return textPane;
    }
}