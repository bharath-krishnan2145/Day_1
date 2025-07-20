package Array;
import java.util.*;
public class StockBuyandSell {
	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,4};
		int res=stock(arr);
		System.out.print(res);
	}
	public static int stock(int[] arr) {
		int max=0;
		int minprice=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			minprice=Math.min(minprice, arr[i]);
			max=Math.max(max, arr[i]-minprice);
		}
		return max;
	}
}
