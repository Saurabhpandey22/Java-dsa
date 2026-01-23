//check number is prime or not

//     import java.util.*;
// public class loopbasics{
//     public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter a number:");
//                 int num = sc.nextInt();
//                 if(num==2){
//                     System.out.println(" number is prime");
//                 }else{
//                     boolean isprime = true;
//                     for(int i=2; i<=num-1;i++){
//                         if(num%i==0){
//                             isprime = false;
//                         }
//                     }
//                     if (isprime==true) {
//                         System.out.println("number is prime");
//                     } else {
//                         System.err.println("numer is not prime");
//                     }
//                 }
//     }}
//a program to facorial of a number  
// import java.util.*;
// public class loopbasics{
//     public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter a number:");
//                 int num = sc.nextInt();
//                 int fact=1,i;
//                 for(i=1; i<=num;i++){
//                     fact=fact*i;//or fact*=i
//                     System.err.println(fact);
//                 }
//     }}    
//A program to print a pattern
// import java.util.*;
// public class loopbasics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     int line=1,star=1,n=4;
//     for (line=1; line<=n; line++) {//outer loop hai ye
//         for (star = 1; star<=line; star++) {//inner loop hai ye
//         System.err.print("*");
//         }
//         System.err.println("");
//     }
//     }}
//PRINT REVERSE OF STARS
// import java.util.*;
// public class loopbasics{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.err.println("enter the value of lines");
    //     int n=sc.nextInt();
    // int line,star;
    // for (line=1; line<=n; line++ ){//outer loop hai ye
    //     for (star = 1; star<=n-line; star++) {//inner loop hai ye
    //     System.err.print("*");
    //     }
    //     System.err.println("");
    // }
    // }}
    //PRORAM TO PRINT THE ABCD PATTERN
    //import java.util.*;
    // public class loopbasics{
    // public static void main(String[] args) {
    //    // Scanner sc = new Scanner(System.in);
    //    // System.out.println("enter the numbers");
    //     int n = 4;
    // char ch = 'A';
    // for (int line= 1; line<=n; line++ ){//outer loop hai ye
    //     for ( int chars= 1; chars<=line; chars++) {//inner loop hai ye
    //     System.out.print(ch);
    //     ch++;
    //     }
    //     System.out.println();
    // }
    // }}
//     import java.util.*;
// public class loopbasics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        // int age= sc.nextInt();
//                  System.out.println("enter our age:");
//               int age= sc.nextInt();
//                 System.out.println("your age is"+age);
//                 System.out.print("enter your name");
//                 String name=sc.next();
//                // System.out.println("enter your name");
//                 System.err.print("your name is" + name);
//     }}

//  import java.util.*;
// public class loopbasics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.err.println("enter your marks");
//     int marks = sc.nextInt();
//     if (marks>=90 && marks<=100) {
//         System.err.print("you earn grade" + 'A');
//     }
//         else if (marks>=75 && marks<=89) {
//             System.err.print("you earn grade" + 'B');
//             }
//              else if (marks>=60 && marks<=74) {
//                 System.out.println("you earn grade"+'C');
                
//             }
//             else if (marks<=60) {
//                 System.err.println("fail");
            
//     }  
//     }}

public class loopbasics{
    public static void main(String[] args) {

    int num;
    for (num = 1; num< 10; num++) {
        if (num%2==0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        
    }
    }}
                

    








        

 

