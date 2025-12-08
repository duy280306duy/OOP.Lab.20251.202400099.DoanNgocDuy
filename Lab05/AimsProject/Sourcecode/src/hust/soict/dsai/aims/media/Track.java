package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void play() {
        System.out.println("Playing Track: " + this.title);
        System.out.println("Track length: " + this.length);
    }
   
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Track other = (Track) obj;
        return this.getTitle().equalsIgnoreCase(other.getTitle())
                && this.getLength() == other.getLength();
    }

    
}
