/*
* Implementation for project Euler Problem3
* Find the largest prime factor of a composite number
* 
*/
public class problem3{
	public static void main(String[] args){
		long number = 600851475143L;
		boolean divisible = true; 
		
/*
* Start with the number n and find a number that divides n.
* if the number divides n divide out the number and run n
* through the loop again. Once no number can be found that 
* divides n, set the loop control variable to false and print out the 
* highest prime factor. 
*/
		while(divisible){
			divisible = false;
			
			for(long test = 2L; test < (number/2); test++){
				
				if(number % test == 0){
					System.out.println("Prime Factor:" + test);
					number = number / test; 
					divisible = true;
				}
				
			}

		}

		System.out.println("Largest Prime Factor: " + number ); 
	}
	
}