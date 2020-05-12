/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoguimenuswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author molgu
 */
public class ManejadorMenuArchivo implements ActionListener {
    
    JTextArea areaTexto;

    public ManejadorMenuArchivo(JTextArea texto) {
        this.areaTexto = texto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.areaTexto.setText(this.areaTexto.getText() + "\nHola Mundo");
    }
    
}
