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
public class Question21 {
    public void addition(int a[][],int b[][]){
        System.out.println("Addition of two matrix is:-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(a[i][j]+b[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void substraction(int a[][],int b[][]){
        System.out.println("Substraction of two matrix is:-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(a[i][j]-b[i][j]+" \t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void multiplication(int a[][],int b[][]){
        int c[][]=new int[a.length][b.length];
        System.out.println("Multiplication of two matrix is:-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=0;
                for(int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" \t");
            }
            System.out.println();
        }
            
    }
    public static void main(String args[]){
        Question21 obj=new Question21();
        int a[][]={{1,1,1},
                   {1,1,1},
                   {1,1,1}
                   };
        int b[][]={{2,2,2},
                   {2,2,2},
                   {2,2,2}
                   };
        obj.addition(a, b);
        obj.substraction(a, b);
        obj.multiplication(a, b);
    }
}
