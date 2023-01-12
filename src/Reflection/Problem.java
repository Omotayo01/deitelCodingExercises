package Reflection;

public class Problem {

    public String problemName;

    public ProblemType exactProblem;

    public boolean isSolved;


    public boolean isSolved() {
        return false;
    }

    public void setExactProblem(ProblemType exactProblem) {
        this.exactProblem = exactProblem;
    }

    public ProblemType getProblemName() {
        return exactProblem;
    }
}
