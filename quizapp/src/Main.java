import java.util.Scanner;

public static void main (String[] args)
{
    Scanner answer = new Scanner(System.in);
    int correctAnswer = 0;
    int guess;
   mapper qe = new mapper();

   for (questions qu : qe.allQuestions)
   {
       System.out.println(qu);
   }

    //System.out.println(q1.getQuestion()+"\n"+ q1.getOptions());
    //answer.nextLine();

}