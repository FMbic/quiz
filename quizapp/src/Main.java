import java.util.Scanner;

/*
1. add questions
2. add answers
3. add correct answers
4. link correct ones to the questions
 */

public static void main (String[] args)
{
    Scanner answer = new Scanner(System.in);
    int correctAnswer = 0;

    mapper obj = new mapper();

    for(int i = 0; i < obj.questions.length; i++)
    {
        System.out.println(i +" "+ obj.questions[i]);
        for (int j = 0; j < obj.options[i].length; j++) {
            System.out.print(obj.options[j]);
        }

    }


}