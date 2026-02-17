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
// public class sorting{
// public static void selectionsort(int arr[]){
//     for(int i=0;i<arr.length-1;i++){
//         int minpos=i;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[minpos]>arr[j]){
//                 minpos=j;


//             }
//         }
//         int temp=arr[minpos];
//         arr[minpos]=arr[i];
//         arr[i]=temp;
//         // for (int k = 0; k < arr.length; k++) { e 
//         //     System.out.print(arr[k] + " ");
//         // }
//         // System.out.println();
//         // yaha pe loop lagane se puri swaping one by one dikhegi
//     }
//     for (int k = 0; k < arr.length; k++) {
//             System.out.print(arr[k] + " ");
//         }
//         System.out.println();
    
// }
// public static void main(String args[]){
//     int arr[]={5,4,1,3,2};
//     selectionsort(arr);
//    // for(int i=0;i<arr.length;i++){
//      //   System.out.print(arr[i]+" ");
//     }
// }

//MARGE SORT USING RECURSION
// public class sorting{
//     public static void printArr(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     System.out.println();
//     }
//     public static void margesort(int arr[],int si,int ei){
//         if (si>=ei) {//base case
//             return;
//         }
//         //kaam
//         int mid = si+(ei-si)/2;//or (si+ei)/2
//         margesort(arr, si, mid);// for left part
//         margesort(arr, mid+1, ei);//for right part
//         merge(arr,si,ei,mid);
//     }
//     public static void merge(int arr[],int si,int ei,int mid){
//         //left(0,3)=4 and right(4,6)=3 total size =ei=6-si=0+1 =7
//         int temp[]=new int [ei-si+1];// yaha pe temp ka size define kiya gaya hai
//         int i = si;//iterator for left part
//         int j =mid+1; //iterator for right part
//         int k = 0; //iterator for temp arr

//         while (i<= mid && j<= ei) { 
//             if (arr[i]<arr[j]) {
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }
//         //left part ke liye agar element bache hai
//         while (i<=mid) { 
//             temp[k++] =  arr[i++];
//         }
//         //right part ke liye
//         while (j<=ei) { 
//             temp[k++] = arr[j++];
//         }
//         //copy temp for original arr
//         for (k = 0, i=si; k<temp.length; k++,i++) {
//             arr[i]=temp[k];
//         }
//     }
    
// public static void main(String[] args) {
//     int arr[]= {5,6,8,4,2};
//     margesort(arr, 0, arr.length-1);
//     printArr(arr);
// }
// }

public class sorting{
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei) {
         return;   
        }
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx-1);//left ke liye
        quicksort(arr, pidx+1, ei);//right ke liye

    }
    public static int partition(int arr[], int si,int ei){
    int pivot =arr[ei];
    int i = si-1;//to make place for els smaller than pivot
    for (int j = si; j < ei; j++) {
        if(arr[j] <= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp = pivot;
            arr[ei] = arr[i];
            arr[i]=temp;
            return i;
    }
    public static void main(String[] args) {
        int arr[]={2,5,3,4,8};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
    }