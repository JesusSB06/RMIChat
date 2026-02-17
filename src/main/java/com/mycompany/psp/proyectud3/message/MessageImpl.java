/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.message;

import com.mycompany.psp.proyectud3.model.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jsbje
 */
public class MessageImpl extends UnicastRemoteObject implements Message {

    private HashMap<String, Client> clients;

    public MessageImpl() throws RemoteException {
        clients = new HashMap<>();
    }

    public void registerClient(Client client) throws RemoteException {
        clients.put(client.getName(), client);
        System.out.println("Cliente registrado: " + client.getName());
    }

    @Override
    public void recieveMessage(String from, String message) throws RemoteException {
        System.out.println(from + " ha enviado: " + message);
    }

    @Override
    public String sendMessage(String from, String message) throws RemoteException {
        Client sender = clients.get(from);
        if (sender == null) {
            return "Error: usuario no registrado";
        }

        for (Map.Entry<String, Client> entry : clients.entrySet()) {
            Client recipient = entry.getValue();
            if (!recipient.getName().equals(from)) {
                recipient.addMessage(sender, message);
            }
        }

        System.out.println("Mensaje de " + from + " enviado a todos los clientes conectados.");
        return "Mensaje enviado correctamente";
    }

    public HashMap<String, Client> getClients() {
        return clients;
    }
    


    @Override
    public Client getClient(String name) throws RemoteException {
        return clients.get(name);
    }

    @Override
    public boolean clientExist(String name) throws RemoteException {
        if (clients.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

}
