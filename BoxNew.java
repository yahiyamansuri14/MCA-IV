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
//Question32
public class BoxNew {
    int height,width,depth;
    BoxNew(){
        height=width=depth=0;
    }
    BoxNew(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
        System.out.println("Volume of box is:-"+(this.height*this.width*this.depth));
    }
    public static void main(String argsp[]){
        BoxNew obj=new BoxNew();
        BoxNew obj1=new BoxNew(10,20,30);
    }
}
