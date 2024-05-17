package proj;

import java.util.Scanner;

public class lsb20230857_mid1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String My,Com;
		
		while (true) {
		System.out.print("가위 바위 보:");
		My = s.next();
		
		if (My.equals("그만")) {
			System.out.println("게임을 종료합니다.");
			break;
		}
		
		String[] hands = {"가위", "바위", "보"};
		
		int randomNumber = (int) (Math.random()* 3);
//		System.out.println("randomNumber:" +randomNumber);
		Com = hands[randomNumber];
		
		System.out.println("컴퓨터:"+ Com);
		
		if (My.equals("가위")&& Com.equals("보")) {
			System.out.println("이겼습니다.");
		}else if (My.equals("가위")&& Com.equals("바위")) {
			System.out.println("졌습니다.");
		}else if (My.equals("가위")&& Com.equals("가위")) {
			System.out.println("비겼습니다.");
		}
			
		if (My.equals("바위")&& Com.equals("보")) {
			System.out.println("졌습니다.");
		}else if (My.equals("바위")&& Com.equals("바위")) {
			System.out.println("비겼습니다.");
		}else if (My.equals("바위")&& Com.equals("가위")) {
			System.out.println("이겼습니다.");
		}
			
		if (My.equals("보")&& Com.equals("보")) {
			System.out.println("비겼습니다.");
		}else if (My.equals("보")&& Com.equals("바위")) {
			System.out.println("이겼습니다.");
		}else if (My.equals("보")&& Com.equals("가위")) {
			System.out.println("졌습니다.");
		}
		System.out.println("게임을 종료하고 싶으면 '그만' 이라고 입력하시오");
	}
		s.close();
	}
}
