/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_sistemagestionenvios_leimanwu;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author leyma
 */
public class GestionEnvios {

    Stack<Paquetes> pila = new Stack<>();

    public void registrarPaquete() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paquete"));
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del paquete"));
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del paquete");

            if (peso < 0) {
                JOptionPane.showMessageDialog(null, "El peso no puede ser negativo. Registrelo nuevamente");
                return;
            }
            Paquetes nuevo = new Paquetes(id, descripcion, peso);
            pila.push(nuevo);

            JOptionPane.showMessageDialog(null, "Paquete registrado correctamente");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido para ID y peso");
        }

    }

    public void enviarPaquete() {
        if (!pila.isEmpty()) {
            Paquetes enviado = pila.pop();
            JOptionPane.showMessageDialog(null, "Paquete enviado");
        } else {
            JOptionPane.showMessageDialog(null, "No hay paquetes para enviar");
        }
    }

    public void buscarPaquete() {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del paquete"));
        boolean encontrado = false;

        for (Paquetes p : pila) {
            if (p.getId() == cod) {
                p.mostrarPaquete();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Paquete no encontrado");
        }
    }

    public void calcularCosto() {
        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay paquetes dentro del sistema");
            return;
        }

        try {
            int cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paquete para calcular su costo"));
            boolean encontrado = false;

            for (Paquetes p : pila) {
                if (p.getId() == cod) {
                    double costo = p.getPeso() * 5;
                    JOptionPane.showMessageDialog(null,
                            "Paquete ID: " + p.getId()
                            + "\nPeso: " + p.getPeso() + " kg"
                            + "\nCosto de envío: $" + costo);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Paquete no encontrado");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido para el ID");
        }
    }

    public void mostrarTodosPaquetes() {
        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay paquetes en la sistema");
            return;
        }

        StringBuilder info = new StringBuilder();
        for (Paquetes p : pila) {
            info.append("ID:").append(p.getId() + "\n")
                    .append("Descripción: ").append(p.getDescripcion() + "\n")
                    .append("Peso: ").append(p.getPeso()).append(" kg\n\n");
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }
}
