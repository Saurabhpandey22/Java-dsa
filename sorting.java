// public class sorting{
//     public static void bubblesort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }

// public static void printarray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
// }
// public static void main(String args[]){
//     int arr[]={5,4,1,3,2};
//     bubblesort(arr);
//     printarray(arr);
//     }
// }

//SORTING USING INBUILT FUNCATION
// import java.util.Arrays;
// public class sorting{
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
//SELECTION SORT
public class sorting{
public static void selectionsort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;


            }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
        // for (int k = 0; k < arr.length; k++) { e 
        //     System.out.print(arr[k] + " ");
        // }
        // System.out.println();
        // yaha pe loop lagane se puri swaping one by one dikhegi
    }
    for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    
}
public static void main(String args[]){
    int arr[]={5,4,1,3,2};
    selectionsort(arr);
   // for(int i=0;i<arr.length;i++){
     //   System.out.print(arr[i]+" ");
    }
}

