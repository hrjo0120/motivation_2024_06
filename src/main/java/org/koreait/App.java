package org.koreait;

import java.util.Scanner;

public class App {
    private Scanner sc;
    private int id;

    public App(Scanner sc) {   //생성자 = 객체 생성될때 자동실행되는 메소드
        this.sc = sc;

    }

    public void run() {
        System.out.println("== motivation 실행 ==");
        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();


            if (cmd.equals("exit")) {
                System.out.println("== motavation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요.");
                continue;
            }

            // 기능
            if (cmd.equals("add")) {
                id++;
                System.out.print("motivation : ");
                String motivation = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록 되었습니다.\n", this.id);
            }
        }

    }


}
