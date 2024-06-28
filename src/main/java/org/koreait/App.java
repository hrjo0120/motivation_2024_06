package org.koreait;

import org.koreait.motivation.controller.MotivationController;
import org.koreait.motivation.entity.Motivation;
import org.koreait.system.controller.SystemController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {   //생성자 = 객체 생성될때 자동실행되는 메소드
        this.sc = sc;

    }

    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController(sc);



        int lastId = 0; // 몇 번까지 썼더라?
        List<Motivation> motivations = new ArrayList<>(); // motivation 저장소

        while (true) {
            System.out.print("command) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어를 입력해주세요.");
                continue;
            }

            // 기능
            if (cmd.equals("add")) {
                motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            }
        }
    }
}
