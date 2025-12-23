import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class mapper {

    String [] questions  = {"Компьютерные сети это сети: ","В режиме коммутации каналов сохранение очередности передаваемой информации: "};
    List<String> questionsList = new ArrayList<>();


    public void firstOptions ()
    {
        ArrayList <String> options = new ArrayList<>();
        options.add("1. C коммутацией пакетов");
        options.add("2. C коммутацией каналов");

        for(String option : options)
        {
            System.out.println(option);
        }
        //System.out.println(options);

    }

    public void shuffler ()
    {
        Collections.shuffle(questionsList);
    }

}
