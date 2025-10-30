/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_sistemagestionenvios_leimanwu;

import javax.swing.JOptionPane;

/**
 *
 * @author leyma
 */
public class Examen1_SistemaGestionEnvios_LeimanWu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionEnvios ge = new GestionEnvios();
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Sistema de gestion de envios\n\n"
                    + "Menu\n\n"
                    + "1. Insertar un nuevo paquete.\n"
                    + "2. Enviar el paquete mas reciente\n"
                    + "3. Mostrar todos los paquetes mas recientes\n"
                    + "4. Buscar un paquete por ID\n"
                    + "5. Calcular el costo total de envio\n"
                    + "6. Salir del sistema"));

            switch (op) {
                case 1:
                    ge.registrarPaquete();
                    break;
                case 2:
                    ge.enviarPaquete();
                    break;
                case 3:
                    ge.mostrarTodosPaquetes();
                    break;
                case 4:
                    ge.buscarPaquete();
                    break;
                case 5:
                    ge.calcularCosto();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Cerrando sesion... ");
                    return;
                default:
                    if (op != 0) {
                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                    }
            }
        }

    }
}
