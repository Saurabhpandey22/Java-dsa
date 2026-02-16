// a program to print a X^n using recursion funcation
// public class Basicrecursion{
//     public static int powerofx(int a,int n){
//         if(n==0){
//             return 1;
//         }
//         int xnm1=powerofx(a, n-1);
//         int xn= a*xnm1;// xnm means x(n-1) and xn =x ki power n
//         return xn;
//     }
//     public static void main(String[] args) {
//         int a=4;
//         int n=2;
//         System.out.println(powerofx(a, n));
//     }
// }

//a program to print a optimizedpower of x^n

// public class Basicrecursion{
//     public static int optimizedpower(int a,int n){
//         if(n==0){ // ye base case hai
//             return 1;
//         }
//         int halfpower=optimizedpower(a, n/2);//recursive funcation hai(matlab funcation khud ko call laga raha hai)
//         int halfpowersq=halfpower*halfpower;
//         if (n%2!=0) {
//             halfpowersq=a*halfpowersq;
//         }
//         return halfpowersq;
//     }
//     public static void main(String[] args) {
//         int a=2;
//         int n=10;
//         System.out.println(optimizedpower(a, n));
//     }
// }
 
 // a program to solve a tiling problem
//  public class Basicrecursion{
//     public static int tilingproblem(int n){//2*n(floor size)
//         if(n==0 ||n==1){
//             return 1;
//         }
//         //kaam
//         // for vertical choice
//         int verticalTiles= tilingproblem(n-1);
//         //for horizontal choice
//         int horizontalTiles=tilingproblem(n-2);
//         int totalway = verticalTiles + horizontalTiles;
//         return totalway;
//     }
//     public static void main(String[] args) {
//         int n= 4;
//         System.out.println(tilingproblem(n));
//     }
//  }
// program to remove duplicates in a string
// public class Basicrecursion{
// public static void removeDuplicates(String str, int idx,StringBuilder newstr, boolean map[]){
//         if (idx == str.length()) {// base case
//             System.out.println(newstr);
//             return;
    
//         }
//         //kaam
//         char currchar = str.charAt(idx);
//         if (map[currchar-'a']==true) {
//         removeDuplicates(str, idx+1, newstr, map);
//             //duplicate hai agar map[currchar - 'a']==true matlab a=1 hai agar dusra a bhi 1 mil gaya 1se 1 sustract ho jayega matlab dublicate ho jayea
//         } else {
//             map[currchar-'a']=true;
//             removeDuplicates(str, idx+1, newstr.append(currchar), map);// idx ko +1 kar dee next element ke liye and ab newstr me charactor koadd kar dege using .append()
//         }
    
//     }
//     public static void main(String[] args) {
//        String str = "appnacollage";
//    removeDuplicates(str, 0, new StringBuilder(""),  new boolean[26]);
// // System.out.println(removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]));
//         // funcation void return kar raha hai matlab kuch nhi esliye system.out.println ka use nhi karenge
//     }
// }
//a probram to find the solution of friend pairing
// public class Basicrecursion{
//     public static int friendpairing(int n){
//         if (n==1||n==2) {
//             return n;
//         }
        //choice 
        //single
      //  int fnm1 = friendpairing(n-1);
        //for pair
      //  int fnm2 = friendpairing(n-2);
       // int pairway = (n-1)*fnm2;
        //for totalway
      //  int totalway = fnm1 + pairway;
//         return friendpairing(n-1) +(n-1)*friendpairing(n-2);
//     }
//     public static void main(String[] args) {
//         System.out.println(friendpairing(3));
//     }
// }

//PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES.("010101") DO 11 EK SATH NA AAYE
// public class Basicrecursion{
//     public static void printbinstring(int n, int lastplace, String str){
//         if (n==0) {
//             System.out.println(str);
//             return;
//         }
//         printbinstring(n-1, 0, str+"0");
//         if (lastplace == 0) {
//     printbinstring(n-1, 1, str+"1");
            
//         }
//     }
//     public static void main(String[] args) {
//         printbinstring(3, 0, "");
//     }
// }