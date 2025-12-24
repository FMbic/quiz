import java.util.Scanner;

public static void main (String[] args)
{
    Scanner answer = new Scanner(System.in);
    int correctAnswer = 0;
    int guess;
    questions q1 = new questions("Компьютерные сети это сети: ",
            Arrays.asList("1. C коммутацией пакетов","2. C коммутацией каналов"),0);

    System.out.println(q1.getQuestion()+"\n"+ q1.getOptions());
    answer.nextLine();
}