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
public class Question20 {
    public static void main(String args[]){
        int a[]={5,1,6,3,9,12,56,11,90};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    
}
