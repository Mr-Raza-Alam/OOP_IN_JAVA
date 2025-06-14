public class staticKey {
 public static void main(String args[]){
    Student s1 = new Student();
    System.out.println(s1.color);
    s1.name = "Raza";
    s1.roll = 238;
    s1.school = "TSSOT";
    Student s2 = new Student();
    s2.name = "Dhendup";
    s2.roll = 247;
    // System.out.println("The school of s2 is "+s2.school);//here we donot assign school to object s2 of student class but still it print the school's name 
    // s2.school = "Assam University";//here we change the school so , school will be change for all students object of class Student;
    // System.out.println("The school of s1 is "+s1.school);
    // System.out.println("The school of s2 is "+s2.school);
   
 }
    
}

class Student{
 String color;

    Student(){
    System.out.println("The student constructor is called...");
 }
    String name;
    int roll;
    float grade;
    static String school;
}

class CrikPlayer extends Student{
 CrikPlayer(){
    //super();// by default java set it  as super();i.e first class Student's constructor is called then CrickPlayer
     //But actual use is given below;
   super.color = "Pink";
    System.out.println("The CrickPlayer constructor is called...");
 }

}