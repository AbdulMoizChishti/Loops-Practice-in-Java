/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // for loops
        
        
       for(int j=10; j >0; j--){
           System.out.println(j);
       }
        Scanner obj= new Scanner(System.in);

        int num=obj.nextInt();
        for(int i=1;i< 11; i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
        
        
        int no=11;
        int rem= no%2;
        System.out.println(rem);
        int quo = no/2;
        System.out.println(quo);
    }
    
}
