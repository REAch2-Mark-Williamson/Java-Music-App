import java.util.Scanner;

public class App {

    // Declaring varables
    private static boolean Run_Program = true;

    public static void main(String[] args) throws Exception {
        while (Run_Program == true) { //Checks if the program should run
            CLI_Controller();
        }
    }

    static void CLI_Controller() { // Manages the Command line Interface (CLI) the user see's
        while (Run_Program == true) {
            int Selected_Option = CLI_Main_Menu();

            // Determens what action to run.
            switch(Selected_Option) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5: // Exit's program
                    Run_Program = false;
                    break;
                default:
                    System.out.println("oops! There has been an unexpected error. Please try again.");

            }
        }
    }

    static int CLI_Main_Menu() { // Displays the CLI main menu when called
        // Prints intro text and question
        System.out.println("-------------------------------------\nWelcome to the Command Line music app\n-------------------------------------\n\nWhat would you like to do?\n\n(1) Add a new song\n(2) Remove a song\n(3) Display all songs\n(4) Display songs over a given number of plays\n(5) Exit");
        
        // Asks for Main Menu Input and error checks
        int Main_Menu_Input = 0;
        Scanner Menu_User_Input = new Scanner(System.in);

        while (Main_Menu_Input < 1 || Main_Menu_Input > 5) {
            Main_Menu_Input = Menu_User_Input.nextInt();
            if (Main_Menu_Input < 1 || Main_Menu_Input > 5) {
                System.out.println("Sorry that is not valid. Please enter a number between 1 and 5");
            }
        }

        // Returns the user's input so it can be used in the CLI_Controller methord
        return Main_Menu_Input;
    }
}
