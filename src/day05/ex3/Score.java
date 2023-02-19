package day05.ex3;

import java.util.Scanner;

public class Score {

    private int generation; // 기수
    private int html;
    private int css;
    private int javascript;

    private double average; //세과목의 평균
    private int max; // 세 과목 중 최고점
    private int min; // 세 과목 중 최저점


    void inputGeneration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 기인지 입력해주세요.");
        this.generation = scanner.nextInt();
    }

    void inputHtml() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTML 과목 점수를 입력해주세요.");
        this.html = scanner.nextInt();
    }

    void inputCss() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CSS 과목 점수를 입력해주세요.");
        this.css = scanner.nextInt();
    }

    void inputJavaScript() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Javascript 과목 점수를 입력해주세요.");
        this.javascript = scanner.nextInt();
    }


    void calculateAverage() {
        this.average = (double) (this.html + this.css + this.javascript) / 3;
    }

    void printDetails1() { // 1,2기에 해당하는 불/합 출력
        if (this.average >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    void printDetails2() { //3기에 해당하는 불/합 출력
        if (this.average >= 70) {
            System.out.print("합격입니다.");
        } else if ((this.html == 100 && this.css == 100) || (this.html == 100
            && this.javascript == 100) || (this.css == 100 && this.javascript == 100)) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    void printResult() {

        if (this.generation == 1 || this.generation == 2) {
            printDetails1();
        } else if (this.generation == 3) {
            printDetails2();
        }
    }

    void printScoreMax() {
        if (this.html >= this.css && this.html >= this.javascript) {
            this.max = this.html;
        } else if (this.css >= this.html && this.css >= this.javascript) {
            this.max = this.css;
        } else if (this.javascript >= this.html && this.javascript >= this.css) {
            this.max = this.javascript;
        }
        System.out.println("전체 과목 중 최고점은 " + this.max + "점 입니다.");
    }

    void printScoreMin() {
        if (this.html <= this.css && this.html <= this.javascript) {
            this.min = this.html;
        } else if (this.css <= this.html && this.css <= this.javascript) {
            this.min = this.css;
        } else if (this.javascript <= this.html && this.javascript <= this.css) {
            this.min = this.javascript;
        }
        System.out.println("전체 과목 중 최저점은 " + this.min + "점 입니다.");

    }

    void printScoreAverage() {
        System.out.println(
            "전체 과목의 평균은 " + this.average + "점 입니다.");
    }
}
