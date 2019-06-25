package jersey.tutorial;

public class AlgorithmBinaryLength {

	public static void main(String[] args) {
		
		System.out.println("a = "+longestBinary(new int[]{1, 1, 1, 1, 1, 1}));
		System.out.println("b = "+longestBinary(new int[]{0, 1, 0, 1, 0, 1, 0, 1}));
		System.out.println("c = "+longestBinary(new int[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1}));
	}
	
	private static int longestBinary(int[] binaryArray) {
		int longest = 0;
		int current = 0;
		for (int i = 0; i <binaryArray.length; i++) {
			if (binaryArray[i] > 0) {
				current++;
				longest = Math.max(longest, current);
			} else {
				current = 0;
			}
		}
		return longest;
	}
}
