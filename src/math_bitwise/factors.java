package math_bitwise;
import java.util.ArrayList;
public class factors {

	public static void main(String[] args) {
		factor(20);
		factor2(36);
		factor3(36);
	}
	//brute force approach O(N)
	static void factor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	//more optimized approach O(sqrt(N))
	static void factor2(int n) {
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
				}else {
					//we have two ans i and n/i
					System.out.print(i+" "+n/i+" ");
				}
				
			}
		}
	}
	
	//both time and space will be O(sqrt(N))
	
	static void factor3(int n) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println();
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
				}else {
					//we have two ans i and n/i
					System.out.print(i+" ");
					list.add(n/i);
				}
				
			}
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
