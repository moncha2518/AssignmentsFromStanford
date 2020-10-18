
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.Character;
import java.util.Scanner;
import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

import java.io.FileReader;

public class WordCount extends ConsoleProgram {

	public void run() {
		int countLine = 0;
		int countWord = 0;
		int countChar = 0;

		try {
			File fl = new File("/Users/user/Desktop/MeritJavaClass/Assignment/Assignment5/lear.txt");
			FileReader fr = new FileReader(fl);
			BufferedReader readFile = new BufferedReader(fr);
			String readLines = null;

			while (readFile.ready()) {
				readLines = readFile.readLine();

				if (readLines != null) {
					countLine++;
					countChar += countChar(readLines);
					countWord += countWord(readLines);
				}
			}

			println("File: " + fl.getName());
			readFile.close();
		}

		catch (IOException io) {
			io.printStackTrace();
		}
		println("Lines = " + countLine);
		println("Words = " + countWord);
		println("Chars = " + countChar);
	}

	public int countChar(String lineString) {
		int countChar = 0;
		for (int i = 0; i < lineString.length(); i++) {
			char ch = lineString.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				countChar++;
			}
		}

		return countChar;
	}

	public int countWord(String LineString) {
		int countWord = 0;
		StringTokenizer st1 = new StringTokenizer(LineString, " ");

		while (st1.hasMoreTokens()) {
			st1.nextToken();
			countWord++;
		}
		return countWord;

	}

}
