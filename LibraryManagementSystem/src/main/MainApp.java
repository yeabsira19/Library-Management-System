/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import gui.LoginForm;

public class MainApp {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });

    }
}
