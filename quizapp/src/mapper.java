import java.util.*;

public class mapper {



    questions q1 = new questions("Компьютерные сети это сети: ",
            Arrays.asList("1. C коммутацией пакетов","2. C коммутацией каналов"),0);
    questions q2 = new questions("В режиме коммутации каналов сохранение очередности передаваемой информации: ",
            Arrays.asList("1. Обеспечиваются","2. Не обеспечиваются"),1);
    Object ob = new Object();

    ArrayList<questions> allQuestions = new ArrayList<>(ob.toString(q1,q2));
}
