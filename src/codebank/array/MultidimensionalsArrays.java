//Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array.
// These are also known as Jagged Arrays.
// A multidimensional array is created by appending one set of square brackets ([]) per dimension.

package codebank.array;

public class MultidimensionalsArrays {

 //      int[][] intArray = new int[10][20]; //a 2D array or matrix
 //      int[][][] intArray = new int[10][20][10]; //a 3D array

        public static void main(String args[])
        {
            // declaring and initializing 2D array
            int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

            // printing 2D array
            for (int i=0; i< 3 ; i++)
            {
                for (int j=0; j < 3 ; j++)
                    System.out.print(arr[i][j] + " ");

                System.out.println();
            }
        }
    }
