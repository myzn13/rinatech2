package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		System.out.println("1から5までの数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		sc.close();



		if (numA==1) {
			System.out.print(numA+"→Ⅰ");
		}else if (numA==2) {
			System.out.print(numA+"→II");
		}else if (numA==3) {
				System.out.print(numA+"→Ⅲ");
		}else if (numA==4) {
			System.out.print(numA+"→Ⅳ");
		}else if (numA==5) {
			System.out.print(numA+"→Ⅴ");
		}else {
			System.out.print(numA+"→unknown");
		}


	}

}
