package hust.soict.dsai.aims.media;

public class CompactDisc extends Disc implements Playable {
public void play() {
    System.out.println("Playing CD: " + this.getTitle());
    System.out.println("Artist: " + this.artist);
    System.out.println("CD length: " + this.getLength());
    System.out.println("Tracks:");

    for (Track t : tracks) {
        t.play();
public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, 
                       int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }   
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println(track.getTitle());
        } else {
            tracks.add(track);
            System.out.println(track.getTitle());
        }
    }  
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track.getTitle());
        } else {
            System.out.println(track.getTitle());
        }
    }    
    public int getLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }
}
