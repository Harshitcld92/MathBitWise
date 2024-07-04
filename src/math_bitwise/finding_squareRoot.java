package math_bitwise;

public class finding_squareRoot {

	public static void main(String[] args) {
		//finding square root using binary search
		int n=40;
		int point=3;//till how many decimals you want to get the square root
		System.out.printf("%.3f",sqrt(n,point));

	}
	static double sqrt(int n,int point) {
		int s=0;
		int e=n;
		double root=0.0;
		while(s<=e) {
			int m=s+(e-s)/2;
			if(m*m==n) {
				 return m;                        
			}
			if(m*m>n) {
				e=m-1;
			}else {
				s=m+1;
			}
		}
		
		double incr=0.1;
		for(int i=0;i<point;i++) {
			while(root*root<=n) {
				root+=incr;
			}
			root-=incr;
			incr=incr/10;
		}
		
		return root;
	}

}
