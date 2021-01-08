package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("正の整数を入力してください：");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		System.out.println(a);
		System.out.print(a+"の約数：");

		for(int i = 1; i<= a; i++){
	        if(a % i == 0) {


		System.out.print(i+",");

     }

	}
	}
}
