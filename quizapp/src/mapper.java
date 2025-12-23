import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mapper {

    String [] questions  = {"Компьютерные сети это сети: ","В режиме коммутации каналов сохранение очередности передаваемой информации: "};

    String [][] options =
            {
                    {"с коммутацией пакетов", "с коммутацией каналов"},
                    {"обеспечивается", "не обеспечивается", "3 опция для теста"}
            };

    public void setOptions ()
    {
        ArrayList <String> options = new ArrayList<>();
        options.add("с коммутацией пакетов");
        options.add("с коммутацией каналов");

        IO.println(options);

    }

}
