//package MBTITest;
//
//import java.util.Scanner;
//
//public class PersonalityCollector {
//
//    private String name;
//
//
//    Scanner collector = new Scanner(System.in);
//
//
//    public String [] [] ExtrovertedVsIntroverted(){
//
//        System.out.println("What is your name? ");
//        name = collector.nextLine();
//
//        String [] [] options = { {"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"},
//                {"A. more outgoing, think out loud", "B. more reserved, think to yourself"},
//                {"A. seek many tasks, public activities, interaction with others",
//                        "B. seek private, solitary activities with quiet to concentrate"},
//                {"A. external, communicative, express yourself", "B. internal, reticent,keep to yourself"},
//                {"A. active, initiate", "B. reflective, deliberate"}, };
//
//        String [] [] choicesMade = new String[5][2];
//
//        for (int populating = 0; populating < options.length; populating++){
//
//            System.out.println(options [populating] [0] + "\t" + options [populating] [1]);
//
//            String columnOne = options [populating] [0];
//
//            String columnTwo = options [populating] [1];
//
//            System.out.println(" Enter A or B as you feel about yourself");
//            String userInput = collector.next();
//
//            if (!userInput.equalsIgnoreCase("A") || !userInput.equalsIgnoreCase("B")){
//
//                System.out.println(" Expected A or B as Response" + "\n" + "I know this is an error , " +
//                        "please pick A or B as you feel about yourself");
//                userInput = collector.next();
//            }
//
//            if (userInput.equalsIgnoreCase("A")) {
//
//                choicesMade[populating][0] = "A";
//                choicesMade[populating][1] = columnTwo;
//            }
//
//                else {
//
//                    choicesMade [populating] [0] = "B";
//                    choicesMade [populating] [1] = columnTwo;
//
//                }
//            }
//
//        }
//    }
//}
