package Reflection;

import java.util.ArrayList;

public class Person {

    private ArrayList<Problem> problems ;

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public void setProblems(ArrayList<Problem> problems) {
        this.problems = problems;
    }

    public String tellProblem (){

        String ourProblem = "";
        for (Problem wahala : problems){
            if (!wahala.isSolved()){
                ourProblem += wahala.getProblemName() + "\n";
            }
        }
        return ourProblem;
    }

}
