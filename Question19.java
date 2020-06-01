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
public class Question19 {
    public void maxMin(int a[]){
        int max=a[0],min=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])
                max=a[i];
            if(min>a[i])
                min=a[i];
        }
        System.out.println("max="+max+"min="+min);
    }
    public static void main(String args[]){
        int a[]={10,20,30,40,50,60,70,80,90,100};
        Question19 obj=new Question19();
        obj.maxMin(a);
    }
}
