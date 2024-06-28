package org.koreait;

import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {   //생성자 = 객체 생성될때 자동실행되는 메소드
        this.sc = sc;

    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int lastId = 1;

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
                int id = lastId + 1;
                System.out.print("body : ");
                String body = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록 되었습니다\n", lastId);
                lastId++;
            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.println("  id  //   motivation   //  source");
                System.out.println("=".repeat(35));

            }
        }

    }


}
