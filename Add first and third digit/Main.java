#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  c=a%10;
  a=a/100;
  b=c+a;
  printf("%d",b);
  return 0;
}