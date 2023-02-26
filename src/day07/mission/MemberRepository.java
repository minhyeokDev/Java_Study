package day07.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

    private List<Member> members = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add(Member member) {
        this.members.add(member);
    }

    public void searchMemberName(String name) {
        for (Member member : this.members) {
            if (member.getName().equals(name)) {
                if (member.getClass() != Member.class) {
                    System.out.println(
                        member.getName() + "님은 VIP 회원이고, 이메일은 " + member.getEmail()
                            + "이고, 나이는 " + member.getAge() + "살입니다.");
                } else {
                    System.out.println(
                        member.getName() + "님은 일반 회원이고, 이메일은 " + member.getEmail()
                            + "이고, 나이는 " + member.getAge() + "살입니다.");
                }
                return;
            }
        }
        throw new IllegalArgumentException("등록되지 않은 회원입니다.");

    }

    public void checkDuplicateEmail(String email) {
        for (Member member : this.members) {
            if (member.getEmail().equals(email)) {
                throw new IllegalArgumentException("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
            }
        }
    }
}
