import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();
        int inputStringLenght = inputString.length();

        StringBuilder SB = new StringBuilder(inputString);
        out.println("SB reverse " + SB.reverse());
        out.print("char forward ");
        for (char c: charArray) {
            out.print(c);
        }
        out.println();
        out.println("String lenght " + inputStringLenght);

        out.print("char reverse ");
        for (int i = inputStringLenght; i > 0; i--)
            out.print(charArray[i-1]);
        out.println();

        out.println("End of program");
    }
}
