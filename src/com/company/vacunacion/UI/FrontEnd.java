package com.company.vacunacion.UI;

import com.company.vacunacion.repositories.FileRepository;
import com.company.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

     public FrontEnd(String titulo) {
        super(titulo);
        this.build();
    }

    public void build() {
        this.contruccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void contruccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }
    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }
    private void crearComponentes(){

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblcedula = new JLabel("Cedula:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblRiesgo = new JLabel("Riesgo:");
        JLabel lblAmigo = new JLabel("Es Amigo?:");
        JLabel lblrelacion = new JLabel("Relacion:");
        JLabel lblfacebook = new JLabel("Facebook:");
        JLabel lblparentesco = new JLabel("Paretesco:");
        JLabel lblmarca = new JLabel("Marca:");


        JTextField txtNombre = new JTextField();
        JTextField txtcedula = new JTextField();
        JTextField txtEdad = new JTextField();
        JCheckBox txtRiesgo = new JCheckBox();
        JCheckBox txtAmigo = new JCheckBox();
        JTextField txtrelacion = new JTextField();
        JTextField txtfacebook = new JTextField();
        JTextField txtparentesco = new JTextField();
        JTextField txtmarca = new JTextField();

        txtAmigo.addActionListener (new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblparentesco.setVisible(!txtAmigo.isSelected());
                txtparentesco.setVisible(!txtAmigo.isSelected());
                lblrelacion.setVisible(txtAmigo.isSelected());
                txtrelacion.setVisible(txtAmigo.isSelected());
                lblfacebook.setVisible(txtAmigo.isSelected());
                txtfacebook.setVisible(txtAmigo.isSelected());

            }
        });

        JButton Guardar = new JButton( "Guardar");
        Guardar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                service.save(txtNombre.getText(),
                        txtcedula.getText(),
                        txtEdad.getText(),
                        txtRiesgo.isSelected(),
                        txtAmigo.isSelected(),
                        txtrelacion.getText(),
                        txtfacebook.getText(),
                        txtparentesco.getText(),
                        txtmarca.getText());

                txtNombre.setText("");
                txtcedula.setText("");
                txtEdad.setText("");
                txtRiesgo.setText("");
                txtAmigo.setText("");
                txtrelacion.setText("");
                txtfacebook.setText("");
                txtparentesco.setText("");
                txtmarca.setText("");

                    String reporte = String.join("\n", service.get());
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), reporte);
                } catch (ErrorEnEdadException error) {
                    JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), error.getMessage());
                }
            }
        });

        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblcedula);
        this.agregarComponente(txtcedula);
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblRiesgo);
        this.agregarComponente(txtRiesgo);
        this.agregarComponente(lblAmigo);
        this.agregarComponente(txtAmigo);
        this.agregarComponente(lblrelacion);
        this.agregarComponente(txtrelacion);
        this.agregarComponente(lblfacebook);
        this.agregarComponente(txtfacebook);
        this.agregarComponente(lblparentesco);
        this.agregarComponente(txtparentesco);
        this.agregarComponente(lblmarca);
        this.agregarComponente(txtmarca);
        this.agregarComponente(Guardar);
    }
}
