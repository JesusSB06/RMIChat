package com.mycompany.psp.proyectud3;

import com.mycompany.psp.proyectud3.client.ClientImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.mycompany.psp.proyectud3.client.IClient;

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
            IClient service = new ClientImpl();

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
