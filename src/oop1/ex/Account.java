package oop1.ex;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    int balance = 0;

    void deposit() {
        System.out.print("입금할 금액 : ");
        int amount = sc.nextInt();
        balance += amount;
    }

    void withdraw() {
        System.out.print("출금할 금액 : ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void print() {
        System.out.println("현재 잔액 : " + balance);
    }

    void loop() {
        while (true) {
            System.out.println("1.입금 2.출금 3.잔액확인 4.종료");
            int choice = sc.nextInt();
            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                print();
            } else if (choice == 4) {
                System.out.println("종료...");
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다");
            }
        }
    }
}


