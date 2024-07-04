package math_bitwise;

public class sqrt_using_Newton_Raphson {

	public static void main(String[] args) {
		System.out.println(sqrt(40));

	}
	static double sqrt(int n) {
		double x=n;//you have assumed x as an square root which is equal to n
		double root;//original square root
		while(true) {
		    root=0.5*(x+(n/x));//newton raphson condition
		    if(Math.abs(root-x)<1) {//error should be less than 1
		    	break;
		    }
		    else {
		    	x=root;
		    }
		}
		return root;
	}

}
