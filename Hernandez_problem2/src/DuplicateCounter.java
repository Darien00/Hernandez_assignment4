import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class DuplicateCounter {
	//declare instance variables
	HashMap<String, Integer>wordCounter= new HashMap<>();
	
	public void count(String dataFile){
		//declare a new file 
		//create a scanner for file reading
		//instantiate through the file 
		try {
			File file = new File(dataFile);
			Scanner readFile = new Scanner(file);//reading data from the file
			while(readFile.hasNext()) {
				String fileWord = readFile.next();
				if(fileWord != null) {
					fileWord = fileWord.toLowerCase();//turn all the loop words into lower case so theyre all the same
					//if created hash map contains the word
					if(wordCounter.containsKey(fileWord)) {
						wordCounter.put(fileWord, wordCounter.get(fileWord)+1); //increment the count 
					}
					else {
						wordCounter.put(fileWord, 1);//add new word with the count of one to map
					}
				}
			}
		readFile.close();
		}
		catch(FileNotFoundException fnfe) {
			System.out.println(dataFile+"cannot be found");
		}
	
		
	}
	public void write(String outputFile) {
		
		try {
			FileWriter fWriter = new FileWriter(outputFile);
			for(Map.Entry<String, Integer>entry : wordCounter.entrySet()) {//using one of the public static method headers
				fWriter.write(entry.getKey()+ "\t" + entry.getValue());
				fWriter.write("\n");
			}
			fWriter.close();
		
		}
		catch(IOException ex) {
			System.out.println("Error doc writing");
			System.exit(1);
			
		}
	}
}
