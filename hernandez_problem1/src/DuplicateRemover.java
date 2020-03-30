import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import java.util.LinkedHashSet;

public class DuplicateRemover {
	
	Set<String> uniqueWords = new LinkedHashSet<>();
	
	
	
	public void remove(String dataFile) {
		
		try {
			
			Scanner input = new Scanner(new File(dataFile));//take input from a  new file reminder(not from keyboard) this will read the file
			while(input.hasNextLine()) {//loop till file is read
				
				String fileLine = input.nextLine();
				
				//when reading the line and faced with a white space means split the word
				String[] words=fileLine.split(" ");
				for(int index=0; index < words.length ; index++) {
					//to make all words the same no matter whether its upper case or lower case convert them to all to lower to make 
					//words are the same
					String str = words[index].toLowerCase();
					uniqueWords.add(str);//adding the words to the set
				}//end for
			}//end while
			
		}
		catch(Exception e) {
			System.out.print("Error opening data file: ");
		}
		
	}
	
	public void write(String outputFile) {
		
		FileWriter output = null;
		try {
			 output = new FileWriter(outputFile);//opening file
			 for(String str: uniqueWords)
				 output.write(str+"\n");
				 
				 output.close();
			 
		}
		catch(Exception e) {
			System.out.print("Error writing out the file");
		}
		
	}
}
