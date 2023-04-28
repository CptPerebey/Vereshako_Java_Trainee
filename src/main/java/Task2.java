import java.util.Scanner;

public class Task2 {
    public static void main (String arg[]){
        String myName = "Вячеслав";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        if (name.equals(myName))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");
    }
}
