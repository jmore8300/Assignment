/*4. Accept numoctor rows and numoer of columns from tet and duper below pattern.
Imput:
IRow = 3
icol - 4
*/

#include <stdio.h>


void Pattern(int iRow, int iCol) 
{
    
    for (int i = 1; i <= iRow; i++) {
        
        for (int j = 1; j <= iCol; j++) 
        {
           
            if (i % 2 != 0) 
            {
              
                printf("#\t");
            } else 
            {
              
                printf("*\t");
            }
        }
        
        printf("\n");
    }
}

int main() 
{
    int iValue1 = 0, iValue2 = 0;
    
   
    printf("Enter number of rows and columns: ");
    scanf("%d %d", &iValue1, &iValue2);
    
   
    printf("\n--- Pattern Output ---\n");
    Pattern(iValue1, iValue2);
    
    return 0;
}