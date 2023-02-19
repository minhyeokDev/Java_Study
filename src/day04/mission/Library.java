package day04.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    int getNumber(int number) { //책 번호 출력
        String name = books.get(number).BookName();
        if (name.equals("클린코드(Clean Code)")) {
            return 1;
        } else if (name.equals("객체지향의 사실과 오해")) {
            return 2;

        } else if (name.equals("테스트 주도 개발(TDD)")) {
            return 3;
        }
        return 0;
    }


    String getName(int number) { //책 이름 출력
        return books.get(number).BookName();
    }

    String getStatus(int number) { //책 대여 상태 출력
        return books.get(number).BookStatus();
    }

    boolean getBorrow(int number) { // 책 대여 작동
        int renumber = number - 1;
        return books.get(renumber).BookBorrow();
    }
}