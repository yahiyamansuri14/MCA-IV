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
//Question24
public class Box {
    Box(int a){
        System.out.println("Volume of box is:-"+(a*a*a));
    }
    public static void main(String args[]){
        Box b=new Box(5);
    }
}
