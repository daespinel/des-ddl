/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author ADMINW7
 */
public class DESprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola niña linda!");
        
        int ejemplo=75;
        String bin = String.format("%8s", Integer.toBinaryString(ejemplo)).replace(' ','0');
        System.out.println(bin);
                
    }
    
    private static int[] pc1(){
        int[] temporal=new int[48];
        return temporal;
    }
    
    private static int[] pc2(){
        int[] temporal=new int[48];
        return temporal;
    }
    
    private static int[] ip(){
        int[] temporal=new int[48];
        return temporal;
    }
}
