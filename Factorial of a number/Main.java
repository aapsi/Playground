#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int num,i,fact = 1;
  cin>>num;
  for(i =num;i>=1;i-- )
  {
  	fact*=i;
  }
  cout<<fact;
}