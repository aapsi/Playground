#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
  cin>>a>>b>>c;
  cout<<"Enter first number :"<<" Enter second number :"<<" Menu";
  cout<<"\n"<<"1.Addition";
  cout<<"\n"<<"2.Subtraction";
  cout<<"\n"<<"3.Multiplication";
  cout<<"\n"<<"4.Division";
  cout<<"\n"<<"5.Remainder";
  switch(c)
  {
    case 1 : cout<<"\n"<<a+b;
    break;
    case 2 : cout<<"\n"<<a-b;
    break;
    case 3 : cout<<"\n"<<a*b;
    break;
    case 4 : cout<<"\n"<<a/b;
    break;
    case 5 : cout<<"\n"<<a%b;
    break;
    default : cout<<"\n"<<"Invalid operation";
  }}