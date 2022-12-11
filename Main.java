import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CheckIt check = new CheckIt();
        PrintDot output = new PrintDot();
        Triangle func = new Triangle();

        Scanner cons = new Scanner(System.in);
        System.out.println("Какое 'триугольное число' необходимо найти? ");
        String input = cons.nextLine();
        System.out.println();
        cons.close();

        if (check.isDigit(input) == true) {
            System.out.printf("%s-е треугольное число: %d \n", input, func.triangleF(Integer.parseInt(input)));
            output.printSymbol(Integer.parseInt(input));
        } else {
            System.out.println("Вы ввели неверные значения. Допустимы целые, положительные числа.");
        }
    }

}
