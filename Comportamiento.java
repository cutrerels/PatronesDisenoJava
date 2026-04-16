/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.patrones;

abstract class ProcesadorPagos {
    public final void procesarTransaccion() {
        validarDatos();
        realizarCobro();
        enviarRecibo();
    }

    private void validarDatos() { System.out.println("Validando identidad y fondos"); }
    private void enviarRecibo() { System.out.println("Recibo enviado al email del cliente."); }

    abstract void realizarCobro();
}

class PagoTarjeta extends ProcesadorPagos {
    void realizarCobro() { System.out.println("Cobrando a través de pasarela bancaria con Tarjeta."); }
}

class PagoCripto extends ProcesadorPagos {
    void realizarCobro() { System.out.println("Validando hash de transacción en la Blockchain."); }
}

public class Comportamiento {
    public static void main(String[] args) {
        ProcesadorPagos pago1 = new PagoTarjeta();
        pago1.procesarTransaccion();
        
        System.out.println("-----------------");
        
        ProcesadorPagos pago2 = new PagoCripto();
        pago2.procesarTransaccion();
    }
}