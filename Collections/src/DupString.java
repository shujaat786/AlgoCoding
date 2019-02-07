import java.util.HashMap;
import java.util.Map;

public class DupString {

	static void dupString(String str) {

		Map<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");

		for (String key : s) {

			if (hm.get(key) != null) {

				hm.put(key, hm.get(key) + 1);
			}

			else
				hm.put(key, 1);

		}
		System.out.println(hm);

	}

	public static void solve(String str) {
		int currLevel = 0;
		int valley = 0;
		boolean isFound = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'U') {
				currLevel++;
			} else {
				currLevel--;
			}

			if (currLevel < 0) {
				isFound = true;
			}

			if (currLevel > 0 && isFound) {

				isFound = false;
				valley++;

			}

		}
		System.out.println(valley);

	}

	public static void main(String[] args) {

		String text = "I am learning java programming java loving";
		dupString(text);

	}

}
