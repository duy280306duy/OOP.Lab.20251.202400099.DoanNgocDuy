package ff;

public class Cart {
   public static final int MAX_NUMBERS_ORDERED = 20;
   private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
   private int qtyOrdered = 0;
   public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
       if (qtyOrdered >= MAX_NUMBERS_ORDERED) { System.out.println("The cart is full. Cannot add more items."); return false; }
       itemsOrdered[qtyOrdered++] = disc;
       System.out.println("The disc has been added.");
       if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) System.out.println("The cart is almost full");
       return true;
   }

   public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
       int idx = -1;
       for (int i = 0; i < qtyOrdered; i++) if (itemsOrdered[i] == disc) { idx = i; break; }
       if (idx == -1) { System.out.println("The disc was not found in the cart."); return false; }
       for (int i = idx; i < qtyOrdered - 1; i++) itemsOrdered[i] = itemsOrdered[i + 1];
       itemsOrdered[--qtyOrdered] = null;
       System.out.println("The disc has been removed.");
       return true;
   }

   public float totalCost() {
       float sum = 0f; for (int i = 0; i < qtyOrdered; i++) sum += itemsOrdered[i].getCost(); return sum;
   }

   public void printCart() {
       System.out.println("=== CURRENT CART ===");
       for (int i = 0; i < qtyOrdered; i++) System.out.printf("%2d) %s%n", i + 1, itemsOrdered[i]);
       System.out.printf("Total cost: %.2f%n", totalCost());
       System.out.println("====================");
   }
}

