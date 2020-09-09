package mirea2419.ru.lb2;
import java.lang.String;
public class Zoo {
    private Dog dogs[] = new Dog[3];
    private int counter = 0;

    public void newSob(String pes, int let) {
        dogs[counter] = new Dog(pes, let);
        counter++;
    }

    public void allInfo() {
        System.out.println(dogs[0].getAge());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].pesAgeSeven());
        System.out.println(dogs[0].toString());
    }
}
