/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3;

import com.mycompany.psp.proyectud3.controller.FrontController;
import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.view.MainFrame;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jsbje
 */
public class ClientRunnable {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            Message server = (Message) registry.lookup("Chat");
            
            MainFrame view = new MainFrame();
            FrontController fc = new FrontController(view, server);
            view.setVisible(true);
            
        } catch (RemoteException ex) {
            System.getLogger(ClientRunnable.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (NotBoundException ex) {
            System.getLogger(ClientRunnable.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
   
}
