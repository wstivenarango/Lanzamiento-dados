/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuencias.logica;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    public int Dado() {
   int dado = (int) (Math.random()* 6+1);
       
    return dado; 
}
}
