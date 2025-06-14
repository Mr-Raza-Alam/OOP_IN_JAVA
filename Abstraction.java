public class Abstraction {//4th-pillar of OOPS
 public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walk();
    //h.changeColor(); here it will show dark-black i.e its own property
    System.out.println( h.color);
    h.changeColor();//color will print brown i.e. its parent property    
   Chicken c = new Chicken();
    c.walk();
    c.eat();

   } 
    
}

 abstract class Animal{//This class become an abstract class 
      String color;
    Animal(){//This is constructor of class Animal
        System.out.println("Animal constructo is called...A");
        color = "Brown";
     }

    void eat(){//This is a non-abstract fun.
      System.out.println("Animal eat fruite also");
    }
   abstract void walk();//abstract function/method..here we just declare and just provid some idea rather than its implementation
}

class Horse extends Animal{
  Horse(){//it will come after its parent's class constructor
    System.out.println("Horse constructor is called....H");

  }
  void changeColor(){
   color = "dark-black";
  }

     void walk(){
        System.out.println("Horses walks on 4 legs");
     }
     void eat(){
        System.out.println("They eat mostly grass");
     }
}

class Mushtane extends Horse{
    Mushtane(){
      System.out.println("Musthane constructor is called....M");   
      }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chickens walks on 2 legs");
    }
  void eat(){
    System.out.println("They eat mostly grain");
  }
  void setColor(){
   color = "Yellow";
  }
}
