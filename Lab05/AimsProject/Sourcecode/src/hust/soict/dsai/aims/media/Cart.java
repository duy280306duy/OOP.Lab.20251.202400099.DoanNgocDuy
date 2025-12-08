package hust.soict.dsai.aims.media;

public class Cart {
    
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
   
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Item already in cart: " + media.getTitle());
        } else {
            itemsOrdered.add(media);
            System.out.println("Added to cart: " + media.getTitle());
        }
    }
    
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed from cart: " + media.getTitle());
        } else {
            System.out.println("Item not found in cart: " + media.getTitle());
        }
    }
    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) {
            total += m.getCost();
        }
        return total;
    }

   
    public void printCart() {
        System.out.println("------ CART ------");
        for (Media m : itemsOrdered) {
            System.out.println(m.getTitle() + " - " + m.getCost());
        }
        System.out.println("Total cost: " + totalCost());
    }
}
