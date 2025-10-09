package ff;

public class CartTest {


    public static void main(String[] args) {
        
        Cart cart = new Cart();

        // Tạo vài đĩa DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1", "Category 1", "Director 1", 100, 20.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2", "Category 2", "Director 2", 120, 25.0f);

        
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);

      
        System.out.println("Before removing:");
        cart.displayCart();

        
        cart.removeDigitalVideoDisc(dvd1);

        
        System.out.println("\nAfter removing:");
        cart.displayCart();
    }
}

