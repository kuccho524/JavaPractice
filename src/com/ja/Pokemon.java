package com.ja;

/**
 * 
 * 入力値を元に種族値を計算する
 * @author kuccho524
 *
 */

public class Pokemon {
	public static void main(String[] args) {
		
		// int型を持つ各種族値の変数を宣言する
		System.out.print("HP種族値を入力してください：");
		int hp = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("攻撃種族値を入力してください：");
		int a = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("防御種族値を入力してください：");
		int b = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("特攻種族値を入力してください：");
		int c = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("特防種族値を入力してください：");
		int d = new java.util.Scanner(System.in).nextInt();
		
		System.out.print("素早さ種族値を入力してください：");
		int s = new java.util.Scanner(System.in).nextInt();
		
		int total = hp + a + b + c + d + s;
		System.out.print("合計種族値は" + total + "です");
	}

}
