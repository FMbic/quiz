import java.util.List;

public class MultipleChoise {
    private String question;
    private List<String> options;
    private List<Integer> correctMultipleChoice;


    public MultipleChoise(String question, List<String>options, List<Integer> correctMultipleChoice)
    {
        this.question = question;
        this.options = options;
        this.correctMultipleChoice = correctMultipleChoice;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<String> getOptions() {
        return options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }
    public List<Integer> getCorrectMultipleChoice() {
        return correctMultipleChoice;
    }
    public void setCorrectMultipleChoice(List<Integer> correctMultipleChoice) {
        this.correctMultipleChoice = correctMultipleChoice;
    }

}