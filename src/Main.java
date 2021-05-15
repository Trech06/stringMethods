import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String inputString = scanner.nextLine();
        char[] charArray = inputString.toCharArray();
        int inputStringLenght = inputString.length();
        for (char c: charArray) {
            out.print(c);
        }
        out.println();
        out.println(inputStringLenght);
        //  out.println("s");
        for (int i = inputStringLenght; i > 0; i--)
            out.print(charArray[i-1]);
        out.println();
        out.println("End of program");
    }
}
