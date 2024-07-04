package math_bitwise;

public class roman_to_integerConversion {
	//function to store all distinct values
	static int getVal(char ch) {
		switch(ch) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		default: return 0;
		}
	}

	public static void main(String[] args) {
		String romanNo="CCXLVII";
		int ans=romanToInt(romanNo);
		System.out.println(ans);
	}
	//function to convert roman to Integer
	public static int romanToInt(String romanNo) {
        int n=romanNo.length();
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			char ch=romanNo.charAt(i);
			
			if((i+1)<n && getVal(ch)<getVal(romanNo.charAt(i+1))) {//(i+1)<n is for not exceeding the string
				sum=sum-getVal(ch);//if current character value is < next character value than we have to take it as a negative number
			}else {
				sum=sum+getVal(ch);//and if current character value is > than next character value than we take it as a positive number
			}
			
		}
		return sum;

	}

}
