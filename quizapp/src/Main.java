import java.util.Scanner;

public static void main (String[] args)
{
    Scanner answer = new Scanner(System.in);
    int correctAnswer = 0;
    int iterationOfQuestions = 1;

//   questions quest = new questions("test-qeestion",Arrays.asList("1","2","3"),0);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number 1 : ");
//        int num1 = scan.nextInt();
//    System.out.println(quest.getQuestion()+"\n"+quest.getOptions());


    mapper mp = new mapper();



        for (int i = 0; i < iterationOfQuestions;i++) {
            int correctAnswerCounter = 0;

            System.out.println(mp.q1.getQuestion() + "\n" + mp.q1.getOptions());
            int guess1 = answer.nextInt();
            guess1--;
            //System.out.println(guess1);
            if (guess1 == mp.q1.getCorrectAnswer()){ correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q2.getQuestion() + "\n" + mp.q2.getOptions());
            int guess2 = answer.nextInt();
            guess2--;
            if (guess2 == mp.q2.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q3.getQuestion() + "\n" + mp.q3.getOptions());
            int guess3 = answer.nextInt();
            guess3--;
            if (guess3 == mp.q3.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q4.getQuestion() + "\n" + mp.q4.getOptions());
            int guess4 = answer.nextInt();
            guess4--;
            if (guess4 == mp.q4.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q5.getQuestion() + "\n" + mp.q5.getOptions());
            int guess5 = answer.nextInt();
            guess5--;
            if (guess5 == mp.q5.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q6.getQuestion() + "\n" + mp.q6.getOptions());
            int guess6 = answer.nextInt();
            guess6--;
            if (guess6 == mp.q6.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q7.getQuestion() + "\n" + mp.q7.getOptions());
            int guess7 = answer.nextInt();
            guess7--;
            if (guess7 == mp.q7.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q8.getQuestion() + "\n" + mp.q8.getOptions());
            int guess8 = answer.nextInt();
            guess8--;
            if (guess8 == mp.q8.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}

            System.out.println(mp.q9.getQuestion() + "\n" + mp.q9.getOptions());
            int guess9 = answer.nextInt();
            guess9--;
            if (guess9 == mp.q9.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}
            /*
            System.out.println(mp.mc10 + "\n" + mp.mc10.getOptions());
            int guess10 = answer.nextInt();
            guess10--;
            if (guess10 == mp.mc10){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}
             */


            System.out.println("Количество правильных ответов "+correctAnswer);
        }

}
