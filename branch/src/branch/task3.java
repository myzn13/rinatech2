package branch;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();



		if (a>0) {
			System.out.println("入力された数字は正の数です。");
		}else if (a<0) {
			System.out.println("入力された数字は負の数です。");
		}else {
			System.out.println("入力された数字は0です。");
		}


	}

}
