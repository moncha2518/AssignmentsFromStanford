import acm.program.ConsoleProgram;
import java.util.ArrayList;

public class UniqueName extends ConsoleProgram {
	private ArrayList<String> nameList = new ArrayList<String>();

	public void run() {

		initializeNameList();
		storeName();
		printName();

	}

	private void storeName() {
		while (true) {
			String name = readLine("Enter name : ");
			if (name.equals(" ")) {
				break;
			} else if (!nameList.contains(name)) {
				nameList.add(name);
			}

		}

	}

	private void printName() {
		for (int i = 0; i < nameList.size(); i++) {
			println(nameList.get(i));
		}

	}

	private void initializeNameList() {
		nameList.clear();

	}

}
