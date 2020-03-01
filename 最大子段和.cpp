#include<iostream>
using namespace std;
int main()
{
   int a[1000]={0};
   int b=0;
   int maxsum=0;
   int thissum; 
   while(cin.peek()!='\n')
   { 	
   	scanf("%d",&a[b]);
   	b++;
   }
   for(int i=0;i<b;i++){
   	    thissum=0;
   	for(int j=i;j<b;j++){
   			thissum+=a[j];
		   }
	if (thissum>maxsum) 
      {
   		maxsum=thissum;
	   }
	   }
   	
   if(maxsum>=0)
   {
   	printf("\n最大字段和为%d",maxsum);
    return 0;
   }
   else printf("最大字段和为0");
   
}

