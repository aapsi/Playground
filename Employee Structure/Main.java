#include<iostream>
using namespace std;
struct employee {
   char name[50];
   int id;
   int age;
   char designation[50];
   int salary;
};
int main() 
{
  employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.designation;
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<  e.id<<endl;
  cout<<"Age of the Employee : "<< e.age<<endl;
  cout<<"Designation of the Employee : " << e.designation<<endl;
  cout<<"Salary of the Employee : "<< e.salary<<endl;

}