/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.controller;

import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.model.Client;
import com.mycompany.psp.proyectud3.view.MainFrame;
import com.mycompany.psp.proyectud3.view.UserDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author jsbje
 */
public class FrontController {
     private MainFrame view;
     private Message server;

    public FrontController(MainFrame view, Message server) {
        this.view = view;
        this.server = server;
        this.view.setLogInButtonActionListener(this.getLogInButtonActionListener());
        this.view.setRegisterButtonActionListener(this.getRegisterActionListener());
    }
     
    
    private ActionListener getLogInButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (server.clientExist(view.getUserTextField().trim())) {
                        UserDialog ud = new UserDialog(view, true);
                        UserController uc = new UserController(ud, server.getClient(view.getUserTextField().trim()), server);
                        ud.setVisible(true);
                    }else{
                        
                    }

                } catch (RemoteException ex) {
                    JOptionPane.showMessageDialog(view, "Error: ha ocurrido un error en el servidor", "Error en el servidor", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        return al;
    }

    private ActionListener getRegisterActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (server.AddClient(view.getUserTextField().trim())) {
                        UserDialog ud = new UserDialog(view, true);
                        UserController uc = new UserController(ud, server.getClient(view.getUserTextField().trim()), server);
                        ud.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(view, "Error: el usuario ya existe", "Error en el servidor", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (RemoteException ex) {
                    JOptionPane.showMessageDialog(view, "Error: ha ocurrido un error en el servidor", "Error en el servidor", JOptionPane.ERROR_MESSAGE);
                }

            }
        };
        return al;
    }
}
