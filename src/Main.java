import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Logger LOGGER;

    static {
        try {
            LOGGER = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s = 4;
        int n = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int a;
        int cnt;
        LOGGER.log(Level.WARNING, "Если будет введено не число, будет ошибка");
        System.out.println("Введите количество чисел: ");
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Пользователь ввел не число");
        }
        cnt = 0;
        LOGGER.log(Level.INFO, "Вход в цикл");

        for (int i = 0; i < n; ++i) {

            LOGGER.log(Level.WARNING, "Если будет введено не целочисленное число, будет ошибка");
        }
        System.out.println("Введите значение: ");
        a = scanner.nextInt();
        LOGGER.log(Level.INFO, "Проверка условия");
        int i = 0;
        if (i >= s) {
            LOGGER.log(Level.INFO, "Проверка условия");
            if (a % 34 == 0) cnt += i - s + 1;
            else cnt += n4;
        }
        n4 = n3;
        n3 = n2;
        n2 = n1;
        LOGGER.log(Level.INFO, "Проверка условия");
        if (a % 34 == 0) n1 += 1;

        System.out.println("Количество искомых пар" + cnt);
    }
}


