/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bthd.borratuhuelladigital;

/**
 *
 * @author jaxt3
 */
public class datosLogin {
    private static String username; // Almacenará el username
    private static String realName;
    // Getter para obtener el valor del username
    public static String getUsername() {
        return username;
    }

    // Setter para asignar un valor al username
    public static void setUsername(String username) {
        datosLogin.username = username;
    }
    
        public static String getNombre() {
        return realName;
    }
        
        public static void setNombre(String realName) {
        datosLogin.realName = realName;
    }    
}
