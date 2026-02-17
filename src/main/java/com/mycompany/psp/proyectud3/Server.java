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
        int port = 1099;
        String bindName = "Chat";

        try {

            Registry registry = LocateRegistry.createRegistry(port);
            Message service = new MessageImpl();

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
