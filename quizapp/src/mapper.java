import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mapper extends questions{

    questions questions;

    public void storeQuest (questions questions)
    {
        this.questions = questions;

        questionWithCorrectAnswer.put("Компьютерные сети это сети: ", "С коммутацией пакетов");

    }
}
