package hust.soict.dsai.aims.media;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        
        Media cd = new CompactDisc("CD Sample", "Pop", "Artist Name", 50);
        Media dvd = new DigitalVideoDisc("DVD Sample", "Action", 90);
        Media book = new Book("Book Sample", "Education", 150);
        
        mediae.add(dvd);
        mediae.add(book);
        
        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
