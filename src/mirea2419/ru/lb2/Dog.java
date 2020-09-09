package mirea2419.ru.lb2;
import java.lang.String;
public class Dog {
    private String name;
    private int age;

    Dog(String name, int  age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public int pesAgeSeven() {
        return age * 7;
    }

    public String toString() {
        return "Dog:" +
                "name ='" + name + '\'' +
                ", age = " + age
                ;
    }
}
