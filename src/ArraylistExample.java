import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    private static Object ArraylistExample;

    public static void main(String[] args) {

        System.out.println("*****MenyVal*****");
        System.out.println("1. Färger");
        System.out.println("2. Filmer");
        System.out.println("3. Quit");

        Scanner myScanner = new Scanner(System.in);
        boolean programRunning = true;
        boolean farger = true;
        boolean quit = true;
        boolean filmer = true;
        int MenuChoice = myScanner.nextInt();



        while (programRunning) {


            if (farger == true) {
                        ArrayList < String > colors = new ArrayList<String>();
                colors.add("Red");
                colors.add("Green");
                colors.add("Blue");
                colors.add("Pink");
                colors.add("Grey");
                System.out.println(colors);

            } if (filmer == true){

                ArrayList<String> movies = new ArrayList<>();
                movies.add("Idiot1");
                movies.add("Idiot2");
                movies.add("Idiot3");
                movies.add("Idiot4");
                movies.add("Idiot5");
                System.out.println(movies);
            }
            else if(quit == false) {
            break;
            }



        }
        return;
    }
}

