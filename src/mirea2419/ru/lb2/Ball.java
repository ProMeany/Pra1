package mirea2419.ru.lb2;
import java.lang.String;
public class Ball {
    private int size;
    private String type;
    private String color;
    Ball(int size,String type,String color)
    {
        this.size=size;
        this.type=type;
        this.color=color;
    }
    public String toString()
    {
        return("Size = "+size+", Type = "+ type+", Color = "+color);
    }

}
