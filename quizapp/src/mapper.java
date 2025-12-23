import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mapper {

    String [] questions  = {"Компьютерные сети это сети: ","В режиме коммутации каналов сохранение очередности передаваемой информации: "};

    public void setOptions ()
    {
        ArrayList <String> options = new ArrayList<>();
        options.add("1 с коммутацией пакетов");
        options.add("2 с коммутацией каналов");

        IO.println(options);

    }

}
