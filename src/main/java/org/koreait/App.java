package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {   //생성자 = 객체 생성될때 자동실행되는 메소드
        this.sc = sc;

    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int lastId = 0;

//        Motivation motivation0 = null;
//        Motivation motivation1 = null;
//        Motivation motivation2 = null;

//        Motivation[] motivations = new Motivation[3];

        List<Motivation> motivations = new ArrayList<>();

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

                Motivation motivation = new Motivation(id, body, source);
//                motivation.id = id;
//                motivation.body = body;
//                motivation.source = source;

                motivations.add(motivation);

//                motivations[id - 1] = motivation;

//                if (motivation.id == 1) {
//                    motivation0 = motivation;
//                } else if (motivation.id == 2) {
//                    motivation1 = motivation;
//                } else if (motivation.id == 3) {
//                    motivation2 = motivation;
//                }

                System.out.printf("%d번 motivation이 등록 되었습니다\n", id);
                lastId++;
            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.println("  id  //   motivation   //  source");
                System.out.println("=".repeat(35));
//                System.out.println(motivation2.toString());
//                System.out.println(motivation1.toString());
//                System.out.println(motivation0.toString());
//                for (Motivation motivation : motivations) {
//                    System.out.println(motivation.toString());
//                }
                if (motivations.size() == 0) {
                    System.out.println("등록된 motivation 없음");
                } else {
                    System.out.println("있음");
                    System.out.println("등록된 motivation 갯수 : " + motivations.size());
                }
            }
        }
    }
}
