package text;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;

public class Notepad extends JFrame {
    public Actions actions = new Actions(this);
    private JTextPane textPane;
    
    UndoManager undo = new UndoManager();
    UndoAction undoAction = new UndoAction(this);

    public Notepad () {
    	textPane = new JTextPane();
    	getContentPane().add(textPane); 
    }
    
    public JTextComponent getTextComponent() {
    	return textPane;
    }
}