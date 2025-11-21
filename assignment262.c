//Problem 2: Mixed Sequence (Stars and Numbers)

#include <stdio.h>


void Pattern(int iValue) {
    for (int i = iValue; i >= 1; i--) {
        printf("%d\t*\t", i); 
    }
    printf("\n");
}

int main() {
    int iValue = 0;
    
    printf("Enter number of elements:\n");
    scanf("%d", &iValue);
    
   
    Pattern(iValue);
    
    return 0;
}