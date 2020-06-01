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
//Question30
public class Question30 {
    static int a=0;
    public void count(){
        a++;
    }
    public void show(){
        System.out.println("no of object is:-"+a);
    }
    public static void main(String args[]){
        Question30 obj=new Question30();
        Question30 obj1=new Question30();
        Question30 obj2=new Question30();
        Question30 obj3=new Question30();
        obj.count();
        obj1.count();
        obj2.count();
        obj3.count();
        obj.show();
    }
}
