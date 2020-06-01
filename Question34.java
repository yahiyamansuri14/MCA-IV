/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicapsproject;

/**
 *
 * @author hp
 */
class Figure{
    int dim1,dim2;
    Figure(){dim1=0;dim2=0;}
    public void area(){}
}
class Rectangle_New extends Figure{
    Rectangle_New(){
       dim1=5;dim2=10;
    }
    public void area(){
        System.out.println("Area of rectangle:-"+(dim1*dim2));
    }
}
class Triangle_New extends Figure{
    Triangle_New(){
        dim1=5;dim2=5;
    }
    public void area(){
        System.out.println("Area of triangle is:-"+((dim1*dim2)/2));
    }
}
public class Question34 {
    public static void main(String args[]){
        Figure f=new Rectangle_New();
        f.area();
        f=new Triangle_New();
        f.area();
      }
}
