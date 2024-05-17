package proj;

import java.util.Scanner;

public class lsb20230857_mid2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String my,com;
		int heart = 100;
	
		
		System.out.println("가위바위보를 돈을 벌어보자! (가위:85원,바위:38원,보:55원) 100원을 0원으로 만들면 통장에 100원 입금된다.");
		
		while(heart>0) {
			
			System.out.print("가위 바위 보:");
			my = s.next();
			
			switch(my) {
			case "가위":
				System.out.println("가위를 내셨군요! 85을 받을까요?");
				break;
			case "바위":
				System.out.println("바위를 내셨군요! 38을 받을까요?");
				break;
			case "보":
				System.out.println("보를 내셨군요! 55을 받을까요?");
				break;
			}
		
		String[] hands = {"가위", "바위", "보"};
		
		int random = (int) (Math.random()*3);
//		System.out.println("random:" +random);
		com = hands[random];
		System.out.println("컴퓨터:"+ com);
		
			if((my.equals("바위")&& com.equals("바위"))||(my.equals("가위")&& com.equals("가위"))||(my.equals("보")&& com.equals("보"))) {
				System.out.println("당신는 컴퓨터의 운명이기에 차감도 증감도 하지 않습니다. 현재 코인"+heart+"원 입니다.");
			} else if(my.equals("바위")&& com.equals("보")){
				heart-=38;
				System.out.println("아쉽게도 코인을 받지 못합니다. 현재 코인에서"+ heart +"원 남았습니다.");
			} else if(my.equals("바위")&& com.equals("가위")){
				heart +=38;
				System.out.println("축하합니다. 코인을 해득하였습니다. 현재 코인에서"+ heart +"원 남았습니다.");
			} else if(my.equals("가위")&& com.equals("바위")){
				heart -=85;
				System.out.println("아쉽게도 코인을 받지 못합니다. 현재 코인에서"+ heart +"원 남았습니다.");
			} else if(my.equals("가위")&& com.equals("보")) {
				heart +=85;
				System.out.println("축하합니다. 코인을 해득하였습니다. 현재 코인에서"+heart+"원 남았습니다.");
			} else if(my.equals("보")&& com.equals("가위")) {
				heart -=55;
				System.out.println("아쉽게도 코인을 받기 못합니다. 현재 코인에서"+heart+"원 남았습니다.");
			} else if (my.equals("보")&& com.equals("바위")) {
				heart +=55;
				System.out.println("축하합니다. 코인을 해득하였습니다. 현재 코인에서"+heart+"원 남았습니다.");
			}
			
			if(heart<=0) {
				break;
				}
	}
			System.out.println("현재 코인이 0원입니다.게임에서 승리 하셨습니다.");
			System.out.println("님 아이디로 100원 입력도었습니다.");
	}
}
