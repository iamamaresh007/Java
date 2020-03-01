package FromFirst.Array;

public class ArrayUsingForEach {
	public static void main(String[] args) {
		int[] array= {1,2,4,5,6,15,7};
		for(int i:array) {
			System.out.println(i);
		}
		int[][] arr=new int[][] {{1,2,3,4},{5,6,7,8,},{9,10,11,12}};
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
	}

}
