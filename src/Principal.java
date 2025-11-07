import javax.xml.transform.Source;
import java.awt.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.text.*;
import java.math.*;
import java.util.List;


public class Principal{
    public static void main(String[] args){

        //Exercici
        /*Scanner read = new Scanner(System.in);
        int divisio, num1, num2;

        try {
            System.out.print("Escriu un nombre: ");
            num1 = read.nextInt();
        } catch (InputMismatchException e){
            System.out.println("[!] - El input ha de ser un nombre.");
            num1 = 1;
        } catch (Exception e){
            System.out.println("[!] - Ha donat un error extrany.");
            num1 = 1;
        }

        num1 = 1;


        System.out.print("Escriu un altre nombre: ");
        num2 = read.nextInt();


        try {
            divisio = num1 / num2;
        } catch (ArithmeticException e){
            System.out.println("[!] - No pots dividir amb el valor 0");
            divisio = 0;
        }

        System.out.println(divisio);*/

        /*Scanner read = new Scanner(System.in);
        System.out.print("Write a text: ");
        String text = read.nextLine();
        text = text.toLowerCase();

        List<String> letters = new ArrayList<>();

        for (int i = 1; i <= text.length() ; i++) {
            System.out.println(text.charAt(i));
            //letters.add();
        }
        read.close();*/

        /*Scanner read = new Scanner(System.in);
        System.out.println("██████╗ ███████╗███████╗ ██████╗ ██╗     ██╗   ██╗████████╗██╗ ██████╗ ███╗   ██╗     ██████╗  █████╗ ██╗      ██████╗ ██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗");
        System.out.println("██╔══██╗██╔════╝██╔════╝██╔═══██╗██║     ██║   ██║╚══██╔══╝██║██╔═══██╗████╗  ██║    ██╔═══██╗██╔══██╗██║     ██╔═══██╗██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗");
        System.out.println("██████╔╝█████╗  ███████╗██║   ██║██║     ██║   ██║   ██║   ██║██║   ██║██╔██╗ ██║    ██║      ███████║██║     ██║      ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝");
        System.out.println("██╔══██╗██╔══╝  ╚════██║██║   ██║██║     ██║   ██║   ██║   ██║██║   ██║██║╚██╗██║    ██║      ██╔══██║██║     ██║      ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗");
        System.out.println("██║  ██║███████╗███████║╚██████╔╝███████╗╚██████╔╝   ██║   ██║╚██████╔╝██║ ╚████║    ╚██████╗ ██║  ██║███████╗╚██████╗ ╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║");
        System.out.println("╚═╝  ╚═╝╚══════╝╚══════╝ ╚═════╝ ╚══════╝ ╚═════╝    ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═════╝ ╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝");
        System.out.print("Write de height of resolution: ");
        int height = read.nextInt();
        System.out.print("Write de width of resolution: ");
        int width = read.nextInt();
        System.out.print("Write de size of cells: ");
        int cells = read.nextInt();

        System.out.println("\n");

        for (int i = 1; i <= 2048;i++) {
            if ((i * height)%cells == 0 && (i * width)%cells == 0) {
                System.out.println("Height: " + (i * height) + " | Width: " + (i * width));
                if ((i * height) >= 4096 || (i * width) >= 4096) {
                    break;
                }
            }
        }*/

        // Exemple
        /*Scanner read = new Scanner(System.in);
        int num, positius = 0, negatius = 0, sum = 0, nums = 0;
        do {

            System.out.print("Escriu un nombre: ");
            num = read.nextInt();

            if (num > 0) {
                positius++;
            } else if (num < 0) {
                negatius++;
            }

            sum += num;
            nums++;

        } while (num != 0);

        System.out.println("Nombres positius: " + positius);
        System.out.println("Nombres negatius: " + negatius);
        System.out.println("La suma dels nombres és " + sum);
        System.out.println("La mitjana és " + (sum / nums));*/

        // Exemple
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int num = read.nextInt();
        boolean primer = true;

        if (num != 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    primer = false;
                    break;
                }
            }
        }

        String result = (primer) ? ("El nombre " + num + " és primer") : ("El nombre " + num + " no és primer");
        System.out.println(result);*/


        // Exemple
        /*Scanner read = new Scanner(System.in);
        boolean correct = true;
        do {
            System.out.print("Escriu una nota: ");
            float nota = read.nextFloat();
            
            if (nota < 5 && nota >= 0){
                System.out.println("Suspes!");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("Aprovat!");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("Notable!");
            } else if (nota >= 9 && nota <= 10) {
                System.out.println("Excelent!");
            } else {
                correct = false;
            }

        } while (correct == true);*/

        // Exemple
        /*String paraula;
        Scanner read = new Scanner(System.in);
        do {
            paraula = read.nextLine();
            if (paraula.equals("stop")){
                System.out.println("Adeu");
                break;
            }
        } while (!paraula.equals("stop"));*/

        // Exemple
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int num = read.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%2 == 1){
                continue;
            }
            System.out.println(i);
        }*/

        //Exemple
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu la llargada del rectangle: ");
        int llargada = read.nextInt();

        for (int i = 1; i <= llargada; i++) {
            System.out.print("\n");
            for (int j = 1; j <= llargada; j++) {
                if ( j > (llargada - i) ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
        }*/

        //Exemple
        //Scanner read = new Scanner(System.in);
        /*System.out.print("Escriu la llargada del rectangle: ");
        int llargada = read.nextInt();

        for (int i = 1; i <= llargada; i++) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }*/

        // Exemple
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu la amplada del rectangle: ");
        int amplada = read.nextInt();
        System.out.print("Escriu la llargada del rectangle: ");
        int llargada = read.nextInt();

        for (int i = 1; i <= llargada; i++) {
            System.out.print("\n");
            for (int j = 1; j <= amplada; j++) {
                System.out.print("*");
            }
        }
        read.close();*/


        // Exemple
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("\nTaula del " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println("\t" + j + " * " + i + " = " + (j * i));
            }
        }*/

        // Exemple
        /*Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + num + " = " + (num * i));
        }
        read.close();*/

        // Exemple
        /*int factorial = 1;
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);*/

        // Exemple
        /*for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }*/

        // Exemple
        /*int sum = 0;
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        for (int i = 0; i <= num; i++) {

            sum += i;

        } 

        System.out.println(sum);*/

        // Exemple
        /*for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        int figura;
        do {
            System.out.println("\n\nTria la figura de la qual vols resoldre l'areà: ");
            System.out.println("\t1. Rectangle/Quadrat");
            System.out.println("\t2. Triangle");
            System.out.println("\t3. Circumferencia");
            System.out.println("\t4. Sortir");
            System.out.print("Escull l'opció que vulguis posant el número: ");
            figura = read.nextInt();

            switch (figura) {
                case 1:
                    System.out.println("\n\nPer resoldre l'areà d'un rectangle o quadrat necesitem alçada per amplada.");
                    System.out.print("Escriu l'alçada: ");
                    float alcadaRectangle = read.nextInt();
                    System.out.print("Escriu l'amplada: ");
                    float ampladaRectangle = read.nextFloat();

                    float areaRectangle = alcadaRectangle * ampladaRectangle;

                    if (ampladaRectangle == alcadaRectangle) {
                        System.out.println("L'areà del teu quadrat és: " + areaRectangle);
                    } else {
                        System.out.println("L'areà del teu rectangle és: " + areaRectangle);
                    }
                    break;

                case 2:
                    System.out.println("\n\nPer resoldre l'areà d'un triangle necesitem alçada per amplada.");
                    System.out.print("Escriu l'alçada: ");
                    float alcadaTriangle = read.nextFloat();
                    System.out.print("Escriu l'amplada: ");
                    float ampladaTriangle = read.nextFloat();

                    float areaTriangle = (alcadaTriangle * ampladaTriangle) / 2;

                    System.out.println("L'areà del teu triangle és: " + areaTriangle);

                    break;

                case 3:
                    final float PI = 3.14159265f;
                    System.out.println("\n\nPer resoldre l'areà d'una circumferencia necesitem el seu radi.");
                    System.out.print("Escriu el radi: ");
                    float radiCircumferencia = read.nextFloat();

                    float areaCircumferencia = PI * (float)Math.pow(radiCircumferencia, 2.0f);

                    System.out.println("L'areà del teu triangle és: " + areaCircumferencia);

                    break;

                case 4:
                    break;

                default:
                    System.out.println("[!] - El nombre és erroni");
            }

        } while (figura != 4);

        System.out.println("Has sortit");*/

        //Exercici
        /*Scanner read = new Scanner(System.in);
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
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        int nombre, suma = 0;

        do {
            System.out.print("Introdueix un nombre: ");
            nombre = read.nextInt();
            suma = suma + nombre;

        } while (nombre != 0);

        System.out.println("La suma dels nombres introduits són: " + suma);
        read.close();
         */

        // Exercici
        /*Scanner read = new Scanner(System.in);
        final String USERNAME = "iker.delgado";
        final String USERPASSWORD = "delgado19";
        String nomUsuari, contrasenyaUsuari;
        int intents = 0;

        do {
            if (intents == 0){
                System.out.println("Escriu el teu nom d’usuari i la contrasenya: ");
                intents++;
            } else {
                System.out.println("[!] - Error amb les credencials");
                System.out.println("Torna a escriure l'usuari i la contrasenya");
            }

            nomUsuari = read.nextLine();
            contrasenyaUsuari = read.nextLine();

        } while (!(USERNAME.equals(nomUsuari) && USERPASSWORD.equals(contrasenyaUsuari)));

        System.out.println("Les credencials són correctes.");
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre per saber el seu factorial: ");
        int nombre = read.nextInt();

        int i = nombre , factorial = 1;
        while (i > 0){
            factorial = factorial * i;
            i--;
        }

        System.out.println("El factorial de " + nombre + " és: " + factorial);
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int primerNombre = read.nextInt();
        System.out.print("Escriu un nombre més gran que l'anterior: ");
        int segonNombre = read.nextInt();

        int i = primerNombre , suma = 0, producte = 1, mitja = 0;
        while (i <= segonNombre){
            if( (i % 2) == 0) {
                suma = suma + i;
                producte = producte * i;
                mitja++;
            }
            i++;
        }

        System.out.println("La suma de tots els nombres és: " + suma);
        System.out.println("El producte de tots els nombres és: " + producte);
        System.out.println("La mitja de tots els nombres és: " + (suma / mitja));
        read.close();*/

        // Exercici
        /*int i = 1 , suma = 0;
        long producte = 1;
        while (i <= 10){
            suma = suma + i;
            producte = producte * i;
            i++;
        }

        System.out.println("La suma de tots els nombres és: " + suma);
        System.out.println("El producte de tots els nombres és: " + producte);
        System.out.println("La mitja de tots els nombres és: " + (suma / i));*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int nombre = read.nextInt();
        int i = 0;

        while (i <= nombre){
            System.out.println(i);
            i++;
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre entre 50 i 60: ");
        int nombreNormal = read.nextInt();

        switch (nombreNormal) {
            case 50:
                System.out.println("El nombre 50 en nombres romans és: L");
                break;
            case 51:
                System.out.println("El nombre 51 en nombres romans és: LI");
                break;
            case 52:
                System.out.println("El nombre 52 en nombres romans és: LII");
                break;
            case 53:
                System.out.println("El nombre 53 en nombres romans és: LIII");
                break;
            case 54:
                System.out.println("El nombre 54 en nombres romans és: LIV");
                break;
            case 55:
                System.out.println("El nombre 55 en nombres romans és: LV");
                break;
            case 56:
                System.out.println("El nombre 56 en nombres romans és: LVI");
                break;
            case 57:
                System.out.println("El nombre 57 en nombres romans és: LVII");
                break;
            case 58:
                System.out.println("El nombre 58 en nombres romans és: LVIII");
                break;
            case 59:
                System.out.println("El nombre 59 en nombres romans és: LIX");
                break;
            case 60:
                System.out.println("El nombre 60 en nombres romans és: LX");
                break;
            default:
                System.out.println("[!] - El nombre que has donat no esta entre 50 i 60.");
        }
        read.close();
         */

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre entre 0 i 99999: ");
        int nombre = read.nextInt();

        if (nombre >= 0 && nombre <= 99999) {
            String conversio = String.valueOf(nombre);
            String singular = (conversio.length() == 1) ? " xifra." : " xifres.";
            System.out.println("El nombre " + nombre + " té un total de " + conversio.length() + singular);
        } else {
            System.out.println("[!] - El nombre no esta dins del rang");
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu el primer nombre: ");
        int primerNombre = read.nextInt();
        System.out.print("Escriu el segon nombre: ");
        int segonNombre = read.nextInt();
        System.out.print("Escriu el tercer nombre: ");
        int tercerNombre = read.nextInt();

        boolean creixent = primerNombre < segonNombre && segonNombre < tercerNombre;
        boolean decreixent = primerNombre > segonNombre && segonNombre > tercerNombre;
        boolean creIdec = primerNombre < segonNombre && segonNombre > tercerNombre;

        if (creixent) {
            System.out.println("Els nombres van en creixent.");
        } else if (decreixent) {
            System.out.println("Els nombres van en decreixent.");
        } else if (creIdec) {
            System.out.println("Els nombres van en creixent i decreixent");
        } else {
            System.out.println("[!] - Indefinit");
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu el primer nombre: ");
        int primerNombre = read.nextInt();
        System.out.print("Escriu el segon nombre: ");
        int segonNombre = read.nextInt();
        System.out.print("Escriu el tercer nombre: ");
        int tercerNombre = read.nextInt();

        boolean totsIguals = primerNombre == segonNombre && segonNombre == tercerNombre;
        boolean totsDiferents = primerNombre != segonNombre && segonNombre != tercerNombre && tercerNombre != primerNombre;

        if (totsIguals) {
            System.out.println("Tots els nombres són iguals.");
        } else if (totsDiferents) {
            System.out.println("Tots els nombres són diferents.");
        } else {
            System.out.println("Hi ha nombres iguals i nombres diferents.");
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Benvingut/da al canvis de moneda primer tria a la moneda que voldras convertir els teus euros:");
        System.out.println("\td. Calculadora");
        System.out.println("\tl. Càlcul d’àrees");
        System.out.print("Escull l'opció que vulguis posant la lletra: ");
        String canviMonedaLletra = read.nextLine();
        float conversioMoneda;

        System.out.print("\nDigues el nombre d'euros: ");
        float euros = read.nextFloat();

        DecimalFormat format = new DecimalFormat("#.00");

        switch (canviMonedaLletra){
            case "d":
                conversioMoneda = euros * 1.16f;
                System.out.println("\n El teus " + format.format(euros) + "€ equivalan a $" + format.format(conversioMoneda) + ".");
                break;
            case "l":
                conversioMoneda = euros * 0.87f;
                System.out.println("\n El teus " + format.format(euros) + "€ equivalan a " + format.format(conversioMoneda) + "ł.");
                break;
            default:
                System.out.println("[!] - El valor introduit no es el esperat");
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu el nombre del billet: ");
        int nombreBillet = read.nextInt();

        String conversio = String.valueOf(nombreBillet);
        if (conversio.length() == 6) {

            int nombreBilletReduit = nombreBillet / 10;
            int nombreBilletEliminat = nombreBillet % 10;

            if (nombreBilletEliminat == (nombreBilletReduit % 7)) {
                System.out.println(nombreBillet + " --> vàlid");
            } else {
                System.out.println(nombreBillet + " --> invàlid");
            }

        } else {
            System.out.println("[!] - El nombre ha de contenir 6 xifres");
        }

        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Benvingut/da al menú d’opcions dels programes d’avui, escull un número:");
        System.out.println("\t1. Conversió de notes");
        System.out.println("\t2. Menú del restaurant");
        System.out.println("\t3. Calculadora");
        System.out.println("\t4. Càlcul d’àrees");
        System.out.print("Escull l'opció que vulguis posant el número: ");
        int menuPrincipal = read.nextInt();

        //int menuPrincipal = 3;

        switch (menuPrincipal) {
            case 1:
                System.out.println("\n\nEscriu la teva nota: ");
                int nota = read.nextInt();

                switch (nota){
                    case 0:
                        System.out.println("Susupès");
                        break;
                    case 1:
                        System.out.println("Susupès");
                        break;
                    case 2:
                        System.out.println("Susupès");
                        break;
                    case 3:
                        System.out.println("Susupès");
                        break;
                    case 4:
                        System.out.println("Susupès");
                        break;
                    case 5:
                        System.out.println("Suficient");
                        break;
                    case 6:
                        System.out.println("Suficient");
                        break;
                    case 7:
                        System.out.println("Notable");
                        break;
                    case 8:
                        System.out.println("Notable");
                        break;
                    case 9:
                        System.out.println("Excel·lent");
                        break;
                    case 10:
                        System.out.println("Excel·lent");
                        break;
                    default:
                        System.out.println("[!] - La nota només és qualificable entre 1 i 10.");
                }
                break;

            case 2:
                System.out.println("\n\nBenvingut/da al restaurant, tria el primer plat del menú: ");
                System.out.println("\t1. Pinya amb pernil salat");
                System.out.println("\t2. Spagetti amb carbonara");
                System.out.println("\t3. Ensalada césar");
                System.out.print("Escull l'opció que vulguis posant el número: ");
                int primerPlat = read.nextInt();
                String nomPrimerPlat;

                switch (primerPlat){
                    case 1:
                        nomPrimerPlat = "pinya amb pernil salat";
                        break;
                    case 2:
                        nomPrimerPlat = "spagetti amb carbonara";
                        break;
                    case 3:
                        nomPrimerPlat = "ensalada césar";
                        break;
                    default:
                        System.out.println("[!] - El primer plat és erroni");
                        nomPrimerPlat = "[unknown]";
                }

                System.out.println("Tria el segon plat del menú: ");
                System.out.println("\t1. Entrecot amb patates");
                System.out.println("\t2. Conill a la brasa");
                System.out.println("\t3. Rap amb patates al forn");
                System.out.print("Escull l'opció que vulguis posant el número: ");
                int segonPlat = read.nextInt();
                String nomSegonPlat;

                switch (segonPlat){
                    case 1:
                        nomSegonPlat = "entrecot amb patates";
                        break;
                    case 2:
                        nomSegonPlat = "conill a la brasa";
                        break;
                    case 3:
                        nomSegonPlat = "rap amb patates al forn";
                        break;
                    default:
                        System.out.println("[!] - El segon plat és erroni");
                        nomSegonPlat = "[unknown]";
                }

                System.out.println("Tria el postre del menú: ");
                System.out.println("\t1. Tiramisu");
                System.out.println("\t2. Cheesecake");
                System.out.println("\t3. Semifred de fruits del bosc");
                System.out.print("Escull l'opció que vulguis posant el número: ");
                int postre = read.nextInt();
                String nomPostre;

                switch (postre){
                    case 1:
                        nomPostre = "tiramisu";
                        break;
                    case 2:
                        nomPostre = "cheesecake";
                        break;
                    case 3:
                        nomPostre = "semifred de fruits del bosc";
                        break;
                    default:
                        System.out.println("[!] - El postre és erroni");
                        nomPostre = "[unknown]";
                }

                System.out.println("Al final en el teu menú de primer tens " + nomPrimerPlat + ", de segon plat tens " + nomSegonPlat + " i de postre tens " + nomPostre + ".");
                break;

            case 3:
                System.out.print("\n\nEscriu el primer nombre: ");
                int primerNombre = read.nextInt();

                System.out.print("Escriu el segon nombre: ");
                int segonNombre = read.nextInt();

                System.out.println("\nTria l'operacio que vols realitzar: ");
                System.out.println("\t1. Suma (+)");
                System.out.println("\t2. Resta (-)");
                System.out.println("\t3. Multiplicació (*)");
                System.out.println("\t4. Multiplicació (/)");
                System.out.print("Escull l'opció que vulguis posant el número: ");
                int operacions = read.nextInt();
                int resultOperacio;

                switch (operacions){
                    case 1:
                        resultOperacio = primerNombre + segonNombre;
                        System.out.println("\nLa següent suma " + primerNombre + "+" + segonNombre + " dona " + resultOperacio + ".");
                        break;
                    case 2:
                        resultOperacio = primerNombre - segonNombre;
                        System.out.println("\nLa següent resta " + primerNombre + "-" + segonNombre + " dona " + resultOperacio + ".");
                        break;
                    case 3:
                        resultOperacio = primerNombre * segonNombre;
                        System.out.println("\nLa següent multiplicació " + primerNombre + "*" + segonNombre + " dona " + resultOperacio + ".");
                        break;
                    case 4:
                        resultOperacio = primerNombre / segonNombre;
                        System.out.println("\nLa següent divisió " + primerNombre + "/" + segonNombre + " dona " + resultOperacio + ".");
                        break;
                    default:
                        System.out.println("[!] - No has seleccionat res ");

                }
                break;

            case 4:
                System.out.println("\n\nTria la figura de la qual vols resoldre l'areà: ");
                System.out.println("\t1. Rectangle/Quadrat");
                System.out.println("\t2. Triangle");
                System.out.println("\t3. Circumferencia");
                System.out.print("Escull l'opció que vulguis posant el número: ");
                int figura = read.nextInt();

                switch (figura) {
                    case 1:
                        System.out.println("\n\nPer resoldre l'areà d'un rectangle o quadrat necesitem alçada per amplada.");
                        System.out.print("Escriu l'alçada: ");
                        float alcadaRectangle = read.nextInt();
                        System.out.print("Escriu l'amplada: ");
                        float ampladaRectangle = read.nextFloat();

                        float areaRectangle = alcadaRectangle * ampladaRectangle;

                        if (ampladaRectangle == alcadaRectangle) {
                            System.out.println("L'areà del teu quadrat és: " + areaRectangle);
                        } else {
                            System.out.println("L'areà del teu rectangle és: " + areaRectangle);
                        }
                        break;

                    case 2:
                        System.out.println("\n\nPer resoldre l'areà d'un triangle necesitem alçada per amplada.");
                        System.out.print("Escriu l'alçada: ");
                        float alcadaTriangle = read.nextFloat();
                        System.out.print("Escriu l'amplada: ");
                        float ampladaTriangle = read.nextFloat();

                        float areaTriangle = (alcadaTriangle * ampladaTriangle) / 2;

                        System.out.println("L'areà del teu triangle és: " + areaTriangle);

                        break;

                    case 3:
                        final float PI = 3.14159265f;
                        System.out.println("\n\nPer resoldre l'areà d'una circumferencia necesitem el seu radi.");
                        System.out.print("Escriu el radi: ");
                        float radiCircumferencia = read.nextFloat();

                        float areaCircumferencia = PI * (float)Math.pow(radiCircumferencia, 2.0f);

                        System.out.println("L'areà del teu triangle és: " + areaCircumferencia);

                        break;

                    default:
                        System.out.println("[!] - El nombre és erroni");
                }

                break;

            default:
                System.out.println("[!] - El nombre és erroni");

        }

        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre del 1-7: ");
        int nombre = read.nextInt();

        switch (nombre) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("No correspon a cap dia de la setmana");
        }*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int nombre = read.nextInt();

        if (nombre > 0){
            System.out.println("Valor positiu");
        } else if (nombre < 0){
            System.out.println("Valor negatiu");
        } else {
            System.out.println("El valor es zero");
        }
        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int nombre = read.nextInt();

        if ((nombre % 2) == 0){
            System.out.println("El nombre " + nombre + " és parell");
        } else {
            System.out.println("El nombre " + nombre + " és imparell");
        }
        read.close();*/

        //Exercici RA1
        /*Scanner read = new Scanner(System.in);
        System.out.print("Digues la nota del RA1: ");
        float ra1 = read.nextFloat();
        System.out.print("Digues la nota del RA2: ");
        float ra2 = read.nextFloat();
        System.out.print("Digues la nota del RA3: ");
        float ra3 = read.nextFloat();
        System.out.print("Digues la nota del RA4: ");
        float ra4 = read.nextFloat();

        String valorRA1 = (ra1 >= 5) ? "aprovat" : "suspès";
        String valorRA2 = (ra2 >= 5) ? "aprovat" : "suspès";
        String valorRA3 = (ra3 >= 5) ? "aprovat" : "suspès";
        String valorRA4 = (ra4 >= 5) ? "aprovat" : "suspès";

        float notaFinal = (ra1 + ra2 + ra3 + ra4) / 4;

        DecimalFormat format = new DecimalFormat("#.0");

        System.out.println("RA1: "+ ra1 + "\tRA2: " + ra2 + "\tRA3: " + ra3 + "\tRA4: " + ra4);

        //System.out.println("La nota màxima entre l’RA1 i l’RA2 és: " + Math.max(ra1, ra2));
        //System.out.println("La nota mínima entre l’RA3 i l’RA4 és: " + Math.min(ra3, ra4));
        System.out.println("El RA1 ha quedat " + valorRA1);
        System.out.println("El RA2 ha quedat " + valorRA2);
        System.out.println("El RA3 ha quedat " + valorRA3);
        System.out.println("El RA4 ha quedat " + valorRA4);
        System.out.println("Nota final M0485: " + format.format(notaFinal));
        System.out.println("Nota expedient arrodonida: " + Math.round(notaFinal));
        System.out.print("Ha aprovat? ");
        System.out.print(notaFinal>=5.0f);
        read.close();*/

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Digues un número entre 1 i 100: ");
        int yourNumber = read.nextInt();

        int randomNumber = (int)(Math.random() * 101);

        String compNumeros = (yourNumber == randomNumber) ? ("Has acertat el nombre, el nombre és " + randomNumber) : ("No has acertat el nombre, el nombre és " + randomNumber);
        System.out.println(compNumeros);
        read.close();*/

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Digues un número entre 1 i 10: ");
        int yourNumber = read.nextInt();

        int randomNumber = (int)(Math.random() * 11);

        if (yourNumber == randomNumber){
            System.out.println("Has acertat el nombre, el nombre era " + randomNumber);
        } else {
            String diferencia = (yourNumber < randomNumber) ? "El numero aleatori és més gran" : "El numero aleatori és més petit";
            System.out.println(diferencia);
            System.out.print("Has fallat, torna a dir un número entre 1 i 10: ");
            yourNumber = read.nextInt();

            if (yourNumber == randomNumber){
                System.out.println("Has acertat el nombre, el nombre era " + randomNumber);
            } else {
                System.out.print("Has tornat a fallar, el nombre era " + randomNumber);
            }
        }

        read.close();*/

        // Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Escriu el teu nom d’usuari i la contrasenya: ");
        String nomUsuari = read.nextLine();
        String contrasenyaUsuari = read.nextLine();

        final String USERNAME = "iker.delgado";
        final String USERPASSWORD = "delgado19";

        boolean usuariCorrecte = USERNAME.equals(nomUsuari) && USERPASSWORD.equals(contrasenyaUsuari);

        if (usuariCorrecte) {
            System.out.println("Acces aprovat!");
        } else {
            System.out.println("Acces denegat!");
        }

        read.close();
         */

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Digues un nombre: ");
        int nombre = read.nextInt();

        if (nombre > 10){
            System.out.println("EL nombre és més gran de 10");
            if (nombre > 20) {
                System.out.println("EL nombre és més gran de 20");
            }
        }
        read.close();
         */

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Quina hora és? ");
        int hora = read.nextInt();

        if (hora >= 6 && hora < 12){
            System.out.println("Bon dia!!!");
        } else if (hora >= 12 && hora <16){
            System.out.println("Bon migdia!!!");
        } else if (hora >= 16 && hora < 20){
            System.out.println("Bona tarda!!!");
        } else if ((hora >= 20 && hora <= 24) || (hora >= 0 && hora < 6)){
            System.out.println("Bona nit!!!");
        } else {
            System.out.println("[!] Error - Nombre no valid");
        }
        read.close();
         */


        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Introdueix una paraula: ");
        String paraulaCapiCua = read.nextLine();
        boolean esCapiCua = paraulaCapiCua.charAt(0) == paraulaCapiCua.charAt(paraulaCapiCua.length()-1);

        if (esCapiCua) {
            System.out.println("Aquesta paraula és cap-i-cua");
        } else {
            System.out.println("Aquesta paraula no és cap-i-cua");
        }
        read.close();*/

        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Introdueix el modul i al seva nota:");
        String modul = read.nextLine();
        float notaModul = read.nextFloat();

        if (notaModul >= 9.0f && notaModul <= 10.0f) {
            System.out.println("Has tret un excel·lent al módul de " + modul);
        } else if(notaModul >= 7.0f ){
            System.out.println("Has tret un notable al módul de " + modul);
        }  else if(notaModul >= 5.0f ){
            System.out.println("Has aprovat el módul de " + modul);
        } else if(notaModul < 5.0f && notaModul >= 0.0f){
            System.out.println("Has suspès el módul de " + modul);
        } else {
            System.out.println("[!] Error - Nombre no valid");
        }

        read.close();*/


        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.println("Introdueix la teva edat:");
        int edat = read.nextInt();

        if(edat >= 18){
            System.out.println("Ets major de edat");
        } else {
            System.out.println("Ets menor de edat");
        }
        System.out.println("Felicitats pels teus " + edat + " anys.");
        read.close();*/

        //Exercici
        /*String name = "Iker Delgado";
        int age = 18;
        float height = 1.70f;
        String drivingLicence = "no";

        System.out.println("El meu nom és " + name + ", tinc " + age + " anys i medeixo " + height + "m d'altura i " + drivingLicence + " tinc carnet de conduir.");

        double valor = 18.38173d;
        int valorInteger = (int) valor;

        System.out.println("El valor amb double és " + valor + " i el valor amb int és " + valorInteger);

        final double PI = 3.1415926535d;
        int radi = 4;

        double area = PI * Math.pow(radi, 2);
        System.out.println("L'area del circle és: " +area);

        int a=4, b=7, c=2;
        System.out.println(a>0 && b<10);
        System.out.println(b==7 || c>0);
        System.out.println(!(a<b));

        Scanner read = new Scanner(System.in);
        System.out.print("Escriu una paraula: ");
        String word = read.nextLine();


        System.out.println("\nS'ha escriu paraula " + word + ", en majuscula seria " + word.toUpperCase() + ", en minuscula seria " + word.toUpperCase() + ", el seu primer caracter és " + word.charAt(0) + " i té " + word.length() + " caracters.");


        System.out.print("Digues un número entre 1 i 50: ");
        int yourNumber = read.nextInt();
        int randomNumber = (int)(Math.random() * 51);
        boolean result = yourNumber==randomNumber;
        System.out.println("\nEl numero aleatori es: " + randomNumber + " i el número que has dit tu es: " + yourNumber + ". El resultat és: " + result);

        System.out.print("Digues un nombre: ");
        int firstNumber = read.nextInt();
        System.out.print("Digues un altra nombre: ");
        int secondNumber = read.nextInt();
        boolean equals = firstNumber==secondNumber;
        System.out.println("Els dos nombres son iguals? " + equals + ". El nombre més gran és " + Math.max(firstNumber, secondNumber) + " i el nombre més petit és " + Math.min(firstNumber, secondNumber));

        System.out.print("Digues nota 1: ");
        float nota1 = read.nextFloat();
        System.out.print("Digues nota 2: ");
        float nota2 = read.nextFloat();
        System.out.print("Digues nota 3: ");
        float nota3 = read.nextFloat();
        float notaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.println("Mitjana: " + notaFinal);

        System.out.print("\nDigues una quantitat de metres: ");
        float metres = read.nextFloat();

        float quilometres = metres / 1000;

        System.out.println(metres + "m és equivalent a " + quilometres + "km");

        System.out.print("\nDigues un numero enter: ");
        int integer = read.nextInt();

        System.out.println("El nombre absoult de " + integer + " és " + Math.abs(integer));

        System.out.print("Digues el radi de l'esfera: ");
        double radiEsfera = read.nextFloat();

        double areaEsfera = 4 * PI * Math.pow(radiEsfera, 2);
        double volumEsfera = 4 / 3 * PI * Math.pow(radiEsfera, 2);

        System.out.println("Area de l'esfera és " + areaEsfera + " i el seu volum és " + volumEsfera); */


        //Exercici
        /*Scanner read = new Scanner(System.in);
        System.out.print("Digues un número entre 1 i 100: ");
        int yourNumber = read.nextInt();

        int randomNumber = (int)(Math.random() * 101);

        System.out.print("\nEl numero aleatori es: " + randomNumber + " i el número que has dit tu es: " + yourNumber + ". El resultat és: ");
        System.out.println(randomNumber==yourNumber);*/

        //Exercici
        //Scanner read = new Scanner(System.in);
        /*System.out.print("Escriu una paraula: ");
        String word = read.nextLine();
        System.out.print("Escriu la lletra que vols buscar: ");
        String leter = read.nextLine();
        String lowerWord = word.toLowerCase();
        String lowerLeter = leter.toLowerCase();

        System.out.println("\nLa lletra \"" + leter + "\" apareix a la posició \"" + lowerWord.indexOf(lowerLeter) + "\" de la paraula \"" + word + "\"");*/

        //Exercici
        //Scanner read = new Scanner(System.in);
        /*System.out.print("Escriu el teu nom: ");
        String name = read.nextLine();
        System.out.print("Escriu el teu cognom: ");
        String lastname = read.nextLine();
        System.out.print("Escriu el teu segon cognom: ");
        String secondLastname = read.nextLine();

        System.out.println(name.toUpperCase() + " " +  lastname.toLowerCase() + " " + secondLastname.toLowerCase() + ", cognoms iguals: " + lastname.equals(secondLastname));*/

        //Exercici
        /*System.out.print("Escriu un nombre de 4 digits: ");
        String num = read.nextLine();

        System.out.println("Els dígits del teu número són: " + num.charAt(0) + ", " + num.charAt(1) + ", " + num.charAt(2) + ", " + num.charAt(3));*/



        // Exercici 1
        /*Scanner read = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        int number = read.nextInt();
        int result = number % 2;
        System.out.println(result==0);*/

        // Exercici 2
        //Scanner read = new Scanner(System.in);
        /*System.out.print("Escriu el nom del producte: ");
        String productName = read.nextLine();
        System.out.print("Escriu el preu del producte: ");
        float productPrice = read.nextFloat();
        System.out.print("Escriu les unitats del producte: ");
        int productUnits = read.nextInt();
        System.out.print("Escriu el descompte del producte: ");
        int productDiscount = read.nextInt();

        DecimalFormat format = new DecimalFormat("#.00");
        float finalPrice = (productPrice*(1-((float)productDiscount / 100))) * productUnits;
        float estalvi = productUnits*productPrice - finalPrice;

        System.out.println("Ha comprat " + productUnits + " unitats de " + productName + ", tot costarà " + format.format(finalPrice) + "€ i s'ha estalviat un total de " + format.format(estalvi) + "€.");

        read.close();*/

        // Exercici 1
        /*Scanner read = new Scanner(System.in);

        System.out.print("\nEscriu l'altura del rectangle: ");
        float height = read.nextFloat();
        System.out.print("Escriu l'amplada del rectangle: ");
        float weight = read.nextFloat();

        float area = height*weight;
        float perimetre = height*2 + height*2;

        System.out.println("\nL'àrea del rectangles es " + area + "cm² i el seu perímetre es " + perimetre + "cm.");

        // Exercici 2
        //Scanner read = new Scanner(System.in);

        System.out.print("\nEscriu el primer nombre: ");
        float firstNumber = read.nextFloat();
        System.out.print("Escriu el segon nombre: ");
        float secondNumber = read.nextFloat();

        float sum = firstNumber + secondNumber;
        float res = firstNumber - secondNumber;
        float mul = firstNumber * secondNumber;
        float div = firstNumber / secondNumber;

        System.out.println("\nEl resultat de la suma dels nombres " + firstNumber + " més " + secondNumber + " és " + sum);
        System.out.println("El resultat de la resta dels nombres " + firstNumber + " menys " + secondNumber + " és " + res);
        System.out.println("El resultat de la multiplicació dels nombres " + firstNumber + " multiplicat per " + secondNumber + " és " + mul);
        System.out.println("El resultat de la divisió dels nombres " + firstNumber + " dividit per " + secondNumber + " és " + div);

        // Exercici 3
        //Scanner read = new Scanner(System.in);
        System.out.print("\nEscriu un nombre de quatre digits: ");
        int numberFourChar = read.nextInt();

        int num1 = (numberFourChar / 1000) % 10;
        int num2 = (numberFourChar / 100) % 10;
        int num3 = (numberFourChar / 10) % 10;
        int num4 = numberFourChar % 10;

        System.out.println("\nEl primer digit és " + num1 + " el segon digit és " + num2 + " el tercer digit és " + num3 + " i el quart digit és " + num4 + ".");
        read.close();*/

        /*Scanner read = new Scanner(System.in);

        System.out.print("Nom: ");
        String name = read.nextLine();
        System.out.print("Edat: ");
        int age = read.nextInt();
        System.out.print("Altura(m): ");
        float height = read.nextFloat();

        DecimalFormat format = new DecimalFormat("#.00");

        System.out.println("\nBenviguda " + name + ", tens " + age + " anys i fas " + format.format(height)+ "m d'alçada.");*/

        //Exercici RA1
        /*System.out.print("Digues la nota del RA1: ");
        float ra1 = read.nextFloat();
        System.out.print("Digues la nota del RA2: ");
        float ra2 = read.nextFloat();
        System.out.print("Digues la nota del RA3: ");
        float ra3 = read.nextFloat();
        System.out.print("Digues la nota del RA4: ");
        float ra4 = read.nextFloat();


        float notaFinal = (ra1 + ra2 + ra3 + ra4) / 4;

        DecimalFormat format = new DecimalFormat("#.0");

        System.out.println("RA1: "+ ra1 + "\tRA2: " + ra2 + "\tRA3: " + ra3 + "\tRA4: " + ra4);

        System.out.println("La nota màxima entre l’RA1 i l’RA2 és: " + Math.max(ra1, ra2));
        System.out.println("La nota mínima entre l’RA3 i l’RA4 és: " + Math.min(ra3, ra4));
        System.out.println("Nota final M0485: " + format.format(notaFinal));
        System.out.println("Nota expedient arrodonida: " + Math.round(notaFinal));
        System.out.print("Ha aprovat? ");
        System.out.print(notaFinal>=5.0f);*/

        /*LocalTime now;
        int secondsNow;
        final int SECONDSOFDAY = 86399;
        int secondsToFinal;
        double persentageOfDay;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        now = LocalTime.now();
        secondsNow = now.toSecondOfDay();
        secondsToFinal = SECONDSOFDAY - secondsNow;
        persentageOfDay = ((double) secondsNow / SECONDSOFDAY) * 100;

        System.out.println("Hora actual: " + now.format(format));
        System.out.println("\t> Segons des de mitja nit: " + secondsNow);
        System.out.println("\t> Segons fins al final del dia: " + secondsToFinal);
        System.out.println("Ha passat el " + persentageOfDay + "% del dia");*/


        /*float celcius = 12.5f;
        float farenheit;

        farenheit = (celcius * 9 / 5) + 32;

        System.out.println("La temperatura d'aviu és de " + celcius + "ª Celcius, o bé, " + farenheit + "ª Farenheit.");*/

        /*String name = "Andres";
        String lastname = "Garcia";
        String gender = "Home";
        int age = 28;
        float weight = 70f; // KG
        float height = 175f; // CM
        float imc;
        imc = weight / ((height/100) * (height/100));

        System.out.println(name + " " + lastname + ", " + gender + ", " + age + " anys, " + weight + "kg, " + height + "cm");
        System.out.println("IMC: " + imc); */


        // System.out.println(ahora);

        /*String dayName, monthName;
        //Convertors
        String dayString, yearString;*/
        // int year, day; (No l'he utilitzat perque al preguntar es genera un string i com no es te que fer cap formula l'he deixat tal qual)

        /*Scanner ScannerWord = new Scanner (System.in);
        System.out.println("Indica el dia del mes: ");
        dayString = ScannerWord.nextLine();
        System.out.println("Indica el dia de la setmana: ");
        dayName = ScannerWord.nextLine();
        System.out.println("Indica el nom del mes: ");
        monthName = ScannerWord.nextLine();
        System.out.println("Indica l'any: ");
        yearString = ScannerWord.nextLine();*/

        /*day = Integer.parseInt(dayString);
        year = Integer.parseInt(yearString);*/



        /*System.out.println("-------------------------------------");
        System.out.println(dayName + " " + dayString + " de " + monthName + " del " + yearString);
        System.out.println("-------------------------------------");*/

        /*// Variables Circumferencia
        float radi = 31.5f;
        final float PI = 3.1415926535f;
        float areaCircle;
        float perimetreCircle;

        // Variables Rectangle
        float alçadaRectangle = 10.9f;
        float ampladaRectangle = 3.2f;
        float areaRectangle, perimetreRectangle;

        // Formules Circumferencia
        areaCircle = PI * (radi*radi);
        perimetreCircle = PI * radi * 2;

        // Variables Rectangle
        areaRectangle = alçadaRectangle * ampladaRectangle;
        perimetreRectangle = (2*alçadaRectangle) + (2*ampladaRectangle);

        // Prints Circumferencia
        System.out.println("El area del circle és: " + areaCircle);
        System.out.println("El perímetre del circle és: " + perimetreCircle);

        // Prints Rectangled
        System.out.println("El area del rectangle és: " + areaRectangle);
        System.out.println("El perímetre del rectangle és: " + perimetreRectangle);*/


    }
}
