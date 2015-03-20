/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import COD_main.User;
import database_conn.DB;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Petru Botnar;
 */
public class MainFrame extends javax.swing.JFrame{
    DB database = new DB();
    User user;
    LogoPanel logo = new LogoPanel();
    LoginPanel login = new LoginPanel(this);
    RegistrationFormPanel regform = new RegistrationFormPanel(this);
    JButton registerButton = new JButton();
    MenuPanel menu = new MenuPanel();

    public MainFrame() {
        super("COD - ElevenExpress");
        add(logo,BorderLayout.NORTH);
        add(login,BorderLayout.WEST);
        add(menu,BorderLayout.SOUTH);
        registerButton.setText("Register");
     //   registerButton.setSize(10, 10);
        add(registerButton,BorderLayout.CENTER);
        registerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                add(regform,BorderLayout.EAST);
                clearDash();
            }
            
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        user = login.user;
        pack();
        setVisible(true);
      //  initComponents();
        
    }
    public void clearDash(){
        remove(login);
        remove(menu);
        remove(registerButton);
        repaint();
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}