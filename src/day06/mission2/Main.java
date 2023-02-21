package day06.mission2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isContinued = true;
        while (isContinued) {
            System.out.println("휴대폰 번호를 입력해주세요. ");
            String input = scanner.nextLine();
            try {
                PhoneNumber phoneNumber = new PhoneNumber(input);
                System.out.println(
                    "휴대폰 번호를 정상적으로 입력하셨습니다. 입력하신 휴대폰 번호는 " + phoneNumber.getPhoneNumberFormally()
                        + "입니다.");
                isContinued = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
