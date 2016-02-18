package text;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class UndoAction extends AbstractAction {

	Notepad notepad;

	public UndoAction(Notepad notepad) {
		this.notepad = notepad;
	}

	public void actionPerformed(ActionEvent e) {
		notepad.undo.undo();
	}
}
