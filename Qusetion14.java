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
public class Qusetion14 {
    public void copyString(String str1,String str2){
        System.out.println(str1.concat(str2));
    }
    public static void main(String args[]){
        String str1="medicaps";
        String str2="university";
        Qusetion14 obj=new Qusetion14();
        obj.copyString(str1,str2);
    }
}
