package math_bitwise;

public class power_of_two {

	public static void main(String[] args) {
		//if there is only a single bit is 1 then the number is power of 2
		int n=128;
		//Note: for n=0 its an exception case
		if(n==0) {
			System.out.println("Enter a valid input");
			return;
		}
		findPowerOfTwo(n);
		//10000000=1111111+1
		//if number&number-1==0, then it is a power of 2
		//   10000000
		// & 01111111
		//____________
		//   00000000
				
	}
	static void findPowerOfTwo(int n) {
		boolean ans=(n&(n-1))==0;
		System.out.println(ans);
	}

}
