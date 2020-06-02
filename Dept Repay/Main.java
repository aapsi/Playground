#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,y;
  float i,a,d,f;
  cin>>p;
  cin>>r;
  cin>>y;
  i =(p*r*y)/100;
  a = i+p;
  d = (i*2)/100;
  f = a-d;
  cout<<i;
  cout<<"\n";
  cout<<a;
  cout<<"\n";
  cout<<d;
  cout<<"\n";
  cout<<f;
  cout<<"\n";
}