import java.util.Scanner;

public static void main (String[] args)
{
    Scanner answer = new Scanner(System.in);
    int correctAnswer = 0;
    int iterationOfQuestions = 1;

/*
       ArrayList<Integer> lottery = new ArrayList<>(100);
       for (int i = 1; i <= 100; i++) {

           lottery.add(i);//добавляем в барабан числа от 1 до 100
       }

       Collections.shuffle(lottery);
       System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
       for (int i = 0; i < 10; i++) {

           System.out.println(lottery.get(i));
 */


    mapper mp = new mapper();



        for (int i = 0; i < iterationOfQuestions;i++) {
            int correctAnswerCounter = 0;

            System.out.println(mp.q1.getQuestion() + "\n" + mp.q1.getOptions());
            int guess1 = answer.nextInt();
            guess1--;
            //System.out.println(guess1);
            if (guess1 == mp.q1.getCorrectAnswer())
            { correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q1.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q2.getQuestion() + "\n" + mp.q2.getOptions());
            int guess2 = answer.nextInt();
            guess2--;
            if (guess2 == mp.q2.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q2.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q3.getQuestion() + "\n" + mp.q3.getOptions());
            int guess3 = answer.nextInt();
            guess3--;
            if (guess3 == mp.q3.getCorrectAnswer()) {
                correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
            }
            System.out.println("Правильный ответ: "+mp.q3.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q4.getQuestion() + "\n" + mp.q4.getOptions());
            int guess4 = answer.nextInt();
            guess4--;
            if (guess4 == mp.q4.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q4.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q5.getQuestion() + "\n" + mp.q5.getOptions());
            int guess5 = answer.nextInt();
            guess5--;
            if (guess5 == mp.q5.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q5.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q6.getQuestion() + "\n" + mp.q6.getOptions());
            int guess6 = answer.nextInt();
            guess6--;
            if (guess6 == mp.q6.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q6.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q7.getQuestion() + "\n" + mp.q7.getOptions());
            int guess7 = answer.nextInt();
            guess7--;
            if (guess7 == mp.q7.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q7.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q8.getQuestion() + "\n" + mp.q8.getOptions());
            int guess8 = answer.nextInt();
            guess8--;
            if (guess8 == mp.q8.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q8.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q9.getQuestion() + "\n" + mp.q9.getOptions());
            int guess9 = answer.nextInt();
            guess9--;
            if (guess9 == mp.q9.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q9.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );
            /*
            System.out.println(mp.mc10 + "\n" + mp.mc10.getOptions());
            int guess10 = answer.nextInt();
            guess10--;
            if (guess10 == mp.mc10){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;}
             */

            System.out.println(mp.q11.getQuestion() + "\n" + mp.q11.getOptions());
            int guess11 = answer.nextInt();
            guess11--;
            if (guess11 == mp.q11.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q11.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q12.getQuestion() + "\n" + mp.q12.getOptions());
            int guess12 = answer.nextInt();
            guess12--;
            if (guess12 == mp.q12.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q12.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q13.getQuestion() + "\n" + mp.q13.getOptions());
            int guess13 = answer.nextInt();
            guess13--;
            if (guess13 == mp.q13.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q13.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q14.getQuestion() + "\n" + mp.q14.getOptions());
            int guess14 = answer.nextInt();
            guess14--;
            if (guess14 == mp.q14.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q14.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q15.getQuestion() + "\n" + mp.q15.getOptions());
            int guess15 = answer.nextInt();
            guess15--;
            if (guess15 == mp.q15.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q15.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q16.getQuestion() + "\n" + mp.q16.getOptions());
            int guess16 = answer.nextInt();
            guess16--;
            if (guess16 == mp.q16.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q16.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q17.getQuestion() + "\n" + mp.q17.getOptions());
            int guess17 = answer.nextInt();
            guess17--;
            if (guess17 == mp.q17.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q17.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q18.getQuestion() + "\n" + mp.q18.getOptions());
            int guess18 = answer.nextInt();
            guess18--;
            if (guess18 == mp.q18.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q18.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q19.getQuestion() + "\n" + mp.q19.getOptions());
            int guess19 = answer.nextInt();
            guess19--;
            if (guess19 == mp.q19.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q19.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q20.getQuestion() + "\n" + mp.q20.getOptions());
            int guess20 = answer.nextInt();
            guess20--;
            if (guess20 == mp.q20.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q20.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q21.getQuestion() + "\n" + mp.q21.getOptions());
            int guess21 = answer.nextInt();
            guess21--;
            if (guess21 == mp.q21.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q21.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q22.getQuestion() + "\n" + mp.q22.getOptions());
            int guess22 = answer.nextInt();
            guess22--;
            if (guess22 == mp.q22.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q22.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q23.getQuestion() + "\n" + mp.q23.getOptions());
            int guess23 = answer.nextInt();
            guess23--;
            if (guess23 == mp.q23.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q23.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q24.getQuestion() + "\n" + mp.q24.getOptions());
            int guess24 = answer.nextInt();
            guess24--;
            if (guess24 == mp.q24.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q24.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q25.getQuestion() + "\n" + mp.q25.getOptions());
            int guess25 = answer.nextInt();
            guess25--;
            if (guess25 == mp.q25.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q25.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q27.getQuestion() + "\n" + mp.q27.getOptions());
            int guess27 = answer.nextInt();
            guess27--;
            if (guess27 == mp.q27.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q27.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q28.getQuestion() + "\n" + mp.q28.getOptions());
            int guess28 = answer.nextInt();
            guess28--;
            if (guess28 == mp.q28.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q28.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q29.getQuestion() + "\n" + mp.q29.getOptions());
            int guess29 = answer.nextInt();
            guess29--;
            if (guess29 == mp.q29.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q29.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q30.getQuestion() + "\n" + mp.q30.getOptions());
            int guess30 = answer.nextInt();
            guess30--;
            if (guess30 == mp.q30.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q30.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q31.getQuestion() + "\n" + mp.q31.getOptions());
            int guess31 = answer.nextInt();
            guess31--;
            if (guess31 == mp.q31.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q31.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q32.getQuestion() + "\n" + mp.q32.getOptions());
            int guess32 = answer.nextInt();
            guess32--;
            if (guess32 == mp.q32.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q32.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q35.getQuestion() + "\n" + mp.q35.getOptions());
            int guess35 = answer.nextInt();
            guess35--;
            if (guess35 == mp.q35.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q35.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q36.getQuestion() + "\n" + mp.q36.getOptions());
            int guess36 = answer.nextInt();
            guess36--;
            if (guess36 == mp.q36.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q36.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q37.getQuestion() + "\n" + mp.q37.getOptions());
            int guess37 = answer.nextInt();
            guess37--;
            if (guess37 == mp.q37.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q37.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q38.getQuestion() + "\n" + mp.q38.getOptions());
            int guess38 = answer.nextInt();
            guess38--;
            if (guess38 == mp.q38.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q38.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q39.getQuestion() + "\n" + mp.q39.getOptions());
            int guess39 = answer.nextInt();
            guess39--;
            if (guess39 == mp.q39.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q39.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q40.getQuestion() + "\n" + mp.q40.getOptions());
            int guess41 = answer.nextInt();
            guess41--;
            if (guess41 == mp.q41.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q40.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q42.getQuestion() + "\n" + mp.q42.getOptions());
            int guess42 = answer.nextInt();
            guess42--;
            if (guess42 == mp.q42.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q42.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q43.getQuestion() + "\n" + mp.q43.getOptions());
            int guess43 = answer.nextInt();
            guess43--;
            if (guess43 == mp.q43.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q43.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q44.getQuestion() + "\n" + mp.q44.getOptions());
            int guess44 = answer.nextInt();
            guess44--;
            if (guess44 == mp.q44.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q44.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q45.getQuestion() + "\n" + mp.q45.getOptions());
            int guess45 = answer.nextInt();
            guess45--;
            if (guess45 == mp.q45.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q45.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q46.getQuestion() + "\n" + mp.q46.getOptions());
            int guess46 = answer.nextInt();
            guess46--;
            if (guess46 == mp.q46.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q46.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q47.getQuestion() + "\n" + mp.q47.getOptions());
            int guess47 = answer.nextInt();
            guess47--;
            if (guess47 == mp.q47.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q48.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q48.getQuestion() + "\n" + mp.q48.getOptions());
            int guess48 = answer.nextInt();
            guess48--;
            if (guess48 == mp.q48.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q48.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q49.getQuestion() + "\n" + mp.q49.getOptions());
            int guess49 = answer.nextInt();
            guess49--;
            if (guess49 == mp.q49.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q49.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q50.getQuestion() + "\n" + mp.q50.getOptions());
            int guess51 = answer.nextInt();
            guess51--;
            if (guess51 == mp.q51.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q51.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q52.getQuestion() + "\n" + mp.q52.getOptions());
            int guess52 = answer.nextInt();
            guess52--;
            if (guess52 == mp.q52.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q52.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q54.getQuestion() + "\n" + mp.q54.getOptions());
            int guess53 = answer.nextInt();
            guess53--;
            if (guess53 == mp.q53.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q53.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q55.getQuestion() + "\n" + mp.q55.getOptions());
            int guess55 = answer.nextInt();
            guess55--;
            if (guess55 == mp.q55.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q55.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q56.getQuestion() + "\n" + mp.q56.getOptions());
            int guess56 = answer.nextInt();
            guess56--;
            if (guess56 == mp.q56.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q56.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q57.getQuestion() + "\n" + mp.q57.getOptions());
            int guess57 = answer.nextInt();
            guess57--;
            if (guess57 == mp.q57.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q57.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q58.getQuestion() + "\n" + mp.q58.getOptions());
            int guess58 = answer.nextInt();
            guess58--;
            if (guess58 == mp.q58.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q58.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q59.getQuestion() + "\n" + mp.q59.getOptions());
            int guess59 = answer.nextInt();
            guess59--;
            if (guess59 == mp.q59.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q59.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q63.getQuestion() + "\n" + mp.q63.getOptions());
            int guess63 = answer.nextInt();
            guess63--;
            if (guess63 == mp.q63.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q63.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q64.getQuestion() + "\n" + mp.q64.getOptions());
            int guess64 = answer.nextInt();
            guess64--;
            if (guess64 == mp.q64.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q64.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q65.getQuestion() + "\n" + mp.q65.getOptions());
            int guess65 = answer.nextInt();
            guess65--;
            if (guess65 == mp.q65.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q65.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q66.getQuestion() + "\n" + mp.q66.getOptions());
            int guess66 = answer.nextInt();
            guess66--;
            if (guess66 == mp.q66.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q66.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q67.getQuestion() + "\n" + mp.q67.getOptions());
            int guess67 = answer.nextInt();
            guess67--;
            if (guess67 == mp.q67.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q67.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q68.getQuestion() + "\n" + mp.q68.getOptions());
            int guess68 = answer.nextInt();
            guess68--;
            if (guess68 == mp.q68.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q68.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q69.getQuestion() + "\n" + mp.q69.getOptions());
            int guess69 = answer.nextInt();
            guess69--;
            if (guess69 == mp.q69.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q69.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q70.getQuestion() + "\n" + mp.q70.getOptions());
            int guess70 = answer.nextInt();
            guess70--;
            if (guess70 == mp.q70.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q70.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q71.getQuestion() + "\n" + mp.q71.getOptions());
            int guess71 = answer.nextInt();
            guess71--;
            if (guess71 == mp.q71.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q71.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q72.getQuestion() + "\n" + mp.q72.getOptions());
            int guess72 = answer.nextInt();
            guess72--;
            if (guess72 == mp.q72.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q72.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q73.getQuestion() + "\n" + mp.q73.getOptions());
            int guess73 = answer.nextInt();
            guess73--;
            if (guess73 == mp.q73.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q73.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q74.getQuestion() + "\n" + mp.q74.getOptions());
            int guess74 = answer.nextInt();
            guess74--;
            if (guess74 == mp.q74.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q74.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q75.getQuestion() + "\n" + mp.q75.getOptions());
            int guess75 = answer.nextInt();
            guess75--;
            if (guess75 == mp.q75.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q75.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q76.getQuestion() + "\n" + mp.q76.getOptions());
            int guess76 = answer.nextInt();
            guess76--;
            if (guess76 == mp.q76.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q76.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q77.getQuestion() + "\n" + mp.q77.getOptions());
            int guess77 = answer.nextInt();
            guess77--;
            if (guess77 == mp.q77.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q77.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q78.getQuestion() + "\n" + mp.q78.getOptions());
            int guess78 = answer.nextInt();
            guess78--;
            if (guess78 == mp.q78.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q78.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q79.getQuestion() + "\n" + mp.q79.getOptions());
            int guess79 = answer.nextInt();
            guess79--;
            if (guess79 == mp.q79.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q79.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q80.getQuestion() + "\n" + mp.q80.getOptions());
            int guess80 = answer.nextInt();
            guess80--;
            if (guess80 == mp.q80.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q80.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q81.getQuestion() + "\n" + mp.q81.getOptions());
            int guess81 = answer.nextInt();
            guess81--;
            if (guess81 == mp.q81.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q81.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q82.getQuestion() + "\n" + mp.q82.getOptions());
            int guess82 = answer.nextInt();
            guess82--;
            if (guess82 == mp.q82.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q82.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q83.getQuestion() + "\n" + mp.q83.getOptions());
            int guess83 = answer.nextInt();
            guess83--;
            if (guess83 == mp.q83.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q83.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q84.getQuestion() + "\n" + mp.q84.getOptions());
            int guess84 = answer.nextInt();
            guess84--;
            if (guess84 == mp.q84.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q84.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q85.getQuestion() + "\n" + mp.q85.getOptions());
            int guess85 = answer.nextInt();
            guess85--;
            if (guess85 == mp.q85.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q85.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q86.getQuestion() + "\n" + mp.q86.getOptions());
            int guess86 = answer.nextInt();
            guess86--;
            if (guess86 == mp.q86.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q86.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q87.getQuestion() + "\n" + mp.q87.getOptions());
            int guess87 = answer.nextInt();
            guess87--;
            if (guess87 == mp.q87.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q87.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q88.getQuestion() + "\n" + mp.q88.getOptions());
            int guess88 = answer.nextInt();
            guess88--;
            if (guess88 == mp.q88.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q88.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q89.getQuestion() + "\n" + mp.q89.getOptions());
            int guess89 = answer.nextInt();
            guess89--;
            if (guess89 == mp.q89.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q89.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q91.getQuestion() + "\n" + mp.q91.getOptions());
            int guess91 = answer.nextInt();
            guess91--;
            if (guess91 == mp.q91.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q91.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q92.getQuestion() + "\n" + mp.q92.getOptions());
            int guess92 = answer.nextInt();
            guess92--;
            if (guess92 == mp.q92.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q92.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q93.getQuestion() + "\n" + mp.q93.getOptions());
            int guess93 = answer.nextInt();
            guess93--;
            if (guess93 == mp.q93.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q93.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q94.getQuestion() + "\n" + mp.q94.getOptions());
            int guess94 = answer.nextInt();
            guess94--;
            if (guess94 == mp.q94.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q94.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q96.getQuestion() + "\n" + mp.q96.getOptions());
            int guess96 = answer.nextInt();
            guess96--;
            if (guess96 == mp.q96.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q96.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q97.getQuestion() + "\n" + mp.q97.getOptions());
            int guess97 = answer.nextInt();
            guess97--;
            if (guess97 == mp.q97.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q97.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q98.getQuestion() + "\n" + mp.q98.getOptions());
            int guess98 = answer.nextInt();
            guess98--;
            if (guess98 == mp.q98.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q98.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q103.getQuestion() + "\n" + mp.q103.getOptions());
            int guess103 = answer.nextInt();
            guess103--;
            if (guess103 == mp.q103.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q103.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q108.getQuestion() + "\n" + mp.q108.getOptions());
            int guess108 = answer.nextInt();
            guess108--;
            if (guess108 == mp.q108.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q108.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q109.getQuestion() + "\n" + mp.q109.getOptions());
            int guess109 = answer.nextInt();
            guess109--;
            if (guess109 == mp.q109.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q109.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q111.getQuestion() + "\n" + mp.q111.getOptions());
            int guess111 = answer.nextInt();
            guess111--;
            if (guess111 == mp.q111.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q111.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q112.getQuestion() + "\n" + mp.q112.getOptions());
            int guess112 = answer.nextInt();
            guess112--;
            if (guess112 == mp.q112.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q112.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q114.getQuestion() + "\n" + mp.q114.getOptions());
            int guess114 = answer.nextInt();
            guess114--;
            if (guess114 == mp.q114.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q114.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q115.getQuestion() + "\n" + mp.q115.getOptions());
            int guess115 = answer.nextInt();
            guess115--;
            if (guess115 == mp.q115.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q115.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q116.getQuestion() + "\n" + mp.q116.getOptions());
            int guess116 = answer.nextInt();
            guess116--;
            if (guess116 == mp.q116.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q116.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q117.getQuestion() + "\n" + mp.q117.getOptions());
            int guess117 = answer.nextInt();
            guess117--;
            if (guess117 == mp.q117.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q117.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q118.getQuestion() + "\n" + mp.q118.getOptions());
            int guess118 = answer.nextInt();
            guess118--;
            if (guess118 == mp.q118.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q118.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q119.getQuestion() + "\n" + mp.q119.getOptions());
            int guess119 = answer.nextInt();
            guess119--;
            if (guess119 == mp.q119.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q119.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q120.getQuestion() + "\n" + mp.q120.getOptions());
            int guess120 = answer.nextInt();
            guess120--;
            if (guess120 == mp.q120.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q120.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q121.getQuestion() + "\n" + mp.q121.getOptions());
            int guess121 = answer.nextInt();
            guess121--;
            if (guess121 == mp.q121.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q121.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q122.getQuestion() + "\n" + mp.q122.getOptions());
            int guess122 = answer.nextInt();
            guess122--;
            if (guess122 == mp.q122.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q122.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q131.getQuestion() + "\n" + mp.q131.getOptions());
            int guess131 = answer.nextInt();
            guess131--;
            if (guess131 == mp.q131.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q131.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q126.getQuestion() + "\n" + mp.q126.getOptions());
            int guess126 = answer.nextInt();
            guess126--;
            if (guess126 == mp.q126.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q126.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q127.getQuestion() + "\n" + mp.q127.getOptions());
            int guess127 = answer.nextInt();
            guess127--;
            if (guess127 == mp.q127.getCorrectAnswer()){correctAnswerCounter++;
                correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q127.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q128.getQuestion() + "\n" + mp.q128.getOptions());
            int guess128 = answer.nextInt();
            guess128--;
            if (guess128 == mp.q128.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q128.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q129.getQuestion() + "\n" + mp.q129.getOptions());
            int guess129 = answer.nextInt();
            guess129--;
            if (guess129 == mp.q129.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q129.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println(mp.q130.getQuestion() + "\n" + mp.q130.getOptions());
            int guess130 = answer.nextInt();
            guess130--;
            if (guess130 == mp.q130.getCorrectAnswer()){correctAnswerCounter++;
            correctAnswer = correctAnswerCounter;
                }
            System.out.println("Правильный ответ: "+mp.q130.getCorrectAnswer());
            System.out.println("Правильных ответов : " + correctAnswerCounter );

            System.out.println("Количество правильных ответов "+correctAnswer);
        }

}
