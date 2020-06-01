/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicapsproject;

import java.io.PrintStream;

/**
 *
 * @author hp
 */
class Color{
    String color="Black";
}
class Extend_Color extends Color{
    String color="Green";
    public void showColor(){
         System.out.println(super.color);
         System.out.println(color);
    }
}
public class Question37 {
    public static void main(String args[]){
            Extend_Color obj=new Extend_Color();
            obj.showColor();
    }
}
