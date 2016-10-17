package com.feicuiedu.java.StringDemo;

public class Split {
	public static void main(String[] args) {
		String words = "长亭外 古道边 芳草碧连天 晚风扶 柳" + "笛声残 夕阳山外山";
		String[] printword = new String[100];
		System.out.println("***原歌词格式" + "***\n" + words);
		System.out.println("\n***拆分后歌词格式***");
		printword = words.split(" ");
		for (int i = 0; i < printword.length; i++) {
			System.out.println(printword[i]);
		}
	}
}
