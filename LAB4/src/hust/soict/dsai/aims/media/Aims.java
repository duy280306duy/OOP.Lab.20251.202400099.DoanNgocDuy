package hust.soict.dsai.aims.media;
public class Aims {

	    private static Store store = new Store();
	    private static Cart cart = new Cart();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {

	        

	        while (true) {
	            showMenu();
	            int choice = getIntInput();

	            switch (choice) {
	                case 1:
	                    viewStore();
	                    break;
	                case 2:
	                    updateStore();
	                    break;
	                case 3:
	                    viewCart();
	                    break;
	                case 0:
	                    System.out.println("Exiting AIMS. Goodbye!");
	                    return;
	                default:
	                    System.out.println("Invalid input! Please choose again.");
	            }
	        }
	    }	  
	 
	    public static void showMenu() {
	        System.out.println("AIMS: ");
	        System.out.println("--------------------------------");
	        System.out.println("1. View store");
	        System.out.println("2. Update store");
	        System.out.println("3. See current cart");
	        System.out.println("0. Exit");
	        System.out.println("--------------------------------");
	        System.out.println("Please choose a number: 0-1-2-3");
	    }

	    
	    public static void viewStore() {
	        while (true) {
	            System.out.println("\n************************ STORE ************************");
	            store.printStore();

	            storeMenu();
	            int choice = getIntInput();

	            switch (choice) {
	                case 1:
	                    seeMediaDetails();
	                    break;
	                case 2:
	                    addMediaToCart();
	                    break;
	                case 3:
	                    playMedia();
	                    break;
	                case 4:
	                    viewCart();
	                    break;
	                case 0:
	                    return;
	                default:
	                    System.out.println("Invalid input!");
	            }
	        }
	    }

	    public static void storeMenu() {
	        System.out.println("Options: ");
	        System.out.println("--------------------------------");
	        System.out.println("1. See a media’s details");
	        System.out.println("2. Add a media to cart");
	        System.out.println("3. Play a media");
	        System.out.println("4. See current cart");
	        System.out.println("0. Back");
	        System.out.println("--------------------------------");
	        System.out.println("Please choose a number: 0-1-2-3-4");
	    }

	  
	    public static void seeMediaDetails() {
	        System.out.print("Enter media title: ");
	        String title = scanner.nextLine();
	        Media media = store.searchByTitle(title);

	        if (media == null) {
	            System.out.println("Media not found.");
	            return;
	        }

	        System.out.println(media.toString());

	        while (true) {
	            mediaDetailsMenu();
	            int choice = getIntInput();

	            switch (choice) {
	                case 1:
	                    cart.addMedia(media);
	                    System.out.println("Added to cart.");
	                    break;
	                case 2:
	                    if (media instanceof Playable) {
	                        ((Playable) media).play();
	                    } else {
	                        System.out.println("This item cannot be played.");
	                    }
	                    break;
	                case 0:
	                    return;
	                default:
	                    System.out.println("Invalid input.");
	            }
	        }
	    }

	    public static void mediaDetailsMenu() {
	        System.out.println("Options: ");
	        System.out.println("--------------------------------");
	        System.out.println("1. Add to cart");
	        System.out.println("2. Play");
	        System.out.println("0. Back");
	        System.out.println("--------------------------------");
	        System.out.println("Please choose a number: 0-1-2");
	    }

	    
	    public static void addMediaToCart() {
	        System.out.print("Enter the title of media to add: ");
	        String title = scanner.nextLine();
	        Media media = store.searchByTitle(title);

	        if (media == null) {
	            System.out.println("Media not found!");
	            return;
	        }

	        cart.addMedia(media);
	        System.out.println("Media added to cart.");

	        if (media instanceof DigitalVideoDisc) {
	            System.out.println("Current number of DVDs in cart: " + cart.countDVD());
	        }
	    }

	    public static void playMedia() {
	        System.out.print("Enter title of media to play: ");
	        String title = scanner.nextLine();
	        Media media = store.searchByTitle(title);

	        if (media == null) {
	            System.out.println("Media not found.");
	            return;
	        }

	        if (media instanceof Playable) {
	            ((Playable) media).play();
	        } else {
	            System.out.println("This media cannot be played.");
	        }
	    }

	  
	    public static void updateStore() {
	        System.out.println("1. Add media to store");
	        System.out.println("2. Remove media from store");
	        System.out.println("0. Back");

	        int choice = getIntInput();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter title of media to add:");
	                String newTitle = scanner.nextLine();
	                // You would create a Media object here...
	                break;
	            case 2:
	                System.out.println("Enter title of media to remove:");
	                String removeTitle = scanner.nextLine();
	                Media media = store.searchByTitle(removeTitle);
	                if (media != null) {
	                    store.removeMedia(media);
	                    System.out.println("Removed from store.");
	                } else {
	                    System.out.println("Media not found.");
	                }
	                break;
	            case 0:
	                return;
	            default:
	                System.out.println("Invalid input.");
	        }
	    }

	 
	    public static void viewCart() {
	        while (true) {
	            System.out.println("\n*********************** CART *************************");
	            cart.printCart();

	            cartMenu();
	            int choice = getIntInput();

	            switch (choice) {
	                case 1:
	                    cart.filterMenu();
	                    break;
	                case 2:
	                    cart.sortMenu();
	                    break;
	                case 3:
	                    System.out.print("Enter title of media to remove: ");
	                    String title = scanner.nextLine();
	                    cart.removeMedia(title);
	                    break;
	                case 4:
	                    System.out.print("Enter title of media to play: ");
	                    String playTitle = scanner.nextLine();
	                    Media media = cart.searchByTitle(playTitle);
	                    if (media instanceof Playable) {
	                        ((Playable) media).play();
	                    } else {
	                        System.out.println("Cannot play this item.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Order created!");
	                    cart.emptyCart();
	                    return;
	                case 0:
	                    return;
	                default:
	                    System.out.println("Invalid input!");
	            }
	        }
	    }

	    public static void cartMenu() {
	        System.out.println("Options: ");
	        System.out.println("--------------------------------");
	        System.out.println("1. Filter medias in cart");
	        System.out.println("2. Sort medias in cart");
	        System.out.println("3. Remove media from cart");
	        System.out.println("4. Play a media");
	        System.out.println("5. Place order");
	        System.out.println("0. Back");
	        System.out.println("--------------------------------");
	        System.out.println("Please choose a number: 0-1-2-3-4-5");
	    }

	  
	    public static int getIntInput() {
	        while (true) {
	            try {
	                return Integer.parseInt(scanner.nextLine());
	            } catch (Exception e) {
	                System.out.print("Enter a valid number: ");
	            }
	        }
	    }
	}

}
