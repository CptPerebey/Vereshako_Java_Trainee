import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        for (int i = 0; i < mas.length ; i++) {
            Random rnd = new Random();
            mas[i] = rnd.nextInt(15) + 1;
            if (mas[i] % 3 == 0)
                System.out.println(mas[i] + " ");

        }
    }
}
