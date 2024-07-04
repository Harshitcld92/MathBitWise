package math_bitwise;
import java.util.*;
public class happy_number {

	public static void main(String[] args) {
		int n=61;
		System.out.println(isHappy(n));

	}
	static boolean isHappy(int n) {
		Set<Integer> usedInteger=new HashSet<>();
		//Finding the sum of squares 
		while(true) {
		int sum=0;
		while(n!=0) {
			sum+=Math.pow(n%10, 2.0);
			n=n/10;
		}
		
		//if sum is 1, return true
		if(sum==1) return true;
		//Else the new number will be the current sum
		n=sum;
		
		//Check if we have already encountered that number
		if(usedInteger.contains(n)) 
			return false;
		
		usedInteger.add(n);
		}
	}

}
