
// public static String compress(String str){
//     String newstr ="";
//     for (int i = 0; i < str.length(); i++) {
//         Integer count = 1;
//         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) { 
//             count++;
//             i++;
//         }
//         newstr += str.charAt(i);
//         if(count>1){
//             newstr +=count.toString();
//         }
//     }
// return newstr;
// }
// public static void main(String[] args) {
//     String str ="bbbccaadddyyy";
//     System.out.println(compress(str));
// }
// }

// StringBuilder ka use karke same compression ke program ka implementation

// public class string {    
// public static void main(String[] args) {
//     String str ="bbbccaadddyyy";
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < str.length(); i++) {
//         int count=1;
//         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) { 
//             count++;
//             i++;
//         }
//         sb.append(str.charAt(i));
//         if (count >1) {
//             sb.append(count);
//         }
//     }
//     System.out.println(sb.toString());
// }
// }

// A PROGRAM TO PRINT FRIST LETTER OF WORD IN CAPITATAL FORM IN A GIVEN STRING

// public class string{
//     public static void main(String[] args) {
//         String str = " hii i am saurabh pandey";
//         StringBuilder sb = new StringBuilder();
//         sb.append(Character.toUpperCase(str.charAt(0)));
//         //pahle charector ko upper case me convert karne ke liye
//         for (int i = 1; i < str.length(); i++) {
//             if ( str.charAt(i-1) == ' ' ) {
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         System.err.println(sb.toString());
//     }
// }

// A PRORAM TO PRINT A LOWER CASE STRING INTO UPPERCASE
// public class string{
//     public static void main(String[] args) {
//         String str="hii i am saurabh";
//         StringBuilder mp=new StringBuilder();
//         for (int i = 0; i < str.length(); i++) {
//             mp.append(Character.toUpperCase(str.charAt(i)));
//         }
//         System.out.println("the upper case is"+" " +mp.toString());
//     }
// }

//A PRORAM TO PRINT A LARGEST STRING 
// public class string{
//     public static void main(String[] args) {
//         String fruits[]={"apple","mango","banana"};
//         String largest=fruits[0];
//         for (int i = 0; i < fruits.length; i++) {
//             //yaha pe length() ka use es liye nhi kiya gaya kitu ki yr string arr hai
//             if (largest.compareTo(fruits[i])<0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// A PROGRAM TO COMPARE STRING FUNCATION
// public class string{
//     public static void main(String[] args) {
//         String s1="saurabh";
//         String s2="saurabh";
//         String s3=new String("saurabh");
//         if (s1==s2) {
//         System.out.print("s1 is equle to s2");
//         } else {
//             System.out.print(" s1 not equle to s2");
//         }
//         if (s2==s3) {
//             //yaha ye not equle bata raha hai jabki value same hai es case me 
//             //ek special funcation ka use karte hai---- if(s2.equles(s3))
//             System.out.print("s3==s2");
//         } else {
//             System.out.println("s3!=s2");
//         }
//     }
// }
// A PROGRAM TO FIND A SHORTEST PATH
public class string{
public static double getshortestpath(String path){
    int x=0,y=0 ,dir=0 ,x2=x*x,y2=y*y;
    for (int i = 0; i < path.length(); i++) {
        if(dir=='s'){
             y--;
        }
        //north ke liye
        else if(dir=='n'){
            y++;
        }
        //west ke liye 
        else if(dir=='w'){
        x--;
    }else{//east ke liye
        x++;
    }
}
return Math.sqrt(x2+y2);
}
public static void main(String[] args) {
    String path="wneenesennn";
    System.err.println(getshortestpath(path));
}
}