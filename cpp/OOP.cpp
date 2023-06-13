#include<iostream>

using namespace std;

class what{
	public:
	int data = 7;
	const char* name {};

};

int main(){
	what w;
	cout << w.data;
}
