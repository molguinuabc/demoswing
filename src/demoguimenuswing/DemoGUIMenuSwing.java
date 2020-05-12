/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoguimenuswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author molgu
 */
public class DemoGUIMenuSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Super Juego Fake");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JTextArea areaDeTexto = new JTextArea("Soy el area de texto");
        ventana.add(areaDeTexto);
        
        JMenuBar barraMenu = new JMenuBar();
        ventana.setJMenuBar(barraMenu);
        
        JMenu menuArchivo = new JMenu("Archivo");
        barraMenu.add(menuArchivo);
        
        JMenuItem menuItemAbrir = new JMenuItem("Abrir");
        menuArchivo.add(menuItemAbrir);
        
        JMenuItem menuItemSalir = new JMenuItem("Salir");
        menuArchivo.add(menuItemSalir);
        
        //ManejadorMenuArchivo me = new ManejadorMenuArchivo(areaDeTexto);
        
        menuItemAbrir.addActionListener((ActionEvent e)-> {
            areaDeTexto.setText(areaDeTexto.getText() + "\nHola Mundo");
        });
        
        menuItemSalir.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        ventana.setVisible(true);
        
    }
    
}
