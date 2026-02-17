/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 *
 * @author jsbje
 */
public class Client {

    private String name;
    private HashMap<Client, List<String>> messages;

    public Client(String name) {
        this.name = name;
        this.messages = new HashMap<Client, List<String>>();
    }

    public void addMessage(Client client, String message) {
        messages.computeIfAbsent(client, k -> new ArrayList<>()).add(message);
    }

    public List<String> getMessagesFrom(Client client) {
        return messages.get(client); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Client, List<String>> getMessages() {
        return messages;
    }

    public void setMessages(HashMap<Client, List<String>> messages) {
        this.messages = messages;
    }

}
