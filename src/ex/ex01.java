﻿package ex;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021029 汪元浩
 */
import java.util.*;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v = scn.nextInt();
		t2(v);

	}

	public static void t2(int v) {
		int t = 0,o=v;
		while (o > 0) {
			t++;
			o/=2;
		}
		int n[] = new int[t];
		for (int i = t - 1; i >= 0; i--) {
			n[i] = v % 2;
			v /= 2;
		}
		for (int i = 0; i < t; i++) {
			System.out.print(n[i]);
		}
		System.out.println();
	}

}
