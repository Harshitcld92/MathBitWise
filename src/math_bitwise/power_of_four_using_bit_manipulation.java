package math_bitwise;

public class power_of_four_using_bit_manipulation {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));

	}
	//There should be only one bit on OR 1 + 
	//position of the on bit should be even position
	//0 ->4^0
	//100 -> 4^1
	//10000 -> 4^2 only one bit is on and the position is also even
	
	static boolean isPowerOfFour(int num) {
		int count=0;
		for(int i=0;i<32;i++) {
			if(((num >>> i)&1)!=0) {// this condition tells that the bit is on or not
				count++;
				if(i%2==1) {//checking that is position of the on bit is even or not
					return false;
				}
			}
		}
		if(count == 1) return true;
		else return false;
	}

}
