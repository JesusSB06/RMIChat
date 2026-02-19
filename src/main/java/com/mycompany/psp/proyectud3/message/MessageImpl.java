/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.message;

import com.mycompany.psp.proyectud3.model.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    public String sendMessage(String from, String message) throws RemoteException {
        Client sender = clients.get(from);
        if (sender == null) {
            return "Error: usuario no registrado";
        }

        for (Map.Entry<String, Client> entry : clients.entrySet()) {
            Client recipient = entry.getValue();
            if (!recipient.getName().equals(from)) {
                recipient.addMessage(sender.getName(), message);
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

    @Override
    public boolean AddClient(String name) throws RemoteException {
        if (!clientExist(name)) {
            clients.put(name, new Client(name));
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void updateMessageTable(JTable table, Client client) throws RemoteException {

        for (Map.Entry<String, List<String>> map : client.getMessages().entrySet()) {
            if (map.getKey().equals(client.getName())) {
                if (!map.getValue().isEmpty()) {
                    for (String st : map.getValue()) {
                        Vector row = new Vector();
                        row.add(st);
                        row.add("");
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(row);
                    }
                }

            }
        }
    }

    @Override
    public void updateUserTable(JTable table) throws RemoteException {
        System.out.println("aaaaa");
        if (!clients.isEmpty()) {
            System.out.println("aaaaa");
            for (Map.Entry<String, Client> map : clients.entrySet()) {
                
                Vector row = new Vector();
                row.add(map.getKey());
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(row);
            }
        }

    }



}
