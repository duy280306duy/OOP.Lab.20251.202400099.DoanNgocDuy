package src;

public class GarbageCreator {	
	    public static void main(String[] args) {
	        String filename = "test.exe"; 
	        byte[] inputBytes;
	        long startTime, endTime;
	        try {
	            inputBytes = Files.readAllBytes(Paths.get(filename));

	            startTime = System.currentTimeMillis();
	            String outputString = "";

	            for (byte b : inputBytes) {
	                outputString += (char) b;
	            }

	            endTime = System.currentTimeMillis();
	            System.out.println("GarbageCreator Time (with +): " + (endTime - startTime) + "ms");

	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }
	}


}
