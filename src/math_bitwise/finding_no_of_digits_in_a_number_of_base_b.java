package math_bitwise;

public class finding_no_of_digits_in_a_number_of_base_b {

	public static void main(String[] args) {
		int n=10;//1010 in binary
		int base=2;//for binary number base=2
		//no.of digits=(int)(log n base b)+1
		int ans=(int)(Math.log(n)/Math.log(base))+1;
		System.out.println(ans);

	}

}
