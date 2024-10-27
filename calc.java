import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner scan = new Scanner(System.in);

        while (true) {
            String text = scan.nextLine();
            String[] figures = text.split("[-+*/]");
            String[] math = text.split("");
            int size = text.length();

            int num1 = Integer.parseInt(figures[0]);
            int num2 = Integer.parseInt(figures[1]);

           try {
                if ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)) {
                    throw new Exception();
                }
            } catch (Exception ex) {
               System.out.println("Условие: Ввести в консоль числа от 1 до 10 включительно");
               System.out.println("Завершение программы");
                System.exit(0);
            }

            String c = size >= 4 ? math[2] : math[1];

           boolean math1 = c.equals("+"), math2 = c.equals("-"), math3 = c.equals("*"), math4 = c.equals("/");

            if (math1)
                System.out.println(num1 + num2);
            else if (math2)
                System.out.println(num1 - num2);
            else if (math3)
                System.out.println(num1 * num2);
            else if (math4)
                System.out.println(num1 / num2);
        }
    }
}

