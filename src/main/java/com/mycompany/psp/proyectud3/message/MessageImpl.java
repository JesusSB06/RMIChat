/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jsbje
 */
public class MessageImpl extends UnicastRemoteObject implements Message{
    
    public MessageImpl() throws RemoteException{}
    
    @Override
    public void recieveMessage(String form, String message) throws RemoteException{
        
    }
    
}
