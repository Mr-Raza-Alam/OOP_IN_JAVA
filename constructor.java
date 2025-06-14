public class constructor {
 public static void main(String agrs[]){
   Pen p1 = new Pen();
   p1.name = "Octane";
   p1.price = 10.32f;
   p1.num = 4;
   p1.marks[0] = 89;
   p1.marks[1] = 95;
   p1.marks[2] = 99;
     
  Pen p2 = new Pen(p1);
  p1.marks[1] = 87;
 for(int i = 0; i<3; i++){
    System.out.println(p2.marks[i]);//copy
 }

 
//   Student s1 = new Student("Sindhu");
//   System.out.println("After constructor called s1 = "+ s1.name);
//   Student s2 = new Student();
//   Student s3 = new Student(238);
//   System.out.println("The roll no. of student s3 = "+s3.roll);
 }
}

class Student{//3rd-pillar is encapsulation
    String name;
    int roll;
   Student(String name){
    System.out.println("The construct is called....");
    this.name = name;
   }
   Student(){
    System.out.println("The process of multiple constructor called after once is called const. overloading");
   }
  Student(int roll){
   this.roll = roll;
  }
}
class Pen{
    String name;
    float price;
    int num;
    int marks[];
   Pen(){
    marks = new int[3];
    System.out.println("Welcome to copy constructor");
   }

   Pen(String name){//why we declare marks[3] in each constructor to ensure there is only one marks array to store marks of 3 subjects
    marks = new int[3];
    this.name = name;
   }

   
   Pen(float price){
    marks = new int[3];
    this.price = price;
   }
   
   Pen(int num)    {
    marks = new int[3];
    this.num = num;
   }

       //make a copy constructor. i.e. deep copy
       Pen(Pen p1){
        marks = new int[3];
        this. marks = p1.marks;
        this.name = p1.name;
        this.price = p1. price;
        this.num = p1.num;
        for(int i = 0; i<marks.length; i++){//
        this.marks[i] = p1.marks[i];
        }
         }
//    //make a copy constructor. i.e. shallow copy
//      Pen(Pen s1){
//      this. marks = s1.marks;
//      this.name = s1.name;
//      this.price = s1. price;
//      this.num = s1.num;
//       }
 }