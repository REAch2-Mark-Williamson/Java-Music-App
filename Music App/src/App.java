import java.util.Scanner;

public class App {

    //Declaring varables
    private static boolean Run_Program = true;

    public static void main(String[] args) throws Exception {

        //Sets default songs
        SongManager Song_List = new SongManager();
        Song_List.Add_Song(new SongData("Song 1", "Artist 1", 10));
        Song_List.Add_Song(new SongData("Song 2", "Artist 2", 20));
        Song_List.Add_Song(new SongData("Song 3", "Artist 3", 30));

        
        CLI_Controller(Song_List);
    }

    static void CLI_Controller(SongManager Song_List) { // Manages the Command line Interface (CLI) the user see's
        while (Run_Program == true) {
            int Selected_Option = CLI_Main_Menu();

            // Determens what action to run.
            switch(Selected_Option) {
                case 1: //Add new song
                    Song_List.Add_User_Song();
                    break;
                case 2: //Remove a song
                    Song_List.Remove_Song();
                    break;
                case 3: //Display all songs
                    for (SongData song : Song_List.Get_Songs()) {
                        System.out.println("Song: " + song.Get_Song_Title() + "\nArtist: " + song.Get_Artist_Name() + "\nPlay count: " + song.Get_Play_Count() + "\n\n");
                    }
                    break;
                case 4: //Display songs over a given number of plays
                    System.out.println("Enter the minimum number for song plays you want to see: ");
                    Scanner Filter_Scanner = new Scanner(System.in);
                    int Min_Song_Plays = Filter_Scanner.nextInt();
                    for (SongData song : Song_List.Get_Songs()) {
                        if (song.Get_Play_Count() >= Min_Song_Plays) {
                            System.out.println("Song: " + song.Get_Song_Title() + "\nArtist: " + song.Get_Artist_Name() + "\nPlay count: " + song.Get_Play_Count() + "\n\n");
                        }
                    }
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
        //Prints intro text and question
        System.out.println("-------------------------------------\nWelcome to the Command Line music app\n-------------------------------------\n\nWhat would you like to do?\n\n(1) Add a new song\n(2) Remove a song\n(3) Display all songs\n(4) Display songs over a given number of plays\n(5) Exit");
        
        //Asks for Main Menu Input and error checks
        int Main_Menu_Input = 0;
        Scanner Menu_User_Input = new Scanner(System.in);

        while (Main_Menu_Input < 1 || Main_Menu_Input > 5) {
            Main_Menu_Input = Menu_User_Input.nextInt();
            if (Main_Menu_Input < 1 || Main_Menu_Input > 5) {
                System.out.println("Sorry that is not valid. Please enter a number between 1 and 5");
            }

            //Closes scanner when no longer reqired
            if (Main_Menu_Input == 5) {
                Menu_User_Input.close();
            }

        }

        // Returns the user's input so it can be used in the CLI_Controller methord
        return Main_Menu_Input;
    }
}
