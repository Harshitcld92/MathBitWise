package math_bitwise;

public class sum_of_nth_row_in_pascals_triangle {

	public static void main(String[] args) {
//		1
//		1 1
//		1 2 1
//		1 3 3 1
//		1 4 6 4 1
//		1 5 10 10 5 1
        
		//sum of each row = nC0+nC1+nC2+nC3+nC4+nC5.....+nCn = 2^n
        // as we are starting from 0th row (n=0) therefore sum of nth row =2^n-1
		
		int n=6;
		find_sum(n);
	}
	static void find_sum(int n) {
		int sum=1<<(n-1);//1*2^n-1
		System.out.println(sum);
	}

}
