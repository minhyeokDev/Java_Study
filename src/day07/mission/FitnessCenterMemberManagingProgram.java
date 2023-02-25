package day07.mission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FitnessCenterMemberManagingProgram {


    private int menu;
    Scanner scanner = new Scanner(System.in);

    public void start() {

        Scanner scanner = new Scanner(System.in);
        MemberRepository memberRepository = new MemberRepository();
        while (true) {
            System.out.println("원하시는 번호를 입력해주세요.");
            System.out.println("1. 회원 등록");
            menu = scanner.nextInt();
            try {
                if (menu == 1) {
                    String email = this.receiveEmail(scanner);
                    String name = this.receiveName(scanner);
                    int age = this.receiveAge(scanner);
                    memberRepository.add(email,name,age);
                    System.out.println("회원 등록이 성공적으로 완료되었습니다.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private String receiveEmail(Scanner scanner) {
        System.out.println("이메일을 입력해주세요.");
        return scanner.next();
    }

    private String receiveName(Scanner scanner) {
        System.out.println("이름을 입력해주세요.");
        return scanner.next();
    }

    private int receiveAge(Scanner scanner) {
        System.out.println("나이를 입력해주세요.");
        return scanner.nextInt();
    }

}

