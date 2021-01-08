package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("数字を入力してください：");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		System.out.println(a);

        int keta =0;
        while(a >0) {a=a/10;
        keta ++;}

    System.out.println("桁数："+keta);



	}

}
