import java.io.IOException;
import java.util.Scanner;
import java.io.*;

	public class Counter {
		public static void main(String[] args) throws IOException {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter the filename: ");
		    String fileName = scan.nextLine();
		    System.out.println("Please enter a word: ");
		    String wordName = scan.nextLine();

		    int count = 0;
		    try (LineNumberReader read = new LineNumberReader(new FileReader(fileName))) {
		        String line;
		        while ((line = read.readLine()) != null) {
		            for (String element : line.split(",")) {
		                if (element.equalsIgnoreCase(wordName)) {
		                    count++;
		                    //System.out.println("Word found at line " + r.getLineNumber());
		                }
		            }
		        }
		    }
		    scan.close();
		    System.out.println("The word " + wordName + " appears " + String.format("%,d", count) + " times.");
		}
		
}
