import java.util.ArrayList;
import java.util.Scanner;

public class Song_Manager {
    //Declares varibles
    private ArrayList<Song_Data> Songs;
    private Scanner SM_Scanner;
    
    //Song Manager class Constructor
    public Song_Manager() {
        Songs = new ArrayList<Song_Data>();
        SM_Scanner = new Scanner(System.in);
    }

    //Adds Song to the Array list
    public void Add_Song(Song_Data Song) {
        Songs.add(Song);
    }

    //Add's user inputed song
    public void Add_User_Song() {
        System.out.print("Enter song title: ");
        String New_Title = SM_Scanner.nextLine();

        System.out.print("Enter artist name: ");
        String New_Artist = SM_Scanner.nextLine();

        System.out.print("Enter play count: ");
        int New_Play_Count = SM_Scanner.nextInt();
        SM_Scanner.nextLine();

        Song_Data song = new Song_Data(New_Title, New_Artist, New_Play_Count);
        Add_Song(song);
    }

    //Removes a song from the Array list
    public void Remove_Song() {
        System.out.println("Enter song title: ");
        String Song_Title = SM_Scanner.nextLine();
        for (int Song_Index = 0; Song_Index < Songs.size(); Song_Index++) {
            if (Songs.get(Song_Index).Get_Song_Title().equals(Song_Title)) {
                Songs.remove(Song_Index);
                System.out.println(Song_Title + " removed successfully.");
                return;
            }
        }

        System.out.println(Song_Title + " not found.");
    }

    //Reterns songs in the Array list
    public ArrayList<Song_Data> Get_Songs() {
        return Songs;
    }

}
