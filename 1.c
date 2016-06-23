#include<stdio.h>

main()
{
int t,loop;
   scanf("%d",&t);
long int a[t][];
long int n[t],m[t],i,sum;
for(loop=0;loop<t;loop++)
{
   scanf("%ld",&n[loop]);
   scanf("%ld",&m[loop]);
   sum=n[loop];
  
  
  for(i=0;i<n[loop];i++)
  {
    scanf("%ld",&a[loop][i]);
  }
}

for(loop=0;loop<t;loop++)
{
 long int subarray,end1=1, end2=0,large=0,j,k;
 for(subarray=1;subarray<=n[loop];subarray++)
 {
  
  while(end2<=n[loop])
  {
   sum=0;
    for(j=end1;j<=subarray;j++)
    {
    sum=sum + a[loop][end1];
    }
    
    if(large<= (sum % m[loop]))
    large=sum % m[loop];
  end2++;
  }
 }
 
 printf("%ld \n",large);
}
}
