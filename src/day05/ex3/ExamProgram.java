package day05.ex3;

public class ExamProgram {

    Score score = new Score();

    void execute() {

        score.inputGeneration();
        score.inputHtml();
        score.inputCss();
        score.inputJavaScript();
        score.calculateAverage();
        score.printResult();
        score.printScoreMax();
        score.printScoreMin();
        score.printScoreAverage();
    }
}
