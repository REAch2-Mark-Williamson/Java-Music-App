import java.util.Scanner; //Import the Scanner Class


public class Main {
    public static void main(String[] args) {
        CLI_Controller();
        
    }

    static void CLI_Controller() { // Manages the Command line Interface (CLI) the user see's
        int Test1 = CLI_Main_Menu();
        System.out.println("Test1: " + Test1);

        int Test2 = CLI_Main_Menu();
        System.out.println("Test2: " + Test2);

        //Add Switch statment here for diffrent options
    }

    static int CLI_Main_Menu() { // Displays the CLI main menu when called
        // Prints intro text and question
        System.out.println("-------------------------------------\nWelcome to the Command Line music app\n-------------------------------------\n\nWhat would you like to do?\n\n(1) Add a new song\n(2) Remove a song\n(3) Display all songs\n(4) Display songs over a given number of plays");
        
        // Asks for Main Menu Input and error checks
        int Main_Menu_Input = 0;
        Scanner Menu_User_Input = new Scanner(System.in);

        while (Main_Menu_Input < 1 || Main_Menu_Input > 4) {
            Main_Menu_Input = Menu_User_Input.nextInt();
            if (Main_Menu_Input < 1 || Main_Menu_Input > 4) {
                System.out.println("Sorry that is not valid. Please enter a number between 1 and 4");
            }
        }

        // Returns the user's input so it can be used in the CLI_Controller methord
        return Main_Menu_Input;
    }

}
