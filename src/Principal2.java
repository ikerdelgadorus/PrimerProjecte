import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Principal2 {
    public static void main(String[] args) {

        String[] paraules = {"Hola", "Adios", "Nuevo"};

        for (String e:paraules) {
            System.out.println(e);
        }

        /*System.out.println(" █████╗ ██████╗ ██╗██╗   ██╗██╗███╗   ██╗ █████╗     ███████╗██╗         ███╗   ██╗██╗   ██╗███╗   ███╗███████╗██████╗  ██████╗ ");
        System.out.println("██╔══██╗██╔══██╗██║██║   ██║██║████╗  ██║██╔══██╗    ██╔════╝██║         ████╗  ██║██║   ██║████╗ ████║██╔════╝██╔══██╗██╔═══██╗");
        System.out.println("███████║██║  ██║██║██║   ██║██║██╔██╗ ██║███████║    █████╗  ██║         ██╔██╗ ██║██║   ██║██╔████╔██║█████╗  ██████╔╝██║   ██║");
        System.out.println("██╔══██║██║  ██║██║╚██╗ ██╔╝██║██║╚██╗██║██╔══██║    ██╔══╝  ██║         ██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗██║   ██║");
        System.out.println("██║  ██║██████╔╝██║ ╚████╔╝ ██║██║ ╚████║██║  ██║    ███████╗███████╗    ██║ ╚████║╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║╚██████╔╝");
        System.out.println("╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═══╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝    ╚══════╝╚══════╝    ╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ");
        System.out.println("");

        Scanner read = new Scanner(System.in);

        String[] paraules = new String[6];

        for(int i = 0; i < paraules.length; i++){
            System.out.print("Escriu una paraula: ");
            paraules[i] = read.nextLine();
        }

        String[] paraula1 = Arrays.copyOf(paraules, paraules.length/2);
        String[] paraula2 = Arrays.copyOfRange(paraules, paraules.length/2, paraules.length);

        System.out.println(Arrays.toString(paraules));*/

        /*Scanner read = new Scanner(System.in);
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            System.out.print("Escriu un nombre: ");
            nums[i] = read.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));*/

        /*int[] nums = {1, -2, 4, -7, -21, 23, 17, 10, 0, 11};

        for (int e:nums){
            if (e == 0)
                break;

            if (e > 0)
                System.out.println(e);
        }*/

        /*int[] edats = {18, 12, 23, 28, 17};
        int sum = 0, smaller = 200, bigger = 0;

        for (int e:edats) {
            sum += e;
            if (e > bigger)
                bigger = e;

            if (e < smaller)
                smaller = e;

        }

        System.out.println("Mitjana: " + (sum / edats.length) + " Gran: " + bigger + " Petit: " + smaller);*/


        /*String[] seients = {"Ian", "Cristina", "Natalia", "Jordi", "Joseph", "Iker", "Javier", "Marc", "Adria", "Adrian"};

        for(int i = 0; i < seients.length; i++){
            System.out.println("Pos: " + i + " | Nom: " + seients[i]);
        }*/


        /*Scanner read = new Scanner(System.in); // New Version
        int yourNumber = 0, intents, bigger, smaller, error = 0;
        String pregunta;
        int randomNumber = (int)(Math.random() * 101);
        int winsUsuari = 0, winsComputer = 0;

        do {
            intents = 0;
            smaller = 1;
            bigger = 100;

            do {
                try {

                    if (intents == 0) {
                        System.out.print("Adivina el número entre 1 i 100: ");
                        yourNumber = read.nextInt();
                    } else {
                        System.out.print("Adivina el número entre " + smaller + " i " + bigger + ": ");
                        yourNumber = read.nextInt();
                    }

                    intents++;

                    if (yourNumber == randomNumber) {
                        break;
                    }


                    if (yourNumber < smaller){
                        error = 1;
                        throw new Exception("[!] - El nombre no pot ser mes petit que el rang permes.");
                    }

                    if (yourNumber > bigger){
                        error = 2;
                        throw new Exception("[!] - El nombre no pot ser mes gran que el rang permes.");
                    }

                    if (yourNumber > randomNumber) {
                        bigger = (yourNumber < bigger) ? (yourNumber - 1) : bigger;
                    } else if (yourNumber < randomNumber) {
                        smaller = (yourNumber > smaller) ? (yourNumber + 1) : smaller;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("[!] - No pots escriure lletres. Ha de ser un nombre enter.");
                    read.nextLine();
                    intents++;
                    continue;
                } catch (Exception e){
                    if (error == 1){
                        System.out.println("[!] - El nombre no pot ser mes petit que el rang permes.");
                    } else if (error == 2){
                        System.out.println("[!] - El nombre no pot ser mes gran que el rang permes.");
                    }
                    error = 0;
                    read.nextLine();
                    intents++;
                    continue;
                }

            } while (randomNumber != yourNumber);

            System.out.println("Enhorabona! Has encertat el número secret en " + intents + " intents.");
            System.out.println("Vols jugar una altra partida? SI / no");
            pregunta = read.nextLine();
            pregunta = read.nextLine();
            pregunta = pregunta.toLowerCase();
        } while (!pregunta.equals("no"));

        read.close();*/

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
