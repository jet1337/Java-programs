/*
Definition of a rectangle object class
*/

public class rectangle{
   private double width;
   private double height;
   
   rectangle(){
      this(1,1);
      
      //width = 1;
     //height = 1;
   }//default const
   
   rectangle(int w, int h){
      width = w;
      height = h;
   }//const
   
   public double getArea(){
      double a = this.width * this.height;
      return a;
   }//area
   
   public double getPerimeter(){
      double p = this.width * 2 + this.height * 2;
      return p;
   }//perimeter
   
}//end rectangle class