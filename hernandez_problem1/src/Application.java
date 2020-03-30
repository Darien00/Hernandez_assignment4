public class Application {

	public static void main(String[] args) {
		DuplicateRemover dupRMR = new DuplicateRemover();
		
		dupRMR.remove("problem1.txt");
		dupRMR.write("unique_words.txt");
	}

}
