import acm.program.ConsoleProgram;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class Histogram extends ConsoleProgram {
	private int[] scoreList = new int[11];

	public void run() {
		try {
			initializeScoreList();
			File myObject = new File("/Users/user/Desktop/MeritJavaClass/Assignment/Assignment5/MidtermScores.txt");
			Scanner myReader = new Scanner(myObject);
			if (myObject.exists()) {
				while (myReader.hasNext()) {
					String data = myReader.nextLine();

					int score = Integer.parseInt(data);
					int range = score / 10;

					scoreList[range] = scoreList[range] + 1;
				}
				printHistogram();
				myReader.close();
			}
		} catch (FileNotFoundException fl) {
			println("FileNotFoundException is handled");

		} catch (IOException io) {
			println("IOException is handled");
		}
	}

	public void initializeScoreList() {
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i] = 0;
		}
	}

	public void printHistogram() {
		for (int range = 0; range <= 11; range++) {
			String star = createStars(scoreList[range]);
			if (range == 0) {
				println("00-09: " + star);
			} else if (range == 1) {
				println("10-19: " + star);
			} else if (range == 2) {
				println("20-29: " + star);
			} else if (range == 3) {
				println("30-39: " + star);
			} else if (range == 4) {
				println("40-49: " + star);
			} else if (range == 5) {
				println("50-59: " + star);
			} else if (range == 6) {
				println("60-69: " + star);
			} else if (range == 7) {
				println("70-79: " + star);
			} else if (range == 8) {
				println("80-89: " + star);
			} else if (range == 9) {
				println("90-99: " + star);
			} else if (range == 10) {
				println("  100: " + star);
			}

		}
	}

	private String createStars(int n) {
		String star = " ";
		for (int i = 0; i < n; i++) {
			star += "*";
		}
		return star;
	}

}