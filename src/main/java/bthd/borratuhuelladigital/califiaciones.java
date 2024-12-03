/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bthd.borratuhuelladigital;
import java.util.Random;
/**
 *
 * @author jaxt3
 */
public class califiaciones {
    Random rdm = new Random();
    int calUserName = rdm.nextInt(5) + 1;
    int calPost = rdm.nextInt(5) + 1;
    int calComentario = rdm.nextInt(5) + 1;
    
    public int status(){
        return (calUserName + calPost + calComentario)/3;
    }
    
}
