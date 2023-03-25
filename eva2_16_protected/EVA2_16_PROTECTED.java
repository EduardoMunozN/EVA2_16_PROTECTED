/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_16_protected;

/**
 *
 * @author eduar
 */
public class EVA2_16_PROTECTED {

    public static void main(String[] args) {
        SuperClase objSuper = new SuperClase();
        objSuper.datos = 100; 
    }
}
class SuperClase{
    //funciona como default ( a nivel de paquete es visible),
    //permite a las subclases acceso.
    protected int datos;
    
}



class SubClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El valor de dato es: "+ datos);
    }
}
