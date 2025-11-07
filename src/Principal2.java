import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); // New Version
        int yourNumber, intents = 0;

        int randomNumber = (int)(Math.random() * 11);

        do {
            if (intents == 0) {
                System.out.print("Adivina el número entre 1 i 10: ");
                yourNumber = read.nextInt();
                intents++;
            } else {
                System.out.println("[!] - El nombre no és correcte:");
                System.out.print("Adivina el número entre 1 i 10: ");
                yourNumber = read.nextInt();
            }

        } while (randomNumber != yourNumber);

        System.out.println("Has acertat, el nombre era " + randomNumber + ".");
        read.close();

        /*try {
            Scanner read = new Scanner(System.in);
            int edat = read.nextInt();

            if (edat < 0) {
                throw new InputMismatchException("Input error - You cannot enter a negative number");
            }
        } catch (InputMismatchException e) {
            System.out.println("[!] - No pots ficar un nombre negatiu.");
        } finally {
            System.out.println("Exit!");
        }*/

        /*Scanner read = new Scanner(System.in);
        int num;

        try {
            num = read.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("[!] - No pots escriure lletres. ");
        } catch (Exception e) {
            System.out.println("[!] - Error desconegut. ");
        }*/



        /*try {
            Scanner read = new Scanner(System.in);
            String nom = read.nextLine();

            if (nom.length() < 3) {
                throw new InputMismatchException("Input error - You cannot use a name with fewer than three letters");
            }
        } catch (InputMismatchException e) {
            System.out.println("[!] - No pots ficar un nom amb menys de tres lletres.");
        } finally {
            System.out.println("Exit!");
        }*/



    }

}