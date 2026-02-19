/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.controller;

import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.model.Client;
import com.mycompany.psp.proyectud3.view.UserDialog;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jsbje
 */
public class UserController {
    private UserDialog view;
    private Client client;
    private Message server;

    public UserController(UserDialog view, Client client, Message server)  {
        this.view = view;
        this.client = client;
        this.server = server;
        this.initComponents();
    }
    
    private void initComponents() {
        try {
            server.updateUserTable(view.getUsersTable());
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(view, "Error: ha habido un error en el servidor","Error Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
