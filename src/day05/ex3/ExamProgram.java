package day05.ex3;

public class ExamProgram {

    Score score = new Score();

    void execute() {

        score.getGeneration();
        score.getHtml();
        score.getCss();
        score.getJavaScript();
        score.setAverage();
        score.printResult();
        score.printScoreMax();
        score.printScoreMin();
        score.printScoreAverage();
    }
}
