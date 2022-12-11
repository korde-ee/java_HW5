public class PrintDot {

    public void printSymbol(int quantity) {

        char letter = 'o';
        int number = quantity;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }

    }
}
