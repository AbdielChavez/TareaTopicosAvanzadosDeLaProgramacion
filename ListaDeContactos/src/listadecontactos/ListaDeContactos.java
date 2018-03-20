/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecontactos;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Abdiel Canul
 */
public class ListaDeContactos extends JFrame {
    
    

    public ListaDeContactos(){
    
        super("Lista de contactos V.01");
        
        Container ContenedorListaDeContactos = this.getContentPane();
        //uso anonimo de del new gridbaglayout
        ContenedorListaDeContactos.setLayout(new GridBagLayout());//creando objeto del constructor
        ContenedorListaDeContactos.setBackground(Color.BLUE);//agregar el color al panel principal
        
        
        GridBagConstraints restricciones = new GridBagConstraints();
        
        
        //crear componentes de barra
        JTextArea barra = new JTextArea(5, 30);
        JScrollPane areaTexto = new JScrollPane(barra);
        areaTexto.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        //modificar restricciones
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 2;
        restricciones.weighty = 1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.CENTER;        
        //agregar restriciones y componente al panel principal
        ContenedorListaDeContactos.add(areaTexto,restricciones);
    //CREACION DE ETIQUETA DATOS PERSONALES DE CONTACTO
    JLabel number1 = new JLabel("DATOS PERSONALES DEL CONTACTO");
         restricciones.gridx = 0;
        restricciones.gridy = 2;
         restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        ContenedorListaDeContactos.add(number1,restricciones);
//creacion de etiqueta de "nombre"
        JLabel EtiquetaNombre = new JLabel("Nombre");
        
        
 
        //modificar restriciones
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        ContenedorListaDeContactos.add(EtiquetaNombre,restricciones);
        
        //creacion de comp0nente textarea para nombre
        JTextArea nombre1 = new JTextArea(2,7);
        //modificar restricciones
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        ContenedorListaDeContactos.add(nombre1,restricciones);
        
        //creacion de componente apellido JLabel
        JLabel apellido = new JLabel("Apellido");
        //restricciones
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        //add al panel princiapl
        ContenedorListaDeContactos.add(apellido,restricciones);
        
        //creacion textField
        JTextArea apellido1 = new JTextArea(2,7);
        //modificar restricciones
        restricciones.gridx = 1;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(apellido1,restricciones);
        
        //creacion de componente direccion
        JLabel direccion = new JLabel("Direccion");
        //restricciones
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        //add 
        ContenedorListaDeContactos.add(direccion,restricciones);
        
        //creacion de componente textfield de direccion
        JTextArea direccion1 = new JTextArea(2,7);
        //modificar restricciones
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(direccion1,restricciones);
        
        //componente correo electronico
        
        JLabel Correo = new JLabel("Correo Electronico");
        //restricciones
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=1;
        restricciones.weightx=0;
        restricciones.fill = GridBagConstraints.NONE;
        restricciones.anchor = GridBagConstraints.CENTER;
        //add 
        ContenedorListaDeContactos.add(Correo,restricciones);
        
        //creacion de componente textfield de direccion
        JTextArea correo1 = new JTextArea(2,7);
        //modificar restricciones
        restricciones.gridx = 1;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(correo1,restricciones);
        
        //agregar componente boton "agregar contacto"
        
        JButton AgregarContacto = new JButton("Agregar Contacto");
        //restricciones
         restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(AgregarContacto,restricciones);
        //creacion de boton Modificar Contacto
        JButton ModificarContacto = new JButton("Modificar Contacto");
        //restricciones
         restricciones.gridx = 1;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(ModificarContacto,restricciones);
        
        //creacion de boton limpiar
         JButton Limpiar = new JButton("Limpiar");
        //restricciones
         restricciones.gridx = 2;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(Limpiar,restricciones);
        
        
        //creacion del botonGroup
        
        //creacion de boton ver todos los contactos
        JButton verContactos = new JButton("Ver Todos Los Contactos");
        
        //creacion de boton buscar por palabra clave
        JButton BuscarPalabra = new JButton("Buscar por Palabra Clave");
        
        //creacion de boton ver 
        JButton ver = new JButton("Ver");
        
        //creacion de eliminar
        JButton eliminar = new JButton("Eliminar");
        
        //creacion del buttonGroup
        
        ButtonGroup btgBotonesPanel = new ButtonGroup();
        
        
        //agregacion de los botones al buttonGroup
        btgBotonesPanel.add(verContactos);
        btgBotonesPanel.add(BuscarPalabra);
        btgBotonesPanel.add(ver);
        btgBotonesPanel.add(eliminar);
        
        
        
        ContenedorListaDeContactos.add(verContactos);
        ContenedorListaDeContactos.add(BuscarPalabra);
        ContenedorListaDeContactos.add(ver);
        ContenedorListaDeContactos.add(eliminar);
     

            //crear componente
        JLabel Telefonos1 = new JLabel("Telefonos");
        //modificar restricciones
        restricciones.gridx = 2;
        restricciones.gridy = 1;
            restricciones.insets.set(33,20,10,20);


        //agregar conponente al contenedor y asignar rectricciones a componente
       ContenedorListaDeContactos.add(Telefonos1, restricciones);
        
          //crear componente
        JButton Agregar1 = new JButton("Agregar");
        //modificar restricciones
        restricciones.gridx = 4;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.ipadx = 5;
        restricciones.ipady = 5;
        //restricciones.fill = GridBagConstraints.NONE;
        //restricciones.anchor = GridBagConstraints.SOUTH;
      
        //agregar conponente al contenedor y asignar rectricciones a componente
        ContenedorListaDeContactos.add(Agregar1, restricciones);
        
            //crear componente
        JButton Eliminar1 = new JButton("Eliminar");
        //modificar restricciones
        restricciones.gridx = 4;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.ipadx = 0;
        restricciones.ipady = 0;
        //restricciones.fill = GridBagConstraints.NONE;
        //restricciones.anchor = GridBagConstraints.SOUTH;
      
        //agregar conponente al contenedor y asignar rectricciones a componente
        ContenedorListaDeContactos.add(Eliminar1, restricciones);
        
           
          //crear componente
        JButton Agregar2 = new JButton("Agregar");
        //modificar restricciones
        restricciones.gridx = 4;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.ipadx = 5;
        restricciones.ipady = 5;
        //restricciones.fill = GridBagConstraints.NONE;
        //restricciones.anchor = GridBagConstraints.SOUTH;
      
        //agregar conponente al contenedor y asignar rectricciones a componente
       ContenedorListaDeContactos.add(Agregar2, restricciones);
        
             //crear componente
        JButton Eliminar2 = new JButton("Eliminar");
        //modificar restricciones
        restricciones.gridx = 4;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty = 0;
        restricciones.weightx=0;
        restricciones.ipadx = 0;
        restricciones.ipady = 0;
        //restricciones.fill = GridBagConstraints.NONE;
        //restricciones.anchor = GridBagConstraints.SOUTH;
      
        //agregar conponente al contenedor y asignar rectricciones a componente
        ContenedorListaDeContactos.add(Eliminar2, restricciones);
        
         JTextArea barraprimaria = new JTextArea(5, 10);
        JScrollPane areaTextprimaria = new JScrollPane(barraprimaria);
        areaTextprimaria.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(areaTextprimaria);
        //modificar restricciones
        restricciones.gridx = 2;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 2;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.CENTER;
        restricciones.ipadx = 0;


        //agregar conponente al contenedor y asignar rectricciones a componente
        ContenedorListaDeContactos.add(areaTextprimaria, restricciones);
        
        //crear componente
        JTextArea barraTelefonos1 = new JTextArea(5, 10);
        JScrollPane areaTextosecundario = new JScrollPane(barraTelefonos1);
        areaTextosecundario.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(areaTextosecundario);
        //modificar restricciones
        restricciones.gridx = 2;
        restricciones.gridy = 2;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 2;
        restricciones.weighty = 1;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.CENTER;
        restricciones.ipadx = 0;

        //agregar conponente al contenedor y asignar rectricciones a componente
        ContenedorListaDeContactos.add(areaTextosecundario, restricciones);
        
        
        //creacion de tiqueta extensiones
        JLabel extensiones = new JLabel("EXTENSIONES");
        //RESTRICCIONES
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        ContenedorListaDeContactos.add(extensiones,restricciones);
        
        JButton opcion1 = new JButton("Opcion 1");
        //restricciones
        restricciones.gridx = 1;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        ContenedorListaDeContactos.add(opcion1,restricciones);
        
        JButton opcion2 = new JButton("Opcion 2");
        //restricciones
        restricciones.gridx = 2;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weighty=0;
        restricciones.weightx=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.anchor = GridBagConstraints.NORTHEAST;
        ContenedorListaDeContactos.add(opcion2,restricciones);
        
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeContactos ventana = new ListaDeContactos();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.pack();
        ventana.setVisible(true);
    }
    
}
