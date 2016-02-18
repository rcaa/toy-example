package text;

import javax.swing.JOptionPane;

public class Actions {

	Notepad n;
	
	String findWord;
	int findIndex;

	public Actions(Notepad n) {
		this.n = n;
	}

	public void cut() {
		n.getTextComponent().cut();
	}

	public void copy() {
		n.getTextComponent().copy();
	}

	public void paste() {
		n.getTextComponent().paste();
	}

	public void find() {
		findWord = JOptionPane.showInputDialog("Type the word to find");
		findIndex = n.getTextComponent().getText().indexOf(findWord);
		if (findIndex == -1) {
		  JOptionPane.showMessageDialog(null,"Word not found");
		} else { 
			// selectFound(); 
		}
		
	}
}
