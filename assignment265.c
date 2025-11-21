//Problem 5: Even Number Sequence

#include <stdio.h>


void Pattern(int iValue) {
    
    for (int i = 1; i <= iValue; i++) 
    {
        
        printf("%d\t", 2 * i); 
    }
    printf("\n");
}

int main() 
{
    int iValue = 0;
    
    printf("Enter number of elements:\n");
    scanf("%d", &iValue);
    
   
    Pattern(iValue);
    
    return 0;
}