package hust.soict.dsai.aims.media;

public class Book extends Media 
public class Book {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	 public boolean addAuthor(String authorName) {
	        if (authors.contains(authorName)) {
	            authors.add(authorName);
	            return true;
	        }
	        return false; 
	    }	  
	    public boolean removeAuthor(String authorName) {
	        if (authors.contains(authorName)) {
	            authors.remove(authorName);
	            return true; 
	        }
	        return false; 
	    }

}
