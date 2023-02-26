package day07.mission;

public class VIPMember extends Member {

    private int ptCount;

    public VIPMember(String email, String name, int age, int ptCount) {
        super(email, name, age);
        this.ptCount = ptCount;
    }

    public int getPtCount() { // PT 횟수를 출력하기 위한 함수
        return this.ptCount;
    }
}