/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patrones;

/**
 *
 * @author valencutre
 */
interface IPrototipo extends Cloneable {
    IPrototipo clonar();
}

class ConfiguracionLentes implements IPrototipo {
    public String brillo;
    public String modoAhorro;

    public ConfiguracionLentes(String b, String m) {
        this.brillo = b;
        this.modoAhorro = m;
    }

    public IPrototipo clonar() {
        return new ConfiguracionLentes(this.brillo, this.modoAhorro);
    }

    public void mostrar() {
        System.out.println("Configuración -> Brillo: " + brillo + ", Ahorro: " + modoAhorro);
    }
}

public class Creacional {
    public static void main(String[] args) {
        ConfiguracionLentes original = new ConfiguracionLentes("80%", "Activo");
        ConfiguracionLentes copia = (ConfiguracionLentes) original.clonar();
        
        copia.brillo = "100%"; // Personalizamos la copia sin afectar al original
        
        original.mostrar();
        copia.mostrar();
    }
}