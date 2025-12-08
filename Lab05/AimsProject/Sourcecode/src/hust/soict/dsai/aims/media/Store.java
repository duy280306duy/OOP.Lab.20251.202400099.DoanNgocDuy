package hust.soict.dsai.aims.media;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS];
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public void addMedia(Media media) {
	    if (!itemsInStore.contains(media)) {
	        itemsInStore.add(media);
	        System.out.println("The media has been added to the store.");
	    } else {
	        System.out.println("This media already exists in the store.");
	    }
	}
	public void removeMedia(Media media) {
	    if (itemsInStore.contains(media)) {
	        itemsInStore.remove(media);
	        System.out.println("The media has been removed from the store.");
	    } else {
	        System.out.println("This media does not exist in the store.");
	    }
	}


}
