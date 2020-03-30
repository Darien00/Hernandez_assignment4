public class Application {

	public static void main(String[] args) {
		String dataFile = "problem2.txt";
		String outputFile ="uniqe_word_Counts.txt";
		
		  DuplicateCounter dupCtr = new DuplicateCounter();

	      
	           dupCtr.count(dataFile);
	      
	           dupCtr.write(outputFile);
	}
	       


}