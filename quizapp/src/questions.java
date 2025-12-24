import java.util.List;

public class questions
{
    private String question;
    private List<String> options;
    private String correctAnswer;

    public questions(String question, List<String> options, String correctAnswer)
    {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getCorrectAnswer()
    {
        return correctAnswer;
    }

    public List<String> getOptions()
    {
        return options;
    }


}
