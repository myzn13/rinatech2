package branch;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		sc.close();

		if(numA%numB<0){
			System.out.println(numB+"は"+numA+"の約数です。");
		}else if (numA%numB>=0) {
			System.out.println(numB+"は"+numA+"の約数ではありません。");
		}else {
			System.out.println("正の数を入力して下さい。");
		}

    }
}