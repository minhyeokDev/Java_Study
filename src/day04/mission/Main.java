package day04.mission;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(Arrays.asList(
            new Book("클린코드(Clean Code)"),
            new Book("객체지향의 사실과 오해"),
            new Book("테스트 주도 개발(TDD)")
        ));

        for (; ; ) {
            System.out.println("대여할 책의 번호를 입력하세요.");
            System.out.println(
                library.getNumber(0) + ". " + library.getName(0) + " - " + library.getStatus(0));
            System.out.println(
                library.getNumber(1) + ". " + library.getName(1) + " - " + library.getStatus(1));
            System.out.println(
                library.getNumber(2) + ". " + library.getName(2) + " - " + library.getStatus(2));
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (num == 1) {
                library.getBorrow(num);
            } else if (num == 2) {
                library.getBorrow(num);
            } else if (num == 3) {
                library.getBorrow(num);
            } else {
                System.out.println("존재하지 않는 도서 입니다. 다시 입력해주세요.");
            }
        }
    }
}