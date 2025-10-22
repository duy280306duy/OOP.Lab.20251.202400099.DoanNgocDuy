package src;

public class NoGarbage {	
	    public static void main(String[] args) {
	        String filename = "test.exe"; 
	        byte[] inputBytes;
	        long startTime, endTime;
	        try {
	            inputBytes = Files.readAllBytes(Paths.get(filename));

	            startTime = System.currentTimeMillis();
	            StringBuilder outputStringBuilder = new StringBuilder();

	            for (byte b : inputBytes) {
	                outputStringBuilder.append((char) b);
	            }
	            String outputString = outputStringBuilder.toString();
	            endTime = System.currentTimeMillis();
	            System.out.println("NoGarbage Time (with StringBuilder): " + (endTime - startTime) + "ms");
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }
	}


