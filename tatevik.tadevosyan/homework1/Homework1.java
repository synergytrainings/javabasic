/**
 * 
 */
//package com.synisys.trainings;

/**
 * @author Tatevik.Tadevosyan
 *
 */
public class Homework1 {

	boolean isEqual(String a, String b) {

		if (a == b) {
			return true;
		}

		else if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {

					return false;
				}

			}

			return true;

		}

	}

	public static void main(String[] args) {
		Homework1 hw = new Homework1();
		System.out.println(hw.isEqual("aaaa", "aaa"));

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(hw.isEqual(str1, str2));

	}

}
