package math_bitwise;
import java.util.*;
public class num_apperaring_once_among_all_numbers_occuring_thrice {

	public static void main(String[] args) {
		int[] arr= {2,3,2,4,2,3,3};//4 is appearing once
		System.out.println(sol_1(arr));
		sol_2(arr);
		System.out.println(sol_3(arr));

	}
	static int sol_1(int[] arr) {
		//Using XOR+AND combination
		int once=0;
		int twos=0;
		for(int ele:arr) {
			once=(once^ele) & (~twos);
			twos=(twos^ele) & (~once);
		}
		return once;
	}
	
	static void sol_2(int[] arrA) {
		//counting set bit method
		
        int singleElement =0;
        for (int i = 0; i <32 ; i++) { //this is for calculating for every position in 32 bit integer
            int y = (1 << i);//for moving to left adjacent row
            int tempSum = 0;
            for (int j = 0; j <arrA.length ; j++) {
                if((arrA[j] & y)>=1) //if that particular bit is set for the ith position, add 1 to sum (w.r.t that bit)
                    tempSum = tempSum +1;
            }
            //if bits are not multiple of 3 then that bit belongs to the element appearing single time
            if((tempSum%3)==1) {
                singleElement = singleElement | y;
            }
        }
        System.out.println("Element appearing once is: " + singleElement);
		
		
	}
	
	static int sol_3(int[] arr) {
		//sorting method
		int n=arr.length;
		if(n<3) {
			return arr[0];
			
		}
		Arrays.sort(arr);
		if(arr[0]!= arr[1]) {
			return arr[0];
		}
		int i=1;
		while(i<n) {
			if(arr[i]!=arr[i-1]) {
				return arr[i-1];
			}
			i+=3;
		}
		return arr[n-1];
		
	}
	

}
