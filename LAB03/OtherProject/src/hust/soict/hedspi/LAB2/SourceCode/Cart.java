package ff;


public class Cart {
    private List<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) return;
        itemsOrdered.add(disc);
        System.out.println("Added: " + disc.getTitle());
    }

    
    public void printCart() {
        System.out.println("*********************** CART ***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("****************************************************");
    }

   
    public float totalCost() {
        float sum = 0;
        for (DigitalVideoDisc d : itemsOrdered) {
            sum += d.getCost();
        }
        return sum;
    }

    
    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc d : itemsOrdered) {
            if (d.getId() == id) {
                System.out.println("Found DVD by ID " + id + ": " + d);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID = " + id);
        }
    }

   
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for title \"" + title + "\":");
        for (DigitalVideoDisc d : itemsOrdered) {
            if (d.isMatch(title)) {
                System.out.println(d);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
