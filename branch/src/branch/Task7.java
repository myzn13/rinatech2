package branch;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【日曜、月曜、火曜、水曜、木曜、金曜、土曜】");

		 Scanner sc = new Scanner(System.in);
		 String day = sc.nextLine();






		if(day=="土曜"){
			System.out.println("土曜は午前診療のみです");
		}else if (day=="日曜"){
			System.out.println("日曜は休診です");
		}else if(day=="月曜"){
			System.out.println("午前診療と午後診療があります");
		}else if(day=="火曜"){
			System.out.println("午前診療と午後診療があります");
		}else if(day=="水曜"){
			System.out.println("午前診療と午後診療があります");
		}else if(day=="木曜"){
			System.out.println("午前診療と午後診療があります");
		}else if(day=="金曜"){
			System.out.println("午前診療と午後診療があります");
		}else
		{
			System.out.println("入力を確認してください");
		}

		sc.close();
}

}