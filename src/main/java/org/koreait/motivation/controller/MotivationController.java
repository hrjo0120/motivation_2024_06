package org.koreait.motivation.controller;

import org.koreait.Container;
import org.koreait.motivation.entity.Motivation;

import java.util.ArrayList;
import java.util.List;

public class MotivationController {

    int lastId;
    List<Motivation> motivations;

    public MotivationController() {
        lastId = 0;
        motivations = new ArrayList<>();
    }

    public void add() {
        int id = lastId + 1;
        System.out.print("body : ");
        String body = Container.getScanner().nextLine();
        System.out.print("source : ");
        String source = Container.getScanner().nextLine();

        Motivation motivation = new Motivation(id, body, source);

        motivations.add(motivation);

        System.out.printf("%d번 motivation이 등록 되었습니다\n", id);
        lastId++;   // 마지막 번호 증가
    }

    public void list() {
        if (motivations.size() == 0) {
            System.out.println("등록된 motivation 없음");
            return;
        }
        System.out.println("== motivation list ==");
        System.out.printf("  id   //   source   //   body  \n");
        System.out.println("=".repeat(35));

        for (int i = motivations.size()-1; i >= 0; i--) {
            Motivation motivation = motivations.get(i);

            if (motivation.getSource().length() > 7) {
                System.out.printf("   %d  //    %s    //    %s  \n", motivation.getId(), motivation.getSource().substring(0, 5) + "...", motivation.getBody());
                continue;
            }

            System.out.printf("   %d  //    %s    //    %s  \n", motivation.getId(), motivation.getSource(), motivation.getBody());
        }
    }

    public void delete(String cmd) {
        String id = cmd.substring(10);
//        Integer.parseInt(id);
//        motivations.remove(id);

        System.out.printf("%s번 motivation이 삭제 되었습니다\n", id);

        // 입력된 id 값과 리스트에 있는값이 일치할때 삭제.
//        System.out.println("삭제할 motivation의 id 값을 입력해주세요. ");
//        System.out.print("id=");
//        int id = Container.getScanner().nextInt();
//        Motivation motivation = motivations.get(id);
//
//        if(id.equals(motivation)) {
//            motivations.remove(id);
//        }
//        System.out.printf("%d번 motivation이 삭제 되었습니다\n", id);

    }
}
