/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cm69ikereducastur.com.tienda2026;

/**
 *
 * @author 1dawd23
 */
public class Tienda2026 {

    public static void main(String[] args) {
        
    }
    
    public static void validarDNI(String dni) {
    //verificar que el DNI tiene un formato válido.
        if (dni.isBlank() || !dni.matches("")) {
            return false;
        }
    }
    
}
