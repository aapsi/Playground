#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int count = 0,temp,tot=0,copy,copy1;
  copy = n;
  copy1 = n;
  while(copy1>0)
  {
  	copy1 = copy1/10;
    count+=1;
  }
  while(n>0)
  { temp = n%10;
   tot+=power(temp,count);
    n = n/10;
}
  if(tot == copy)
    return 1;
    
  }
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}