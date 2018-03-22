/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_topicos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Abdiel Canul
 */
public class Examen_Topicos extends JFrame{
    private JButton btnPesos;
    private JButton btnDolar;
    private JButton btnEuro;
    private JTextField edtUsr;
    private JTextField edtClave;
    private JTextField euro;
    
    //creacion de constructor
    public Examen_Topicos(){
    
       super("Examen de topicos");
        
Container ContenedorPrincipal = this.getContentPane();

        ContenedorPrincipal.setBackground(Color.YELLOW );
       ContenedorPrincipal.setLayout(null);
        
       JLabel titulo = new JLabel("CONVERTOR DE MONEDAS");
       titulo.setBounds(0,0,300,30);
       ContenedorPrincipal.add(titulo);
       
         JLabel lblUsr = new JLabel("Pesos: ");
        lblUsr.setBounds(10,20,100,30);
        ContenedorPrincipal.add(lblUsr);
        edtUsr = new JTextField();
        edtUsr.setBounds(120, 20, 150, 30);
        ContenedorPrincipal.add(edtUsr);
        
        JLabel lbldolar = new JLabel("Dolares: ");
        lbldolar.setBounds(10,60,100,30);
        ContenedorPrincipal.add(lbldolar);
        edtClave = new JPasswordField();
        edtClave.setBounds(120, 60, 150, 30);
        ContenedorPrincipal.add(edtClave);
        
        JLabel lbleuro = new JLabel("Euros");
        lbleuro.setBounds(10, 90, 100, 30);
        ContenedorPrincipal.add(lbleuro);
        euro = new JTextField();
        euro.setBounds(120,90,150,30);
        ContenedorPrincipal.add(euro);
        
        btnPesos = new JButton("Conversion Pesos");
        btnPesos.setBounds(150, 150, 170, 30);
        ContenedorPrincipal.add(btnPesos);

        btnDolar = new JButton("Conversion Dolar");
        btnDolar.setBounds(350, 150, 170, 30);
        ContenedorPrincipal.add(btnDolar);
        
        btnEuro = new JButton("Conversion Euro");
        btnEuro.setBounds(600,150,170,30);
        ContenedorPrincipal.add(btnEuro);
        
        
         //CreaciÃ³n de objetos oyentes
        AccionBoton oyenteBtnPesos = new AccionBoton();
        AccionBoton oyenteBtnDolar = new AccionBoton();
        AccionBoton oyenteBtnEuro = new AccionBoton();

        //Vincular los oyentes a los objetos que generan el evento
        btnPesos.addActionListener(oyenteBtnPesos);
        btnDolar.addActionListener(oyenteBtnDolar);
        btnEuro.addActionListener(oyenteBtnEuro);
        
        
    }
    
    
    public static void main(String[] args) {
         Examen_Topicos f = new Examen_Topicos();
        f.setSize(800,800);
        f.setLocation(200,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
    }
    
       class AccionBoton implements ActionListener {

        //MÃ©todo controlador del evento ActionEvent
        @Override
        public void actionPerformed(ActionEvent e) {
             
        }
    } //Class AccionBoton
}


