import java.io.*;
import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	// private int numOfHits;

	String checkYourself(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		int index = this.locationCells.indexOf(userGuess);

		// for (int cell : this.locationCells) {
		//	if (guess == cell) {
		//		result = "hit";
		//		this.numOfHits++;
		//		break;
		//	}
		// }

		if (index >= 0) {
			this.locationCells.remove(index);

			if (this.locationCells.isEmpty()) {
				result = "Kill";
			} else {
				result = "hit";
			}
		}

		//if (this.numOfHits == this.locationCells.length) {
		//	result = "kill";
		//}

		System.out.println(result);

		return result;
	}

	void setLocationCells(ArrayList<String> locs) {
		this.locationCells = locs;
	}
}

class GameHelper {
	String getUserInput(String prompt) {
		String inputLine = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}

		return inputLine;
	}
}

class DotComTest {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		DotCom theDotCom = new DotCom();

		int randomNum = (int) (Math.random() * 5);

		//ArrayList<String> locations = new ArrayList<String>(randomNum, randomNum + 1, randomNum + 2);
		ArrayList<String> locations = new ArrayList<>();
		locations.add(String.valueOf(randomNum));
		locations.add(String.valueOf(randomNum + 1));
		locations.add(String.valueOf(randomNum + 2));

		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");

			String result = theDotCom.checkYourself(guess);

			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;

				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
