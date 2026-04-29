public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int findValue(int num, int[] arr) {
		int result = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] ==num) {
				result = i;
				i = arr.length;
			}
		}
		return result;
	}

	public static int findThirdValue(String word, String[] arr) {
		int count = 0;
			for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				count++;
			}
			if (count == 3) {
				return i;
			}
		}
		return -1;
	}

	public static double[] append(double num, double[] arr) {
		double[] arr2 = new double[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = num;
		return arr2;
	}
	}

