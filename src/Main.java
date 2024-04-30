import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи ключ:");
            String line = scanner.nextLine();
            String key = "";
            for (int i = 0; i < line.length(); i++) {
                char k = line.charAt(i);
                if (k == 'a')
                    key += 'y';
                else if (k == 'y')
                    key += 'a';
                else
                    key += k;
            }
            System.out.println(key);
        }
    }
}