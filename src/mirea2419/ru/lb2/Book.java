package mirea2419.ru.lb2;
import java.lang.String;
public class Book {
    private String name;
    private int size;
    Book(String name,int size)
    {
        this.name=name;
        this.size=size;
    }
    public String toString()
    {
        return("Name of book: "+name+", Size: "+size);
    }
}
