package cn.guitar.util;

public class MyConst {
	
	
	
	
	public static int TYPE_TONE = 1;
	public static int TYPE_SECTION = 2;
	public static int TYPE_LOOP = 3;
	

	public static int MARK_X = -1;
	public static int MARK_O = -2;
	public static int MARK_0 = 0;
	public static int MARK_1 = 1;
	public static int MARK_2 = 2;
	public static int MARK_3 = 3;
	public static int MARK_4 = 4;
	public static int MARK_5 = 5;
	
	public static int getMarkValue(CharSequence mark) {
		int result;
		
		if("x".equals(mark)) {
			result = MARK_X;
		} else if("o".equals(mark)) {
			result = MARK_O;
		} else if("0".equals(mark)) {
			result = MARK_0;
		} else if("1".equals(mark)) {
			result = MARK_1;
		} else if("2".equals(mark)) {
			result = MARK_2;
		} else if("3".equals(mark)) {
			result = MARK_3;
		} else if("4".equals(mark)) {
			result = MARK_4;
		} else if("5".equals(mark)) {
			result = MARK_5;
		} else {
			result = MARK_0;
		}
		
		
		return result;
	}

}
