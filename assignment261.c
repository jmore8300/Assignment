//1. Accept number from user and display below pattern.


#include <stdio.h>


void Pattern(int iValue) 
{
    char ch = 'A';
    for (int i = 0; i < iValue; i++) {
        printf("%c\t", ch + i); 
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