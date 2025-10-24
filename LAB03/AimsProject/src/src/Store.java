package src;

public class Store {	
	    
	    private List<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	    
	    public void addDVD(DigitalVideoDisc dvd) {
	        if (dvd == null) {
	            System.out.println("Cannot add null DVD!");
	            return;
	        }
	        itemsInStore.add(dvd);
	        System.out.println("Added DVD to store: " + dvd.getTitle());
	    }
	    
	    public void removeDVD(DigitalVideoDisc dvd) {
	        if (dvd == null) {
	            System.out.println("Cannot remove null DVD!");
	            return;
	        }

	        if (itemsInStore.remove(dvd)) {
	            System.out.println("Removed DVD from store: " + dvd.getTitle());
	        } else {
	            System.out.println("DVD not found in store: " + dvd.getTitle());
	        }
	    }

	   
	    public void printStore() {
	        System.out.println("*************** STORE ITEMS ***************");
	        if (itemsInStore.isEmpty()) {
	            System.out.println("Store is empty.");
	        } else {
	            for (int i = 0; i < itemsInStore.size(); i++) {
	                System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
	            }
	        }
	        System.out.println("*******************************************");
	    }
	}

}
