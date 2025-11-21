//Problem 4: Alternating Stars and Numbers (Again)

#include <stdio.h>


void Pattern(int iValue) {
    for (int i = 1; i <= iValue; i++) {
        printf("%d\t*\t", i); 
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