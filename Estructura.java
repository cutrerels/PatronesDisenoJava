/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.patrones;

class CPU { public void encender() { System.out.println("CPU: Iniciando procesos"); } }
class Memoria { public void cargarSO() { System.out.println("Memoria: Cargando Sistema Operativo"); } }
class DiscoDuro { public void leerDatos() { System.out.println("Disco: Leyendo sectores de arranque"); } }

class ComputadoraFacade {
    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro disco;

    public ComputadoraFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.disco = new DiscoDuro();
    }

    public void iniciarComputadora() {
        System.out.println("Iniciando Estación de Trabajo");
        cpu.encender();
        disco.leerDatos();
        memoria.cargarSO();
        System.out.println("- Sistema Listo para trabajar -");
    }
}

public class Estructura {
    public static void main(String[] args) {
        ComputadoraFacade miPC = new ComputadoraFacade();
        miPC.iniciarComputadora(); 
    }
}