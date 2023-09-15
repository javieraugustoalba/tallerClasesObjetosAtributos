/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclasesobjetosatributos;

/**
 *
 * @author athicadigital
 */
public class Validacion {
    
    // Método estático para validar el DNI del cliente
    // El método toma dos parámetros: una cadena que representa el DNI y un entero que representa la longitud válida del DNI
    public static boolean validarDNI(String dni, int longitud) {
        // Verificamos que el DNI no sea nulo y que coincida con una expresión regular que representa un número de la longitud especificada
        // La expresión regular "\\d{" + longitud + "}" significa que estamos buscando exactamente 'longitud' dígitos
        return dni != null && dni.matches("\\d{" + longitud + "}");
    }
}
