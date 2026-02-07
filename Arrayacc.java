

//import java.util.*;
// public class Arrayacc{
//     public static void update(int marks[]){
//         for (int i = 0; i < marks.length; i++) {
//             marks [i] = marks [i]+1;//update karne ke liye array ki value ko
            
//         }
//     }
//     public static void main(String[] args) {
//         int marks []={97,98,99};
//         update(marks);
//         for (int i= 0; i < marks.length; i++) {
//            System.out.print(marks[i]+" ");
//         }
// System.out.println();
   // }

 //}
//  import java.util.*;
//  public class Arrayacc{
//      public static void main(String[] args) {
//        int marks[]=new int[10];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your physics marks");
//        marks[0]=sc.nextInt();
//        System.out.println("enter your chemistry marks");
//        marks[1]=sc.nextInt();
//        System.out.println("enter your math marks");
//        marks[2]=sc.nextInt();
//        System.out.println("phy marks is"+" "+ marks[0]);
//        System.out.println("chem marks is"+" "+ marks[1]);
//        System.out.println("math marks is"+" "+ marks[2]);
//       // marks[2]=100;
//        //System.out.println("math"+ marks[2]);
//        }
//      }
//LINNEAR SEARCH PROGRAM
//import java.util.*;
//public class Arrayacc{
// public static void linnsearch(int number[],int key){
//   for (int i = 0; i < number.length; i++) {
//       if (number[i]==key) {
//         System.out.println(i);
//       }
//   }
// }
// public static void main(String[] args) {
//     int number[]={2,4,6,8,10,12,14};
//     int key=14;
//     for (int i = 0; i < number.length; i++) {
//         if (number[i] ==key) {
//             System.out.println("key is at index :"+i);
//         }else{
//           System.out.println("not match");
//         }
//     }
//   // linnsearch(number, key); yaha ye funcation call hai
//    // if (index==-1) {
//      //   System.out.println("not found");
//    // } else {
//     //  System.out.println("key is at index"+index);
//   // }
// //}
//}
//WRITE A PROGRAM TO PRINT THE LARGEST NUMBER
// public class Arrayacc{
//   public static void getlergest(int number[]){
//     int largest = Integer.MIN_VALUE;
//     int secondlargest = Integer.MIN_VALUE;
//     for (int i = 0; i < number.length; i++) {
//       if (largest<number[i]) {
//           largest=number[i];
          
//       }
      

//      // if(number[i]>largest)
//        // System.out.println("the largest number is"+number[i]);
//     }
//     System.out.println("the largest number is"+largest);
          
//     for (int i = 0; i < number.length; i++) {
//            if (number[i]==largest) {
//               continue;
//           } 
//           if(secondlargest<number[i]){
//           secondlargest=number[i];
//           //System.out.println("the second largest number is"+secondlargest);
          
//       }
//           }
//           System.out.println("the second largest number is"+secondlargest);
//           }
//     // return largest;
//   public static void main(String[] args) {
//     int number[]={1,2,3,78,5,6,49,79};
//     // int a =getlergest(number);
//     // System.out.println("the largest number is"+a);
//     getlergest(number);
//   }
// }
// // //WRITE A PRORAM TO BINARY SEARCH
// // public class Arrayacc{
// //   public static void binarysearch(int number[],int key){
// //     int start =0;
// //     int end= number.length-1;
// //     while (start<=end) { 
// //         int mid=(start+end)/2;
// //         if (number[mid]==key) {
// //             System.out.println(mid);
// //         }if (number[mid]<key) {
// //             start = mid+1;
// //         }else{
// //           end = mid-1;
// //         }
// //     }
// //   }
// //   public static void main(String[] args) {
// //       int number[]={2,4,6,8,10,12,14};
// //       int key=4;
// //       binarysearch(number, key);
// //   }
// // }

//A PROGRAM TO REVERSE OF A NUMBER
// public class Arrayacc{
//   public static void reverse(int number[]){
//     int frist =0, last=number.length-1;
//     while (frist<last) { 
//       // swap number  karne ka code hai ye
//       int temp=number[last];
//       number[last]=number[frist];
//       number[frist]=temp;
//       frist++;
//       last--;
        
//     }
//   }
//   public static void main(String[] args) {
//       int number[]={2,4,6,8,10};
//       reverse(number);
//           for (int i = 0; i <number.length; i++) {
//               System.out.print( number[i]+" ");
//           }
//           System.out.println(" ");
//       }
//   }

//WRITE A PROGRAM TO PRINT A PAIR IN AN Array
// public class Arrayacc{
//   public static void main(String[] args) {
//       int number []={1,2,3,4,5};
//       int tp =0;
//       for (int i = 0; i < number.length; i++) {
//         int current=number[i];//matlab  current = 1 position me hai
        
//         for(int j=i+1;j<number.length;j++){
//           System.out.print("(" + current +" ," + number[j] + " ");
//           tp++;// matlab total pairs ++ ho jaye
//       }
//       System.out.println(" ");
//       }
//       System.out.println("total pairs="+ tp);
//   }}

//WRITE A PROGRAM TO PRINT SUB TYPE OF ARRAY
// public class Arrayacc{
//   public static void subtype(int number[]){
//     int ts=0;
//     for (int i =0; i <=number.length; i++) {// ye loop start find karne ke liye 
//       int start=i;
//     for (int j = i; j <=number.length; j++) {//ye loop end find karne ke liye array me
//       int end =j;
//       for (int k = start; k <= end; k++) {// value print karane ke liye
//         System.out.print(number[k]+" ");
//         //  System.out.println("the total number of the sub array is"+number[k]);
//       }
//       ts++;
//       System.out.println();
//     }
// System.out.println("total subarrays = " + ts);
//     }
//   }
//   public static void main(String[] args) {
//       int number[]={2,4,6,8,10};
//       subtype(number);
//   }
// }

// public class Arrayacc{
//   public static void main(String[] args) {
//       int arr[]={2,4,6,8,10};
//       int target=10;
//       other:
//       for (int i = 0; i < arr.length; i++) {
//         for (int j = i+1; j < arr.length; j++){
//           if (arr[i]+  arr[j] ==target){
//             System.out.println("number of one is"+ arr[i] +" "+ "numberof" +arr[j]+" ");
//             break other;
//           }
//         }
//       }
//   }
//}
public class Arrayacc{
public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    for (int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        while(prev >=0 && arr[prev]>curr){
          arr[prev+1]=arr[prev];
          prev--;
        }
        arr[prev+1]=arr[prev];
    }
}
}