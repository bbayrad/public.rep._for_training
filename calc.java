import java.io.IOException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

System.out.println("Введите выражение");
        Scanner scan = new Scanner(System.in);

        while (true) {
            String text = scan.nextLine();

            try {
                if (text.length()<3 | text.length()>4) {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println("Не является мат выражением");
                System.out.println("Завершение программы");
                System.exit(0);
            }

            String[] figures = text.split("[-+*/]");
            String[] mathsimbol = text.split("");
            int lengthtext = text.length();

            int num1 = Integer.parseInt(figures[0]);
            int num2 = Integer.parseInt(figures[1]);

           try {
                if ((num1 < 1 || num1 > 10) && (num2 < 1 || num2 > 10)) {
                    throw new Exception();
                }
            } catch (Exception ex) {
               System.out.println("Условие: Ввести в консоль числа от 1 до 10 включительно");
               System.out.println("Завершение программы");
                System.exit(0);
            }

            String c = lengthtext >= 4 ? mathsimbol[2] : mathsimbol[1];

            //System.out.println(num1 + " " + num2 + " " + c );

            boolean mathsimbol1 = (c.equals("+")), mathsimbol2 = (c.equals("-"));
            boolean mathsimbol3 = (c.equals("*")), mathsimbol4 = (c.equals("/"));

            int result;
            if (mathsimbol1)
                System.out.println("=" + (result = num1 + num2));
            else if (mathsimbol2)
                System.out.println("=" + (result = num1 - num2));
            else if (mathsimbol3)
                System.out.println("=" + (result = num1 * num2));
            else if (mathsimbol4)
                System.out.println(result = num1 / num2);
        }
    }
}

