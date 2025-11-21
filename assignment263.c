//Problem 3: Decreasing and Increasing Sequence

#include <stdio.h>


void Pattern(int iValue) 
{
    for (int i = iValue; i >= 1; i--) 
    {
        printf("%d\t%d\t", i, i); 
    }
    printf("\n");
}

int main() {
    int iValue = 0;
    
    printf("Enter number of elements:\n");
    scanf("%d", &iValue);
    
    // Call the function
    Pattern(iValue);
    
    return 0;
}