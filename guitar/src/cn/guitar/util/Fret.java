package cn.guitar.util;

/**
 * 品格
 * @author da0ke
 *
 */
public enum Fret {
	Empty,Zero,First,Second,Third,Fourth,Fifth;

	@Override
	public String toString() {
		String result;
		switch (this) {
		case Empty:
			result = "0";
			break;
		case Zero:
			result = "X";
			break;
		case First:
			result = "1";
			break;
		case Second:
			result = "2";
			break;
		case Third:
			result = "3";
			break;
		case Fourth:
			result = "4";
			break;
		case Fifth:
			result = "5";
			break;
		default:
			result = "";
			break;
		}
		return result;
	}
	
	
}
