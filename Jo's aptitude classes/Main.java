#include<iostream>
using namespace std;
int gcd(int,int,int);
int main()
{
	int a,b,c,d;
  cin>>a>>b>>c>>d;
  if( gcd(a,b,c) ==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
}
int gcd(int x, int y, int z)
{int small;
	if(x<y && x<z)
      small = x;
 else if(y<x &&y<z)
   small = y;
 else
   small = z;
 while(small>=1)
 {
 	if(x%small == 0 && y%small == 0 && z%small == 0)
      return small;
      break; 
 }
 small--;     
}