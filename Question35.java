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
class A{
    public void show(){System.out.println("Inside class A");}
}
class B extends A{
    public void display(){System.out.println("Inside class B");}
}
class C extends B{
    public void print(){System.out.println("Inside class C");}
}
public class Question35 {
    public static void main(String args[]){
        C c=new C();
        c.display();
        c.print();
        c.show();
    }
}
