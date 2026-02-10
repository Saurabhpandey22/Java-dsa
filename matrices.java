// public class matrices{
//     public static void main(String args[]){
//         int matrix[][]= {{2,3,7},{5,6,7}};
//         int rows=matrix.length;
//         int cols=matrix[0].length;
//         int transpose[][]= new int[cols][rows];
//         for (int i = 0; i<rows; i++) {
//             for(int j =0; j<cols; j++){
//                 transpose[j][i]=matrix[i][j];
//             }
//         }
//         for (int i = 0; i < cols; i++) {
//         for (int j = 0; j < rows; j++) {
//          System.out.print( transpose[i][j] +" ");   
//         }   
//         System.out.println();
//         }
//     }
// }

// A PROGRAM TO PRINT A MATRIX IN THE FORM OF SPIRAL MATRIX
public class matrices{
    public static void printspiral(int matrix[][]){
        int startrow=0, startcol=0, endrow=matrix.length-1, endcol=matrix[0].length-1;
        while (startrow<=endrow && startcol<=endcol) { 
            // for top boundry
            for (int j = startcol; j < endcol; j++) {//row fix hai esliye sirf yahi loop chalega
            System.out.print( matrix[startrow][j]+"");
            }
            //right boundry ke liye
            for (int i = startrow+1; i <=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom boundry ke liye
            for (int j = endcol-1; j>=startcol; j++) {
                if (startrow==endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j]+"");
            }
            //left boundry ke liye
            for (int i = endrow-1; i >=startrow; i++) {
                System.out.println("");
                
            }
        }
    }
}