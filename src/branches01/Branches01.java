/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package branches01;

/**
 *
 * @author tatig
 */
public class Branches01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        
        
        String p = "Soy una taza una tetera una cuchara un cucharon un plat hondo un plato llano un cuchillito y un tenedo";
        String [] pal = p.split(" ");
        for (int i = 0; i < pal.length; i++) {
            System.out.println(pal[i]);
        }
    }
    
}
