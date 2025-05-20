package com.mjc.mjc813.cal;

import java.util.Scanner;

public class BankApplication {
    private Account[] accounts = new Account[100];

    public int findAccountIndex(String accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber().equals(accountNumber)) {
                return i;
            }
        }
        return -1;
    }

    public void addAccount(String accountNumber, String accountName, int balance) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNumber, accountName, balance);
                break;
            }
        }
    }

    public void printAccounts() {
        for ( int i = 0; i < this.accounts.length; i++ ) {
            if( this.accounts[i] != null ) {
                System.out.printf("%s \t %s \t %d \n"
                        , this.accounts[i].getAccountNumber()
                        , this.accounts[i].getAccountName()
                        , this.accounts[i].getBalance()
                );
            }
        }
    }

    public void deposit(String accountNumber, int money) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            accounts[index].addMoney(money);
        }
    }

    public void draw(String accountNumber, int money) {
        int index = findAccountIndex(accountNumber);
        if (index != -1) {
            accounts[index].subMoney(money);
        }
    }



    // 메인 실행
    public static void main(String[] args) {
        BankApplication bank = new BankApplication();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택> ");
            String a = scanner.nextLine();

            switch (a) {
                case "1":
                    System.out.print("계좌번호: ");
                    String number = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(scanner.nextLine());
                    bank.addAccount(number, name, balance);
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;

                case "2":
                    bank.printAccounts();
                    break;

                case "3":
                    System.out.print("계좌번호: ");
                    String depNum = scanner.nextLine();
                    System.out.print("예금액: ");
                    int depBalance = Integer.parseInt(scanner.nextLine());
                    bank.deposit(depNum, depBalance);
                    System.out.println("결과: 예금이 성공되었습니다.");

                    break;

                case "4":
                    System.out.print("계좌번호: ");
                    String drawAccNum = scanner.nextLine();
                    System.out.print("출금액: ");
                    int drawMoney = Integer.parseInt(scanner.nextLine());
                    bank.draw(drawAccNum, drawMoney);
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;

                case "5":
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}