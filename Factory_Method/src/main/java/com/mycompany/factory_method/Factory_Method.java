/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factory_method;

/**
 *
 * @author edgar
 */
public class Factory_Method {

    public static void main(String[] args) {
        FabricaAuto fabricaSedan = new FabricaSedan();
        Auto miSedan = fabricaSedan.crearAuto();
        miSedan.encender();
        
        FabricaAuto fabricaSUV = new FabricaSUV();
        Auto miSUV = fabricaSUV.crearAuto();
        miSUV.encender();
        
    }
    
     
}
