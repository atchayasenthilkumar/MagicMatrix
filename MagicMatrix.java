public class MagicSquare
{
    
public static void generateMagicSquare(int n) 
{
        
int[][] matrix = new int[n][n];
        
int num = 1;
       
int row = 0, col = n / 2;

        
while (num <= n * n) 
{
            
matrix[row][col] = num++;
            
int nextRow = (row - 1 + n) % n;
            
int nextCol = (col + 1) % n;
            
if (matrix[nextRow][nextCol] != 0) 
{
                
row++;
            
} 
else 
{
                
row = nextRow;
               
col = nextCol;
            
}
        
}

               
 for (int i = 0; i < n; i++) 
{
            
for (int j = 0; j < n; j++) 
{
                
System.out.print(matrix[i][j] + " ");
            
}
            
System.out.println();
        
}
    
}

    
public static void main(String[] args) 
{
       
generateMagicSquare(3);
    
}

}


