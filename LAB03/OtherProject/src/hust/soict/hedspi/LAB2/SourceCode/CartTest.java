package ff;
public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();
     
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 90, 18.99f);
      
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        cart.printCart();
       
        cart.searchById(2);
        cart.searchById(5);
    
        cart.searchByTitle("Star");
        cart.searchByTitle("King");
        cart.searchByTitle("Aladdin");
    }
}
