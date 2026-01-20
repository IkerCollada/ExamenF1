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
    
    public static boolean validarDNI(String dni) {
    //verificar que el DNI tiene un formato válido.
        if (dni.isBlank() || !dni.matches("\\d(8)")) {
            return false;
        }
    }
    
    //Extraer el número y la letra del DNI.
    String numero = dni.substring(0, 8);
    char letra = dni.charAt(8);
    
    //Calcular la letra correspondiente al número del DNI
    char letraCalculada = calcularLetraDNI(Integer.parseInt(numerosStr));
    
    /*Comparar la letra calculada con la letra proporcionada y devolver
    el resultadode la comparación TRUE/FALSE. */
    
    return letra == letraCalculada;
    
    /* Devuelve TRUE si la letra del DNI y la calculada según la fórmula.
    SE PUEDE DEVOLVER ASÍ EL RESULTADO DE UNA COMPARACIÓN. Se devuelve
    TRUE si se cumple y FALSE sino. Es equivalente a poner:
    
    if 
    
    */
    if (letra == letraCalculada) {
        return TRUE;
} //comentar la linea de codigo
    
}
