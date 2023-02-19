package day04.mission;

public class Book {

    private String name;
    private boolean isBorrowed; //대여 중인지 아닌지

    Book(String name) { //생성자
        this.name = name;
        this.isBorrowed = false; // 대여X 인 상태 false
    }

    boolean BookBorrow() // 책 대여 시스템
    {
        //if(this.number == number) {
        if (this.isBorrowed == false) {
            System.out.println("정상적으로 대여가 완료되었습니다.");
            return this.isBorrowed = true; //대여 완료 후 책 대여 불가 상태(true)로 return
        } else if (this.isBorrowed == true) {
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
            return this.isBorrowed = true; //반납 시스템은 없으므로 true 하고 끝
        }
        return true;
    }

    String BookStatus() { //대여 상태 확인 함수
        if (this.isBorrowed == false) {
            return "대여 가능";
        } else {
            return "대여 중";
        }
    }

    String BookName() { //책 이름 확인
        return this.name;
    }
}
