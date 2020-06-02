#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age,year;
  cin>>age>>year;
  if (age>year)
  {
    age = 1900+age;
    year = 2000+year;
    cout<<(year-age);
  }
  else
  {
  	age = 2000+age;
    year = 2000+year;
    cout<<year-age;
  }
}