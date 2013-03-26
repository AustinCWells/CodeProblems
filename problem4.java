
public class problem4{
public static void main(String[] args){
	int largestPalindrome = 0;
	for(int i=100; i < 1000; i++){
		for(int b = 100; b < 1000; b++){
			if(palindrome(i*b)){
				System.out.println(i*b);
				if(i*b > largestPalindrome){
					largestPalindrome = i*b;
				}
			}
		}
	}
	System.out.println(largestPalindrome); 

}
static boolean palindrome(int number){
	int length = String.valueOf(number).length();
	int[] individualNumbers = new int[length];
	//System.out.println(number);
	boolean isPalindrome = true;

	for(int i = 0; i < length; i++){
		int digit = number % 10;
		individualNumbers[i] = digit; 
		number = number / 10;
	}

	for(int i = 0; i < length/2 ; i++){
			if(individualNumbers[i] != individualNumbers[length - i - 1]){
				isPalindrome = false;
			}
		}

	return isPalindrome; 

}
}