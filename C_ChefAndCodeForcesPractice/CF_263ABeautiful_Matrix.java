class Solution 
{
    public boolean isMatch(String str, String PaTerN)
    {
        boolean[][] ddpp = new boolean[str.length() + 1][PaTerN.length() + 1];
        ddpp[str.length()][PaTerN.length()] = true;

        for (int i = str.length(); i >= 0; i--)
        {
            for (int j = PaTerN.length() - 1; j >= 0; j--)
            {
                boolean firstMatch1st = (i < str.length() &&
                                       (PaTerN.charAt(j) == str.charAt(i) ||
                                        PaTerN.charAt(j) == '.'));
                if (j + 1 < PaTerN.length() && PaTerN.charAt(j+1) == '*')
                {
                    ddpp[i][j] = ddpp[i][j+2] || firstMatch1st && ddpp[i+1][j];
                } 
                else 
                {
                    ddpp[i][j] = firstMatch1st && ddpp[i+1][j+1];
                }
            }
        }
        return ddpp[0][0];
    }
}




// import java.util.Scanner;

// public class CF_263ABeautiful_Matrix
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int i;
//         int j;
//         int fil = 5;
//         int col = 5; 
//         int fila = 0;
//         int columna=0;
//         int[][] arr = new int[fil][col]; 
// /*
// 0 0 0 0 0
// 0 0 0 0 1
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// */
//         for (i = 0; i < fil; i++) 
//         {
//             for (j = 0; j < col; j++) 
//             {
//                 arr[i][j] = sc.nextInt();
//                 if (arr[i][j] == 1) 
//                 {
//                     fila = i;
//                     columna = j;
//                 }
//             }   
//         }
//         int vertical = Math.abs(fila - 2);
//         /*
// 0 0 0 0 0
// 0 0 0 0 1
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
//          */
//         int horizontal = Math.abs(columna - 2);

//         int res = vertical + horizontal;
//         System.out.println(res);
//     }
// } 
		 							 	   		  			 			 		





/*
 * 
 * class Solution 
{
    public boolean isMatch(String str, String PaTerN)
    {
        boolean[][] ddpp = new boolean[str.length() + 1][PaTerN.length() + 1];
        ddpp[str.length()][PaTerN.length()] = true;

        for (int i = str.length(); i >= 0; i--)
        {
            for (int j = PaTerN.length() - 1; j >= 0; j--)
            {
                boolean firstMatch1st = (i < str.length() &&
                                       (PaTerN.charAt(j) == str.charAt(i) ||
                                        PaTerN.charAt(j) == '.'));
                if (j + 1 < PaTerN.length() && PaTerN.charAt(j+1) == '*')
                {
                    ddpp[i][j] = ddpp[i][j+2] || firstMatch1st && ddpp[i+1][j];
                } 
                else 
                {
                    ddpp[i][j] = firstMatch1st && ddpp[i+1][j+1];
                }
            }
        }
        return ddpp[0][0];
    }
}




// import java.util.Scanner;

// public class CF_263ABeautiful_Matrix
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int i;
//         int j;
//         int fil = 5;
//         int col = 5; 
//         int fila = 0;
//         int columna=0;
//         int[][] arr = new int[fil][col]; 
// /*
// 0 0 0 0 0
// 0 0 0 0 1
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// */
//         for (i = 0; i < fil; i++) 
//         {
//             for (j = 0; j < col; j++) 
//             {
//                 arr[i][j] = sc.nextInt();
//                 if (arr[i][j] == 1) 
//                 {
//                     fila = i;
//                     columna = j;
//                 }
//             }   
//         }
//         int vertical = Math.abs(fila - 2);
//         /*
// 0 0 0 0 0
// 0 0 0 0 1
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
//          */
//         int horizontal = Math.abs(columna - 2);

//         int res = vertical + horizontal;
//         System.out.println(res);
//     }
// } 
		 							 	   		  			 			 		
 */