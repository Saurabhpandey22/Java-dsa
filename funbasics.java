
import java.util.Scanner;
public class funbasics{
    public static void bintodec(int binnum){
int mynumber=binnum;
  int pow = 0;
  int decnumber = 0;
  while (binnum>0) { 
      int lastdigit= binnum%10;
decnumber = decnumber+(lastdigit * (int)Math.pow(2,pow));
pow++;
binnum=binnum/10;

 }
 // System.out.println("decimal of"+ mynumber + "="+ decnumber);
 System.out.println(decnumber);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int number=sc.nextInt();
        //System.out.print("enter a number");
        bintodec(number);
    }
} 
// public class funbasics{
//     public static void dectobin(int decnum){
// int mynumber=decnum;
//   int pow = 0;
//   int binnumber = 0;
//   while (decnum>0) { 
//       int remender= decnum%2;
// binnumber = binnumber+(remender * (int)Math.pow(10,pow));
// pow++;
// decnum=decnum/2;

//   }
//  // System.out.println("decimal of"+ mynumber + "="+ decnumber);
//  System.out.println(binnumber);
//     }
//     public static void main(String[] args) {
//         dectobin(7);
//     }
// } 
// public class funbasics{
//     public static void hellowretanle(int totrow, int totcol ){
//  for (int i = 1; i <=totrow; i++) {
//     for(int j=1; j<=totcol; j++)
//         if (i==1||i==totrow||j==1||j==totcol) {
//             System.out.print("*");
//         } else {
//             System.out.print("" +" " + "");
//         }
//     System.out.println("");
//  }
//     }
    
// public static void main(String[] args) {
//     hellowretanle(5,7);
// }
// }
// //proram to print inverted or half pramid
// public class funbasics{
//     public static void main(String[] args) {
//         int n =4;
//         //outer loop
//         for (int i = 1; i <=n; i++) {
//             //spaces
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             // star print karane ke liye
//             for (int j =1 ; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");

            
//         }
//     }
// }
// public class funbasics{
//     public static void main(String[] args) {
//         int n=5;
//         int mynumber =1;
//         for (int i = 1; i <=n; i++){
//             for (int j = 1; j<=i; j++) {
//                 System.out.print(mynumber + " ");
//                 mynumber++;

//             }     
//             System.out.println("");
//         }
//     }
// }

//write a prorma to print a o,1 pattern
// public class funbasics{
//     public static void binarypattern(){
//         int n=7;
//         int i,j;
//         for (i = 1; i <= n; i++) {
//             for ( j= 1;  j<= i; j++) {
//                if ((i+j) % 2 ==0) {//even number ki condition ke liye
//                     System.out.print("1");
//                  } else{
//                 System.out.println("0");//odd hai to 0 print karna hai
//                  }
//         }
//         System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         binarypattern();
//     }
// // }
// public class funbasics{
//     public static void main(String[] args) {
//         System.out.println("hellow sir");
//     }
// }