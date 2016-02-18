package text;

public class Actions {

	Notepad n;

	public Actions(Notepad n) {
		this.n = n;
	}

	public void cut() {
		n.getTextComponent().cut();
	}
	
	public void copy() {
		n.getTextComponent().copy();
	}
	
	 public void paste(){
	     n.getTextComponent().paste();
	}
}
