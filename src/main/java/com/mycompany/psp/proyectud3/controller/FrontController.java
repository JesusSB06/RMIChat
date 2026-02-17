/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.psp.proyectud3.controller;

import com.mycompany.psp.proyectud3.message.Message;
import com.mycompany.psp.proyectud3.view.MainFrame;

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
    }
     
}
