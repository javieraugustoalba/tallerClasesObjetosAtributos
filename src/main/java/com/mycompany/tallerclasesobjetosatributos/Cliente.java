/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclasesobjetosatributos;

/**
 *
 * @author athicadigital
 */
public class Cliente {
    
    // Atributos privados para almacenar el nombre, apellido, DNI y la cuenta de ahorros del cliente
    private String nombre;
    private String apellido;
    private String dni;
    private CuentaDeAhorros cuentaDeAhorros;

    // Constructor de la clase Cliente
    // Este constructor toma tres parámetros: nombre, apellido y DNI, y crea una nueva CuentaDeAhorros para el cliente
    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre; // Asignamos el nombre recibido al atributo nombre de la clase
        this.apellido = apellido; // Asignamos el apellido recibido al atributo apellido de la clase
        this.dni = dni; // Asignamos el DNI recibido al atributo dni de la clase
        this.cuentaDeAhorros = new CuentaDeAhorros(); // Creamos una nueva instancia de CuentaDeAhorros y la asignamos al atributo cuentaDeAhorros de la clase
    }

    // Método para obtener la cuenta de ahorros asociada con el cliente
    public CuentaDeAhorros getCuentaDeAhorros() {
        return cuentaDeAhorros; // Retornamos la cuenta de ahorros del cliente
    }
}




