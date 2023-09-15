/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclasesobjetosatributos;

/**
 *
 * @author athicadigital
 */
import javax.swing.JOptionPane;

public class CuentaDeAhorros {
    // Atributo para almacenar el saldo de la cuenta de ahorros
    private double saldo;

    // Método para depositar un monto en la cuenta de ahorros
    // El monto a depositar se suma al saldo actual
    public void depositar(double monto) {
        saldo += monto;
    }

    // Método para retirar un monto de la cuenta de ahorros
    // Se verifica si el monto a retirar es menor o igual al saldo actual
    // Si es así, se permite el retiro y se resta el monto del saldo
    // Si no, se muestra un mensaje de error y se retorna false indicando que el retiro fue fallido
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true; // Retiro exitoso
        } else {
            // Mostramos un mensaje de error usando un cuadro de diálogo de Swing
            JOptionPane.showMessageDialog(null, "Fondos insuficientes. Saldo actual: " + saldo, "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Retiro fallido
        }
    }

    // Método para obtener el saldo actual de la cuenta de ahorros
    public double getSaldo() {
        return saldo;
    }
}
