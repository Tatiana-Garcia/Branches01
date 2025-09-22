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
        String s = "Hola";
        int x = search(s);
        System.out.println(x);
        
        Partitura score = new Partitura();
      
        System.out.println("Hola ESTRELLITAS LA TIERRA LES DICE HOLA");
        
        String p = "Soy una taza una tetera una cuchara un cucharon un plat hondo un plato llano un cuchillito y un tenedo";
        System.out.println("miua made with cage free eggs");
        
        score.setNombre("Tierra Mia");
        
        String [] pal = p.split(" ");
        for (int i = 0; i < pal.length; i++) {
            System.out.println(pal[i]);
            System.out.println(i);
        }
        System.out.println("papaya");
        score.setCompas("4/4");
        
    }
    
    public static int search(String nombre){
        for (int i = 0; i < 10; i++) {
            if (nombre=="Hola" && nombre.length() > 3) {
                return i;
            }
        }
        return -1;
    }
    
}
