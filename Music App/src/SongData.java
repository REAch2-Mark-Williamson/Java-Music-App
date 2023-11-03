public class SongData {
    //Declares varibles
    private String Song_Title;
    private String Artist_Name;
    private int Play_Count;

    //Song class Constructor
    public SongData(String Song_Title, String Artist_Name, int Play_Count) {
        this.Song_Title = Song_Title;
        this.Artist_Name = Artist_Name;
        this.Play_Count = Play_Count;
    }

    //Returns the Song title
    public String Get_Song_Title() {
        return Song_Title;
    }

    //Sets the song title
    public void Set_Song_Title(String Song_Title) {
        this.Song_Title = Song_Title;
    }

    //Returns the artist
    public String Get_Artist_Name() {
        return Artist_Name;
    }

    //Sets the artist
    public void Set_Artist_Name(String Artist_Name) {
        this.Artist_Name = Artist_Name;
    }

    //Returns the play count
    public int Get_Play_Count() {
        return Play_Count;
    }

    //Sets the play count
    public void Set_Play_Count(int Play_Count) {
        this.Play_Count = Play_Count;
    }
}
