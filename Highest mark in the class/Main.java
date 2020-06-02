#include<iostream>
using namespace std;
int main()
{
  int n,i,max;
  cin>>n;
  int arr[n];
  for(i = 0; i<n ; i++ )
  {
  	cin>>arr[i];
  }
  max = arr[0];
  for(int j = 1;j<n;j++)
  {
  	if (arr[j] > max)
      max = arr[j];
  }
  cout<<max;
  return 0;
}