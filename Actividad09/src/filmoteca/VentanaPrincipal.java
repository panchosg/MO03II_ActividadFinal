package filmoteca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal{
    JFrame _ventanaPrincipal;    

    public VentanaPrincipal() {
        super();
    }

    public void GenerarVentana(){
        JFrame ventanaPrincipal = new JFrame("Menú Principal");
        
        //Contenderes
        Container contenedorBase = new Container();
        Container contenedorCentral = new Container();
        Container contenedorInferior = new Container();
        Container contenedorIzquierdo = new Container();
        Container contenedorDerecho = new Container();
        Container contenedorSuperior = new Container();
                
        //Layouts
        BorderLayout layoutBase = new BorderLayout(5,15); 
        GridLayout gridCentral = new GridLayout(3,2,20,5);
        FlowLayout gridInferior = new FlowLayout();
        
        //Asignanción de estructura a contenedores
        contenedorBase.setLayout(layoutBase);
        contenedorCentral.setLayout(gridCentral);
        contenedorInferior.setLayout(gridInferior);
        
        //Adición de componetes en los contenedores
        contenedorIzquierdo.setSize(10, 50);        
        contenedorDerecho.setSize(10, 50);
        contenedorSuperior.setSize(10,50);

        //Asignación y generación de botones
        contenedorCentral.add(GenerarBotonInsertarPelicula());
        contenedorCentral.add(GenerarBotonModificarPelicula());
        contenedorCentral.add(GenerarBotonEliminarPelicula());
        contenedorCentral.add(GenerarBotonInsertarDirector());
        contenedorCentral.add(GenerarBotonModificarDirector());
        contenedorCentral.add(GenerarBotonEliminarDirector());
        contenedorInferior.add(GenerarBotonListados());

        //Ubicación de contenedores en el contenedor base
        contenedorBase.add(contenedorCentral,BorderLayout.CENTER);
        contenedorBase.add(contenedorInferior,BorderLayout.SOUTH);
        contenedorBase.add(contenedorIzquierdo,BorderLayout.WEST);
        contenedorBase.add(contenedorDerecho,BorderLayout.EAST);
        contenedorBase.add(contenedorSuperior,BorderLayout.NORTH);

        ventanaPrincipal.setSize(400,300);
        ventanaPrincipal.add(contenedorBase);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventanaPrincipal.setVisible(true); 
        _ventanaPrincipal = ventanaPrincipal;
    }

    /**
     * Genera el Botón de insertar película y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonInsertarPelicula(){
        JButton boton = new JButton("btnInsertarPelicula");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                actionBotonGenerarPelicula();
            }
        }); 
        return boton;
    }

    private void actionBotonGenerarPelicula(){
        _ventanaPrincipal.dispose(); 
                VentanaInsPelicula ventanaInsPelicula = new VentanaInsPelicula(this);
                ventanaInsPelicula.GenerarVentana();
    }
    
    /**
     * Genera el Botón de modificar película y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonModificarPelicula(){
        JButton boton = new JButton("btnModificarPelicula");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                _ventanaPrincipal.dispose(); 

            }
        }); 
        return boton;
    }

    /**
     * Genera el Botón de eliminar película y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonEliminarPelicula(){
        JButton boton = new JButton("btnEliminarPelicula");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                _ventanaPrincipal.dispose(); 

            }
        }); 
        return boton;
    }

    /**
     * Genera el Botón de eliminar película y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonInsertarDirector(){
        JButton boton = new JButton("btnInsertarDirector");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                _ventanaPrincipal.dispose(); 

            }
        }); 
        return boton;
    }

    /**
     * Genera el Botón de modificar director y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonModificarDirector(){
        JButton boton = new JButton("btnModificarDirector");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                _ventanaPrincipal.dispose(); 

            }
        }); 
        return boton;
    }

    /**
     * Genera el Botón de eliminar director y sus acciones
     * @return Jbutton
     */
    private JButton GenerarBotonEliminarDirector(){
        JButton boton = new JButton("btnEliminarDirector");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                _ventanaPrincipal.dispose(); 

            }
        }); 
        return boton;
    }

    private JButton GenerarBotonListados(){
        JButton boton = new JButton("btnListados");    
        boton.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e){
                
            }
        }); 
        return boton;
    }        
}