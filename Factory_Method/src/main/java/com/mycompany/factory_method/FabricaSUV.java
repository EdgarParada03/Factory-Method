/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory_method;

/**
 *
 * @author edgar
 */
public class FabricaSUV extends FabricaAuto{

    @Override
    public Auto crearAuto() {
        return new Suv();
    }
    
}
