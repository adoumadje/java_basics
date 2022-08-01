public class Song {
    private String title;
    private String artiste;
    private int length;

    public Song (String title, String artiste, int length) {
        this.title = title;
        this.artiste = artiste;
        this.length = length;
    }

    public void playSong() {
        System.out.println("Playing: "+this.title+" By: "+this.artiste);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
