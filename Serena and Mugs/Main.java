/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>
using namespace std;
int main()
{
int n,c,i,sum=0;
std::cin>>n;
std::cin>>c;
int arr[n];
for(i=0;i<n;i++)
{
std::cin>>arr[i];
}
for(i=0;i<n;i++)
{
sum=sum+arr[i];
}
if(sum<=c)
{
std::cout<<"YES";
}
else
{
std::cout<<"NO";
}
}