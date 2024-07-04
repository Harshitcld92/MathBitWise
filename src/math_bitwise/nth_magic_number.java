package math_bitwise;

public class nth_magic_number {

	public static void main(String[] args) {
		int n=6;//110 in binary
		nthMagicNumber(n);

	}
	static void nthMagicNumber(int n) {
		int ans=0;
		int base=5;
		while(n>0) {
			int last=n&1;//gives last bit of the number
			n=n>>1;//moving to the next bit of the number
			ans=ans+base*last;//ans=0+5*0...ans= 0+25*1....ans=25+125*1
			base=base*5;//Incrementing the base power
		}
		System.out.println(ans);
	}

}
