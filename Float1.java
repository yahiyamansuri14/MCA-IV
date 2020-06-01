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

//Question27
public class Float1 {
    float x;
    Float1(float x){
        this.x=x;
    }
    public void add(Float1 f1,Float1 f2){
        System.out.println(f1.x+f2.x);
    }
    
    public void substract(Float1 f1,Float1 f2){
        System.out.println(f1.x-f2.x);
    }
    
    public void multiply(Float1 f1,Float1 f2){
        System.out.println(f1.x*f2.x);
    }
    public static void main(String args[]){
        Float1 f1=new Float1((float) 1.5);
        f1.add(f1, new Float1((float) 2.5));
        f1.substract(f1, new Float1((float) 2.5));
        f1.multiply(f1, new Float1((float) 2.5));
    }
}
