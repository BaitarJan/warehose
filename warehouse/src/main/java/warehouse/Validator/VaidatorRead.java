package warehouse.Validator;

import java.util.Scanner;

public class VaidatorRead {
    Scanner scanner = new Scanner(System.in);

    public String read() {
        return scanner.nextLine().trim();

    }
}