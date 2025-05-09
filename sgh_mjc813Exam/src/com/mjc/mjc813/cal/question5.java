package com.mjc.mjc813.cal;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner 객체 생성
        Label: while (true){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            switch (in.nextLine()){
                case "1":
                    System.out.println("선택> 1");
                    System.out.println("예금액> "+in.nextLine());
                    break;
                case "2":
                    System.out.println("선택> 2");
                    System.out.println("출금액> "+in.nextLine());
                    break;
                case "3":
                    System.out.println("선택> 3");
                    System.out.println("잔고> "+in.nextLine());
                    break;
                case "4":
                    System.out.println("선택> 4");
                    System.out.println("\n프로그램 종료");
                    break Label;
            }
        }
    }
}
