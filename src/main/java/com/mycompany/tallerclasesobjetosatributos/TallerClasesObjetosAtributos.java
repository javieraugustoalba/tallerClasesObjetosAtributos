/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerclasesobjetosatributos;
import javax.swing.*;
/**
 *
 * @author athicadigital
 * NOMBRE:  Javier Augusto Alba Tamayo cod 2220921
 *          Winston Edwin Sandoval cod 2220053
 *          Victor Montoya cod 2220071
 */
public class TallerClasesObjetosAtributos {
     public static void main(String[] args) {
        // Usamos SwingUtilities.invokeLater para asegurar que la interfaz gráfica se ejecute en el hilo de despacho de eventos de AWT
        SwingUtilities.invokeLater(() -> {
            // Solicitamos al usuario que ingrese su DNI mediante un cuadro de diálogo
            String dni = JOptionPane.showInputDialog(null, "Ingrese su DNI:", "Gestión de Banco", JOptionPane.QUESTION_MESSAGE);
            
            // Definimos la longitud válida para un DNI
            int longitudDNI = 8; // Reemplazar con la longitud válida para el DNI

            // Validamos el DNI ingresado utilizando el método validarDNI de la clase Validacion
            if (Validacion.validarDNI(dni, longitudDNI)) {
                // Si el DNI es válido, solicitamos el nombre y el apellido del usuario
                String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Gestión de Banco", JOptionPane.QUESTION_MESSAGE);
                String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:", "Gestión de Banco", JOptionPane.QUESTION_MESSAGE);
                
                // Creamos un nuevo objeto Cliente con el nombre, apellido y DNI proporcionados
                Cliente cliente = new Cliente(nombre, apellido, dni);
                
                // Obtenemos la CuentaDeAhorros asociada con el cliente
                CuentaDeAhorros cuenta = cliente.getCuentaDeAhorros();

                // Mostramos el saldo inicial de la cuenta
                JOptionPane.showMessageDialog(null, "Saldo inicial: " + cuenta.getSaldo());
                
                // Solicitamos al usuario que ingrese el monto que desea depositar
                String depositoStr = JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:", "Gestión de Banco", JOptionPane.QUESTION_MESSAGE);
                
                // Convertimos la cadena ingresada a un double y realizamos el depósito
                double deposito = Double.parseDouble(depositoStr);
                cuenta.depositar(deposito);
                
                // Mostramos el saldo después del depósito
                JOptionPane.showMessageDialog(null, "Saldo después del depósito: " + cuenta.getSaldo());
                
                // Solicitamos al usuario que ingrese el monto que desea retirar
                String retiroStr = JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:", "Gestión de Banco", JOptionPane.QUESTION_MESSAGE);
                
                // Convertimos la cadena ingresada a un double y realizamos el retiro
                double retiro = Double.parseDouble(retiroStr);
                cuenta.retirar(retiro);
                
                // Mostramos el saldo después del retiro
                JOptionPane.showMessageDialog(null, "Saldo después del retiro: " + cuenta.getSaldo());
            } else {
                // Si el DNI no es válido, mostramos un mensaje de error
                JOptionPane.showMessageDialog(null, "DNI inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
