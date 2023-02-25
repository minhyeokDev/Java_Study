package day07.mission;

import java.util.Scanner;

public class Member {

    private int age;
    private String email;
    private String name;

    public Member(){

    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
