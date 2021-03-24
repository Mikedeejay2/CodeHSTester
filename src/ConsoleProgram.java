import internal.CodeHSProgram;

import java.util.Scanner;

public abstract class ConsoleProgram implements CodeHSProgram {
    private final Scanner scanner;

    public ConsoleProgram() {
        this.scanner = new Scanner(System.in);
    }

    public abstract void run();

    public int readInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public double readDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public String readLine(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void println(String message) {
        System.out.println(message);
    }
}
