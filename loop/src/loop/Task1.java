package loop;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("数字を入力してください：");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		System.out.println(a);



        int sum =a;

		for(int i = 1; i<a; i++){
          sum += i;
		}


		System.out.println("1〜"+a+"までの合計:"+sum);



	}

}
