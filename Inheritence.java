public class Inheritence {//3rd-pillar of OOPS
 public static void main(String args[]){
  Snake cobra = new Snake();
  Peacock pena = new Peacock();
  Human einstine = new Human();
  cobra.eat();
  cobra.crawl();
  pena.dance();
  pena.fly();
  einstine.eat();
  einstine.intelligent();
//    Fish dolphine = new Fish();
//     dolphine.eat();//but this func. is undedefined in the Fish class but still it work 
 }
}
//base or parents class
class Animal{
   String color;
  void eat(){
    System.out.println("eats");
  }
  void breath(){
    System.out.println("breadths");
  }    
}

class Mammal extends Animal {
    int legs;
    String hair;   
    void walk(){
      System.out.println("They walk");
   }  
}

class Snake extends Animal {
  void crawl(){
    System.out.println("The snakes crawls in the zig-zak manner");
 }  
}

class Bird extends Animal {//hierarchical inheritence-- No.-3
  void fly(){
    System.out.println("The birds fly");
 }  
}

class Peacock extends Bird{// hierarchical inheritnace
   void dance(){
    System.out.println("Peacock dance in the rainy monsoon");
   }
}
class Peagion extends Bird{
  void race(){
   System.out.println("Peagion participate in race compition");
  }
}
class Human extends Mammal{//hybrid inheritence--No.4
  void intelligent(){
   System.out.println("Human are more intelligent than all other species");
  }
}
//  class Dog extends Mammal {//Multi-level inheritence 
//   void breed(){
//     System.out.println("They eat bread or bones");
//   }

// }


// // derived class or subclass
// class Fish extends Animal{//all properties of Animal class are inherintence in the Fish class
//     int fins;

//     void swims(){
//         System.out.println("Swims in the water");
//     }
// }