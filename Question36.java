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
class D{
    public void show(){System.out.println("Inside class D");}
}
class E extends D{
    public void show(){System.out.println("Inside class E");}
}
class F extends D{
    public void show(){System.out.println("Inside class F");}
}
public class Question36 {
    public static void main(String args[]){
        D d=new D();
        d.show();
        E e=new E();
        e.show();
        F f=new F();
        f.show();
    }
}
