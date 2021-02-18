/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.project;

import java.util.ArrayList;
import static sun.security.krb5.Confounder.intValue;

/**
 *
 * @author kamal
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Integer> a=new ArrayList(); 
        a.add(10);
        a.add(new Integer(17));
        System.out.println(a.get(0));
        
        ///////////////////////////////////////
        
        //data type object
        Integer i=new Integer(20); 
        int b=i.intValue();
        System.out.println(b);
        i=i+6; //unboxing
        i=b; //boxing
        System.out.println("i = "+ i);
        
        //////////////////////////////////////////////
        
        // boxing and unboxing
        
        int w=13; //data type boxing
        Integer n=new Integer(3); //unboxin wraper
        int j=n; //unboxing to boxing
        int s=w*n; //boxing
        n=s+9;
        System.out.println(n);
    
        ///////////////////////////////////
        
        //convert unboxing to boxing by another example
        
        Integer g=new Integer("6");
        int h=g.intValue();
        System.out.println(h);
        
        
        ///////////////////////////
        
        int kk=5; // data type
        Integer n4=new Integer(12); //wrapper type
        int gg=n4; //unboxing boxing
        int ww=gg*kk;
        n4=ww;
        System.out.println("the result is : "+ n4);
        
        //////////////// get path on class //////////////////
        
            extend eee=new extend();
            int ii= eee.getpath();
            System.out.println(ii);

        ////////////////// get size on class ///////////////////
        
            extend e=new extend();
            System.out.println(e.getsize());

    }
    
}
