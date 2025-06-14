public class firstlclass {
  public static void main(String args[]){
   // System.out.println("Welcome to OOPS world");
    Pen p1 = new Pen();//here a Pen object has been created with name is p1 
    Student s1 = new Student();//here alse a Student object has been created with name s1
    BankAcc BAH1 = new BankAcc();//a BankAcc object
    BAH1.userName = "Raza Alam";
    System.out.println("Username :- "+ BAH1.userName);
   // BAH1.password = "raza2354"; direct change can't accessible
    BAH1.setPassword("raza234@");
    //System.out.println(BAH1.password); here direct access is not avialable b/c password hold private access modifier
    System.out.println("The set password is:- "+BAH1.getPassword());
    p1.color = "Blue";
    System.out.println("The color of Pen p1 = "+p1.color);
    p1.setTip(6);
    System.out.println("The tip-value of Pen p1 = "+p1.tip);
   System.out.println("The percentage of Student s1 = "+ s1.calPercentage(89,93,85));

  }
}
//generally we write our own class below the public class for making object with error-free
class Pen{// This is a blue-print of PEN.
   String color;
   int tip;

   void setColoe(String newColor){
    color = newColor;
   }

   void setTip(int newTip){
     tip = newTip;
   }
}

class Student{// it is also called encapsulation of data & function
  String name;
  int age;
  float percentage;

  float calPercentage(int phy,int chem,int mathe){
    percentage = (phy + chem + mathe)/3;
      return percentage;
  }
}

class BankAcc{
  public String userName;
  private String password;
  String getPassword(){
    return this.password;
  }
  void setPassword(String pwd){
   this. password = pwd;
  }
}
