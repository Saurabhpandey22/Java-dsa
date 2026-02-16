//WRITE A PROGRAM TO ASSIGN NAME TO OBJECT
// public class oops{
//     public static void main(String[] args) {
       // Student s = new Student();
       // s.name="saurabh";
       // System.out.println(s.name);
        //s.marks=30;
   // }}
    //class Student{
    //   public   String name;
    //    // int age;
    //    public int marks;
    // }
    // problem 3 find that which variable person class access in the given code
    // class Person{ //parent class or base class
    //     String name;// the abobe code is exaple of single-level inheritance
    //     int weight;
    // }
    // class Student extends Person{ //child class or derived class
    //     int rollnumber;
    //     String schoolname;
    // }
  // solutation is this that person class access only two variable which is... 
  //  string name , int weight because person is a base class
  
//A PRORAM TO FUNCATION OVERRIDING and polymorfisham
// public class oops{
// public static void main(String[] args) {
//     vehicle obj1 = new car();
//     obj1.print();// do print() hai esliye ye funcaation overriding hai
//     vehicle obj2 = new vehicle();
//     obj2.print();
// }

// }
// class vehicle{
//     void print(){
//         System.out.println("base class vehical");
//     }
// }
// class car extends vehicle{
//     void print(){
//         System.out.println("derived class car");
//     }
// }
// public class oops{
// public static void main(String[] args) {
//     vehicle obj1 = new car();
//     obj1.print1();//  ye error esliye aa rahi hai kiyu ki yaha kiyuki print1() vecial me reconized hi nhi kar raha hai
//     vehicle obj2 = new vehicle();
//     obj2.print();
// }

// }
// class vehicle{
//     void print(){
//         System.out.println("base class vehical");
//     }
// }
// class car extends vehicle{
//     void print1(){
//         System.out.println("derived class car");
//     }
// }