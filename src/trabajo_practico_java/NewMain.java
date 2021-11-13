/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_practico_java;
import java.util.Scanner;
/**
 *
 * @author Taiel98
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia de la clase Scanner objeto sn
        Scanner sn = new Scanner(System.in);
        //nombre
        System.out.println("Escriba su Nombre:");
        String nombre = sn.nextLine();
        //apellido
        System.out.println("Escriba su Apellido:");
        String apellido = sn.nextLine();
        //edad
        System.out.println("Escriba su Edad:");
        String edad1 = sn.nextLine();
        int edad = 0;
        try{
            edad = Integer.parseInt(edad1);
        }catch (NumberFormatException e){
            System.out.println("Escriba la edad en numeros");
        }
        //hobbie
        System.out.println("Escriba su pasatiempo:");
        String hobbie = sn.nextLine();
        //editor de codigo
        System.out.println("Escriba su Editor de Codigo preferido:");
        String editor = sn.nextLine();
        //sistema operativo
        System.out.println("Escriba el Sistema Operativo que utiliza:");
        String sistema = sn.nextLine();
        //mensaje de salida
        System.out.println("A "+nombre+" "+apellido+" de "+edad+" años,"+
                " le gusta "+hobbie+", su editor de codigo preferido es "+
                editor+" y usa el sistema operativo "+sistema);
    }
    
}
