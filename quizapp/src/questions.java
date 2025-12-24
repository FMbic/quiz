import java.util.List;

public class questions
{
    private String question;
    private List<String> options;
    private int correctAnswer;

    public questions(String question, List<String> options, int correctAnswer)
    {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {return question;}
    public Integer getCorrectAnswer() {return correctAnswer;}
    public List<String> getOptions() {return options;}


    public void setQuestion(String question) {this.question = question;}
    public void setOptions(List<String> options) {this.options = options;}
    public void setCorrectAnswer(int correctAnswer) {this.correctAnswer = correctAnswer;}


}
