/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author cristianpreciadosanchez
 */
public class ventanaPrincipal extends JFrame{
    
    private JMenuBar barraMenu;
    private JMenu menuOperaciones;
    private JMenuItem itmBasica;
    
    public void Ventana(){
        /* Inicializo todos los componentes de la ventana */
        this.barraMenu          = new JMenuBar();
        this.menuOperaciones    = new JMenu("Operacion");
        this.itmBasica          = new JMenuItem("Basica");
        this.inicioVentana();
    }
    
    public void inicioVentana(){
        this.setTitle("Numeros aleatorios");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.barraMenu.add(menuOperaciones);
        this.menuOperaciones.add(this.itmBasica);
        this.setJMenuBar(this.barraMenu);
        this.setLocationRelativeTo(null);
        this.programaEventos();
        this.setVisible(true);
    }
    
    public void programaEventos() {
        ActionListener ejemploA = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Basica basica = new Basica();
                basica.setVisible(rootPaneCheckingEnabled);
            }   
        };
        this.itmBasica.addActionListener(ejemploA);
    }
}
