/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.model;

import java.util.HashMap;

/**
 *
 * @author jsbje
 */
public class Model {
    HashMap<String,Client> clients;
    
    public Model(){
        this.clients = new HashMap<String,Client>();
    }
    
    public void addClient(Client client){
        clients.put(client.getName(), client);
    }
    
    public Client getClient(String name){
        return clients.get(name);
    }
}
