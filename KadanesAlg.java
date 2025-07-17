package Array;

public class KadanesAlg {
	public static void main(String[] args) {
		int[] arr= { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		int res=maximum_sub(arr);
		System.out.print(res);
	}
	public static int maximum_sub(int[] arr) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}return sum;
	}
}

