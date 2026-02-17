/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.psp.proyectud3.message;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jsbje
 */
public interface Message extends Remote{
    void recieveMessage(String form, String message) throws RemoteException;
}
