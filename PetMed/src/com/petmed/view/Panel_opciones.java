/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.petmed.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;

/**
 *
 * @author sjronqui
 */
public class Panel_opciones extends JPanel{
    JButton[] opciones = {new JButton("Crear Nuevo"),new JButton("Modificar"), new JButton("Eliminar")
                         , new JButton("Nuevos Clientes") , new JButton("Lista de Citas") , new JButton("Citas por\nCliente")
                          , new JButton("Lista de\nConsultas") , new JButton("Historial Médico") , new JButton("Consultas por Síntoma")
                         , new JButton("Consultas por Diagnóstico") , new JButton("Historial de Fisiología"), new JButton("Nuevos Clientes") 
                         , new JButton("Consultar Usuario") , new JButton("Consultas por Médico")};
    
    
    
    public Panel_opciones(){
        this.setLocation(0, 0);
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(150,250));
        
        
        opciones[0].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[1].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[2].setAlignmentX(Component.CENTER_ALIGNMENT);
        
        this.add(Box.createRigidArea(new Dimension(0,40)));
        this.add(opciones[0]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[1]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[2]);
                
       /* 
        opciones[3].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[4].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[5].setAlignmentX(Component.CENTER_ALIGNMENT);
        
        this.add(Box.createRigidArea(new Dimension(0,40)));
        this.add(opciones[3]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[4]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[5]);/*
        
        /*opciones[6].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[6].setPreferredSize(new Dimension(150, 300));
        opciones[7].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[8].setAlignmentX(Component.CENTER_ALIGNMENT);
        opciones[9].setAlignmentX(Component.CENTER_ALIGNMENT);
        
        this.add(Box.createRigidArea(new Dimension(0,40)));
        this.add(opciones[6]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[7]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[8]);
        this.add(Box.createRigidArea(new Dimension(0,30)));
        this.add(opciones[9]);*/
        
    }
}
