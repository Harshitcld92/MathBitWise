package math_bitwise;

public class armStrong_number {

	public static void main(String[] args) {
		isArmStrong(370);

	}
	static void isArmStrong(int n) {
		int sum=0;
		int Original=n;
		while(n>0) {
			sum+=Math.pow(n%10, 3.0);
			n=n/10;
		}
		System.out.println(sum);
		if(sum==Original) {
			System.out.println("Number is ArmStrong");
		}else {
			System.out.println("Number is Not ArmStrong");
		}
		
	}

}
