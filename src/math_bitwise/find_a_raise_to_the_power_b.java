package math_bitwise;

public class find_a_raise_to_the_power_b {

	public static void main(String[] args) {
		int base=3;
		int power=6;//3^6
		int ans=1;
		
		while(power>0) {
			if((power&1)==1) {//power&1 means that last bit of 110
				ans*=base;//ans=1*3...3*9...27*27
			}
			base*=base;//3..9..27
			power=power>>1;//moving to next bit of power
		}
		System.out.println(ans);

	}

}
