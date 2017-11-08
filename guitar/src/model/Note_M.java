package model;

/**
 * 
 * @author da0ke
 *
 */
public class Note_M {
	
	public Note_M(int stringNum, String mark) {
		this.stringNum = stringNum;
		this.mark = mark;
	}
	private int stringNum;
	private String mark;
	/**
	 * @return the stringNum
	 */
	public int getStringNum() {
		return stringNum;
	}
	/**
	 * @param stringNum the stringNum to set
	 */
	public void setStringNum(int stringNum) {
		this.stringNum = stringNum;
	}
	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	
}
