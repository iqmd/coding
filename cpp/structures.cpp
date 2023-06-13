#include<iostream>

using namespace std;

struct LibraryCard{
	int isbn {};
	const char* book {};

};
int main(){
	LibraryCard b;
	b.isbn = 11223344 ;
	b.book = "Laws of Power";

	LibraryCard *p;
	 p = &b;

	cout << p->isbn;
	cout << endl;
	cout << *p.book;
}

