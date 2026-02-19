/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.psp.proyectud3.message;

import com.mycompany.psp.proyectud3.model.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jsbje
 */
public interface Message extends Remote{
    String sendMessage (String form, String message) throws RemoteException;
    void registerClient(Client client) throws RemoteException;
    boolean clientExist(String name) throws RemoteException;
    Client getClient(String name) throws RemoteException;
    boolean AddClient(String name) throws RemoteException;
    void updateMessageTable(JTable table,Client client)throws RemoteException;
    void updateUserTable(JTable table) throws RemoteException;
} 
