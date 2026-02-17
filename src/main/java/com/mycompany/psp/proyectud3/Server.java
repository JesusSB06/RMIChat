/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3;

import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.message.MessageImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jsbje
 */
public class Server {

    public static void main(String[] args) {
        int port = 1099;              // Puerto típico de RMI
        String bindName = "Hello";    // Nombre lógico del servicio en el registry

        try {
            // 1) Levanta un RMI Registry embebido en el propio proceso (más cómodo en clase)
            Registry registry = LocateRegistry.createRegistry(port);

            // 2) Crea la instancia del objeto remoto
            Message service = new MessageImpl();

            // 3) Publica (asocia) el objeto remoto con un nombre en el Registry
            registry.rebind(bindName, service);

            System.out.println("RMI Server listo.");
            System.out.println("Registry en puerto: " + port);
            System.out.println("Servicio publicado como: " + bindName);

        } catch (Exception e) {
            System.err.println("Error arrancando el servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
