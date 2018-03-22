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
    private JButton btnPesosaDolar;
    private JButton btnPesosaEuro;
    private JButton btnDolaraPesos;
    private JButton btnDolaraEuro;
    private JButton btnEuroaPesos;
    private JButton btnEuroaDolar;
    private JTextField edtUsr;
    //private ActionBoton btn = new ActionBoton();
    //creacion de constructor
    
    private AccionBoton oyenteBtnGeneral;  //creacion de objeto para el action boton 
    
    public Examen_Topicos(){
    
       super("Examen de topicos");
        
Container ContenedorPrincipal = this.getContentPane();

        ContenedorPrincipal.setBackground(Color.YELLOW );
       ContenedorPrincipal.setLayout(null);
       this.oyenteBtnGeneral = new AccionBoton();
        
       JLabel titulo = new JLabel("CONVERTOR DE MONEDAS");
       titulo.setBounds(0,0,300,30);
       ContenedorPrincipal.add(titulo);
       
//creacion de leer el numero
        JLabel lblUsr = new JLabel("Monto a convertir: ");
        lblUsr.setBounds(10,20,220,30);
        ContenedorPrincipal.add(lblUsr);
        edtUsr = new JTextField();
        edtUsr.setBounds(170, 20, 150, 30);
        ContenedorPrincipal.add(edtUsr);
        
       
//creacion de oyentes
        
        btnPesosaDolar = new JButton("Conversion Pesos a dolar ");
        btnPesosaDolar.setBounds(150, 150, 190, 30);
        this.btnPesosaDolar.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnPesosaDolar);

        btnPesosaEuro = new JButton("Conversion pesos a euro ");
        btnPesosaEuro.setBounds(350, 150, 190, 30);
        this.btnPesosaEuro.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnPesosaEuro);
        
        btnDolaraPesos = new JButton("Conversion dolar a pesos ");
        btnDolaraPesos.setBounds(600,150,190,30);
        this.btnDolaraPesos.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnDolaraPesos);
//correccion de ubicacion 
        btnDolaraEuro = new JButton("Conversion dolar a euro ");
        btnDolaraEuro.setBounds(150, 200, 190, 30);
        this.btnDolaraEuro.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnDolaraEuro);

        btnEuroaPesos = new JButton("Conversion euro a pesos ");
        btnEuroaPesos.setBounds(350, 200, 190, 30);
        this.btnEuroaPesos.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnEuroaPesos);
        
        btnEuroaDolar = new JButton("Conversion euro a dolar ");
        btnEuroaDolar.setBounds(600,200,190,30);
        this.btnEuroaDolar.addActionListener(this.oyenteBtnGeneral);
        ContenedorPrincipal.add(btnEuroaDolar);
        
        
        
        
        
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
             if((JButton)e.getSource() == btnPesosaDolar){
                
               double pesos1 = Integer.parseInt(edtUsr.getText());
                 double valorfinal = pesos1 / 20;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
                 
             }
             if((JButton)e.getSource() == btnPesosaEuro){
                
                 double pesos1 = Integer.parseInt(edtUsr.getText());
                 double valorfinal = pesos1 / 22;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
 
             }
             if((JButton)e.getSource() == btnDolaraPesos){
                 double pesos1 = Integer.parseInt(edtUsr.getText());
                 
                 double valorfinal = pesos1 * 20 ;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
                
             }
             if((JButton)e.getSource() == btnDolaraEuro){
             
                 double pesos1 = Integer.parseInt(edtUsr.getText());
                 double valorfinal = 20 / 22;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
             }
             if((JButton)e.getSource() == btnEuroaPesos){
             
                 double pesos1 = Integer.parseInt(edtUsr.getText());
                 double valorfinal = 22/1;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
             }
             if((JButton)e.getSource() == btnEuroaDolar){
             
                 double pesos1 = Integer.parseInt(edtUsr.getText());
                 double valorfinal = 22/20;
                 JOptionPane.showMessageDialog(null, "El valor de conversion es: " + valorfinal, "conversion", JOptionPane.INFORMATION_MESSAGE);
             
             }
        }
    } //Class AccionBoton
}


