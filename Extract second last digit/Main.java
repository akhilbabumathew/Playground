#include<stdio.h>
int main()
{
  int n1,n2;
  scanf("%d",&n1);
  n2=n1/10;
  n1=n2%10;
  printf("%d",n1);
  return 0;
}