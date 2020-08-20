/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Menu;

import Clases.Validacion_RUT;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Menu {
    
     public static void main(String[] args) {
       
         Scanner Leer = new Scanner(System.in);
         String rut;
         Validacion_RUT Validacion;
         
         System.out.println("Menu");
         System.out.println("");
         System.out.print("Ingrese el RUT a Validar: ");
         rut = Leer.nextLine();
         Validacion = new Validacion_RUT(rut);
         
         if(Validacion.Validacion_Concreta() == true){
             
             System.out.println("El rut Es Valido");
         
         }else{
         
             System.out.println("El rut es Invalido");
         
         }
         
    }
}
