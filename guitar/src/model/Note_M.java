package model;

import cn.guitar.util.Fret;

public class Note_M {
	
	public Note_M(int string, Fret fret) {
		super();
		this.string = string;
		this.fret = fret;
	}
	private int string;
	private Fret fret;
	public int getString() {
		return string;
	}
	public void setString(int string) {
		this.string = string;
	}
	public Fret getFret() {
		return fret;
	}
	public void setFret(Fret fret) {
		this.fret = fret;
	}
	
	
}
