/*
* High Score
* https://programmingbydoing.com/a/high-score.html
* Write a dumb little program that asks the user for their name and a number. 
* Then store that name and that "high score" in a file. 
* The file should be called "score.txt"
*/

package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighScore {

	public static void main(String[] args) throws IOException 
	{
		
		System.out.println("You got a high score!");
		
		// Define the path that we want to write
				String filename = "/Users/quashellehampton/Documents/JavaFile/score.txt";
				
		//Enter data using BufferReader
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		// Reading data using readLine
		System.out.print("\nPlease enter your score: ");
		int score = Integer.parseInt(reader.readLine());
		System.out.print("Please enter your name: ");
		String name = reader.readLine();
		String data = name + " "+ score;
		
		// 2. Create the file in Java
				File file = new File(filename);
				
				try {
					// 3. Open the file
					FileWriter fw = new FileWriter(file);
					
					//4. Write to file
					fw.write(data);
					
					//5. Close resources
					fw.close();
				}
				catch(IOException e) {
					System.out.println("ERROR: Could not read file " + filename);
					e.printStackTrace();
				}

		// Printing message
		System.out.println("Data stored into score.txt.");	 
	}

}
