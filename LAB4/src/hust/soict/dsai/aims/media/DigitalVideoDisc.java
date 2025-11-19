package ff;

	public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
    public class DigitalVideoDisc extends Media 
    public class DigitalVideoDisc extends Disc {

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }  

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public boolean isMatch(String title) {
        if (title == null) return false;
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
   
    
    public String toString() {
        return "DVD - [" + id + "] - [" + title + "] - [" + category + "] - [" +
                director + "] - [" + length + " mins] : [" + cost + " $]";
    }

}
