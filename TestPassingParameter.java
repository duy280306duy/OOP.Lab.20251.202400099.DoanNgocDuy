package src;

public class TestPassingParameter {	

	    public static void main(String[] args) {
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
	        
	        swap(jungleDVD, cinderellaDVD);

	        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	       
	        changeTitle(jungleDVD, cinderellaDVD.getTitle());

	        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	    }

	    
	    public static void swap(Object o1, Object o2) {
	        Object tmp = o1;
	        o1 = o2;
	        o2 = tmp;
	    }

	    
	    public static void changeTitle(DigitalVideoDisc dvd, String title) {
	        String oldTitle = dvd.getTitle();
	        dvd.setTitle(title);
	        dvd = new DigitalVideoDisc(oldTitle); 
	    }
	    public static void mai(String[] args) {
	        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

	        // Bọc hai DVD vào một mảng
	        DigitalVideoDisc[] dvdList = { jungleDVD, cinderellaDVD };

	        System.out.println("Before swap:");
	        System.out.println("dvdList[0]: " + dvdList[0].getTitle());
	        System.out.println("dvdList[1]: " + dvdList[1].getTitle());

	        
	        swapCorrect(dvdList);

	        System.out.println("After swap:");
	        System.out.println("dvdList[0]: " + dvdList[0].getTitle());
	        System.out.println("dvdList[1]: " + dvdList[1].getTitle());
	    }

	    
	    public static void swapCorrect(DigitalVideoDisc[] dvdList) {
	        if (dvdList == null || dvdList.length < 2) return;
	        DigitalVideoDisc temp = dvdList[0];
	        dvdList[0] = dvdList[1];
	        dvdList[1] = temp;
	    }
	}



