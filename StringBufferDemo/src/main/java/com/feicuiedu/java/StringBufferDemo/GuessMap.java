package com.feicuiedu.java.StringBufferDemo;

public class GuessMap {
	public static void main(String[] args) {
		/*String str = "abc";
		str.concat("def");
		System.out.println(str);*/

		StringBuffer str = new StringBuffer("abc");
		str.append("def");
		System.out.println(str);

		/*StringBuffer sb = new StringBuffer("疯狂猜图");
		int num = 110;
		StringBuffer sb1 = sb.append("疯狂猜成语");
		System.out.println(sb1);
		StringBuffer sb2 = sb1.append("好玩吗");
		System.out.println(sb2);
		StringBuffer sb3 = sb2.append(num);
		System.out.println(sb3);*/
	}
}
