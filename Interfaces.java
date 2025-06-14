public class Interfaces {
 public static void main(String agrs[]){
//    Queen q = new Queen();
//    q.moves();
//    Rook r = new Rook();
//    r.moves();
ECE st1 = new ECE();
st1.softwareEng();
st1.iasOfficer();
st1.eceStudent();
 }
    
}

interface CSE{
    void softwareEng();
}
interface UPSE{
    void iasOfficer();
}
class ECE implements CSE,UPSE{//Multiple inheritance
    public void softwareEng(){
     System.out.println("CSE student ,become Software engineer in general");
    }
    public void iasOfficer(){
    System.out.println("UPSE student ,become IAS officer in general");
    }
    void eceStudent(){
     System.out.println("But ,ECE student can become both a software eng.as well as an IAS officer");
    }
}
interface chessPlayer{//This is interface like class but has some diff.
   void moves();//this is public,abstract,here it is without implement

}

class Queen implements chessPlayer{
  public void moves(){//SINCE it is public so,use public keyword
     System.out.println("up,down,right,left,diagonal(in all 4 dir.)");
  }
  void changeColor(){
    System.out.println("The color of rook is white ");
}
}
class Rook implements chessPlayer{
    public void moves(){
       System.out.println("Rook moves only diagonally ");
    }
    void changeColor(){
        System.out.println("The color of rook is black ");
    }
}