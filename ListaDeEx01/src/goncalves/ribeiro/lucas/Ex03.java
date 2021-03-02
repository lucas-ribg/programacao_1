package goncalves.ribeiro.lucas;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        String user, key;
        String userAttempt, keyAttempt;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina seu usuario: ");
        user = scanner.nextLine();
        System.out.println("Defina sua senha: ");
        key = scanner.nextLine();

        System.out.println("---Login----");
        System.out.println("user: ");
        userAttempt = scanner.nextLine();
        System.out.println("key: ");
        keyAttempt = scanner.nextLine();

        while (!user.equals(userAttempt) | !key.equals(keyAttempt)){
            System.out.println("Attempt Failed \n User or key is wrong");
            System.out.println("---Login----");
            System.out.println("user: ");
            userAttempt = scanner.nextLine();
            System.out.println("key: ");
            keyAttempt = scanner.nextLine();
        }
        System.out.println("Login Successeful!");
    }
}
