#include <iostream>

using namespace std; 

int main(){
	bool evenlyDivisible = false;
	int number = 2050;
	int counter = 0;
	while(!evenlyDivisible)
	{	counter = 0;

		for(int i = 1; i <= 20; i++)
		{
				if(number % i == 0)
				{
					counter++; 
				} 
				else
					break;

				
		}

		if(counter == 20)
				{
					evenlyDivisible = true; 
					cout<< number << endl ;
				}

		

		number++;
	}
	
	return 0;
}