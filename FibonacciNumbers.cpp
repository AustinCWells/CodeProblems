#include <cstdlib>
#include <iostream> 

using namespace std;  

int main(){
	int total = 0; 
	int temp = 1;
	for(int i = 2; i <= 4000000;){
		if(i % 2 == 0)
			total += i;
		int nextValue = i; 
		i = i + temp;
		temp = nextValue;
	}
	cout << total << endl; 
	return 0; 
}