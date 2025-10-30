/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_sistemagestionenvios_leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leyma
 */
public class Paquetes {

    private int id;
    private String descripcion;
    private int peso;

    public Paquetes(int id, String descripcion, int peso) {
        this.id = id;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void mostrarPaquete() {

        JOptionPane.showMessageDialog(null, "ID: " + getId() + "\n"
                + "Descripcion: " + getDescripcion() + "\n"
                + "Peso: " + getPeso());

    }
}
