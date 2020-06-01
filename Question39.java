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
public class Question39 implements Ishape
{

    @Override
    public void getArea(int r) {
        System.out.println("Area of circle:-"+(3.14*r*r));
    }

    @Override
    public void getPerimeter(int r) {
        System.out.println("Perimeter of circle:-"+(2*3.14*r));
    }
    public static void main(String args[]){
        Ishape obj=new Question39();
        obj.getArea(5);
        obj.getPerimeter(10);
    }

    
}
