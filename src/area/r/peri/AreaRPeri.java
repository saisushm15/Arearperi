/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.r.peri;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class AreaRPeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int l=input.nextInt();
        int b=input.nextInt();
        if(l*b>2*l+b)
        {
            System.out.println("Area");
            System.out.println(l*b);
        }
        else if(l*b<2*(l+b))
        {
            System.out.println("Peri");
            System.out.println(2*(l+b));
 
        }
        else
        {
            System.out.println("Eq");
            System.out.println(2*(l+b));
        }
    }
    
}
