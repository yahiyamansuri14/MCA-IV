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
class Demo{
    Demo(){
        System.out.println("Inside class of Demo");
    }
}
class Demo_Super extends Demo{
    Demo_Super(){
        super();
        System.out.println("Inside class of Demo_Super");
    }
}
public class Question38 {
    public static void main(String args[]){
        Demo_Super obj=new Demo_Super();
        
    }
}
