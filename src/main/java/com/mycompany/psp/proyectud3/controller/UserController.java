/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.controller;

import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.model.Client;
import com.mycompany.psp.proyectud3.view.UserDialog;

/**
 *
 * @author jsbje
 */
public class UserController {
    private UserDialog view;
    private Client client;
    private Message server;

    public UserController(UserDialog view, Client client, Message server) {
        this.view = view;
        this.client = client;
        this.server = server;
    }
    
    
}
