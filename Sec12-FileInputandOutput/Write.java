/*
* Letter Revisited
* https://programmingbydoing.com/a/letter-revisited.html
* Rewrite A Letter to Yourself, but modify it so that instead of displaying the letter on the screen, it puts it in a file.
* When you run your program, it will appear to do nothing. 
* But if you wrote it correctly, it should have created a file in your home directory called "letter.txt"  which you can then view using a text editor.
*/

package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write
		String filename = "/Users/quashellehampton/Documents/JavaFile/letter.txt";
		String message = "+---------------------------------------------------------+ \n" 
				+"|                                                    #### | \n"
				+"|                                                    #### | \n"
				+"|                                                    #### | \n"
				+"|                                                         | \n"
				+"|                                                         | \n"
				+"|                              Quanny Hampton             | \n"
				+"|                              1738 My Way                | \n"
				+"|                              Bronx, NY 10037            | \n"
				+"|                                                         | \n"
				+"+---------------------------------------------------------+";
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file
			FileWriter fw = new FileWriter(file);
			
			//4. Write to file
			fw.write(message);
			
			//5. Close resources
			fw.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: Could not read file " + filename);
			e.printStackTrace();
		}
		
	}

}
