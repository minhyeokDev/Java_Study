package day07.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository extends Member {

    private List<Member> members = new ArrayList<>();

    public void add(String email, String name, int age) {

        if (email.equals(this.getEmail())) {
            throw new IllegalArgumentException("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
        } else {
            this.setEmail(email);
            this.setName(name);
            this.setAge(age);
        }
    }

    public void check(String name) {
        if (!name.equals(this.getName())) {
            throw new IllegalArgumentException("등록되지 않은 회원입니다.");
        } else if (name.equals(this.getName())) {
            System.out.println(
                this.getName() + "님의 이메일은 " + this.getEmail() + "이고, 나이는 " + this.getAge()
                    + "살입니다.");
        }
    }
}
