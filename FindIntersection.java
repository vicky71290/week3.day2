package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {

		int[] Arry1 = {3,2,11,4,6,7};
		int[] Arry2 = {1,2,8,4,9,7};

		int Arry1Size = Arry1.length;
		int Arry2Size = Arry2.length;

		for (int i =0; i<Arry1Size;i++) {

			for(int e = 0;e<Arry2Size;e++) {

				if (Arry1[i] == Arry2[e]) {

					System.out.println( Arry1[i]);
					
				}

			}

		}

	}

}
