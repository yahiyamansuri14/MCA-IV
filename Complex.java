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
//Question26
public class Complex {
    float real;
    float img;
    Complex(float real,float img){
        this.real=real;
        this.img=img;
    }
    public static void add(Complex c1,Complex c2){
        System.out.println((c1.real+c2.real)+"i"+(c1.img+c2.img));
    }
    public static void sub(Complex c1,Complex c2){
        System.out.println((c1.real-c2.real)+"i"+(c1.img-c2.img));
    }
    public static void mul(Complex c1,Complex c2){
        float x=c1.real;
        float y=c1.img;
        float u=c2.real;
        float v=c2.img;
        System.out.println((x*u)-(y*u)+"i"+(x*v)+(y*u));
    }
    public static void main(String args[]){
        Complex c1=new Complex(5,7);
        Complex c2=new Complex(2,5);
        add(c1,c2);
        sub(c1,c2);
        mul(c1,c2);
    }
}
