package model;

public class Note_M {
	
	public Note_M(int string, int fret) {
		super();
		this.string = string;
		this.fret = fret;
	}
	private int string;//弦号
	private int fret;//品格
	public int getString() {
		return string;
	}
	public void setString(int string) {
		this.string = string;
	}
	public int getFret() {
		return fret;
	}
	public void setFret(int fret) {
		this.fret = fret;
	}
}
