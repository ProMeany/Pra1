package mirea2419.ru.lb2;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Zoo a = new Zoo();
        a.newSob("Sharik", 55);
        a.newSob("Bobik", 21);
        a.newSob("Hed", 13);
        a.allInfo();
        Ball b1=new Ball(5,"football","red");
        System.out.println(b1);
        Book b2 = new Book("more", 50);
        System.out.println(b2);
    }
}
