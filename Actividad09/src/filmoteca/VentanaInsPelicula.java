package filmoteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaInsPelicula extends JFrame {

    private JFrame _ventanaInsPelicula;
    private final VentanaPrincipal _ventanaPrincipal;
    

    /**
     * Ventana hija que realiza operaciones de inserción de películas
     * @param ventanaPrincipal ventana padre
     */
    public VentanaInsPelicula(VentanaPrincipal ventanaPrincipal) {
        _ventanaPrincipal = ventanaPrincipal;        
    }

    public void GenerarVentana() {
        JFrame ventanaInsPelicula = new JFrame("Menú Insertar Película");

        // Contenderes
        Container contenedorBase = new Container();
        Container contenedorCentral = new Container();
        Container contenedorInferior = new Container();
        Container contenedorIzquierdo = new Container();
        Container contenedorDerecho = new Container();
        Container contenedorSuperior = new Container();

        // Layouts
        BorderLayout layoutBase = new BorderLayout(5, 15);
        GridLayout gridCentral = new GridLayout(3, 2, 20, 5);
        FlowLayout gridInferior = new FlowLayout();

        // Asignanción de estructura a contenedores
        contenedorBase.setLayout(layoutBase);
        contenedorCentral.setLayout(gridCentral);
        contenedorInferior.setLayout(gridInferior);

        // Adición de componetes en los contenedores
        contenedorIzquierdo.setSize(10, 50);
        contenedorDerecho.setSize(10, 50);
        contenedorSuperior.setSize(10, 50);

        // Asignación y generación de botones
        // contenedorCentral.add(GenerarBotonCrearPelicula());

        contenedorInferior.add(GenerarBotonCrearPelicula());

        // Ubicación de contenedores en el contenedor base
        contenedorBase.add(contenedorCentral, BorderLayout.CENTER);
        contenedorBase.add(contenedorInferior, BorderLayout.SOUTH);
        contenedorBase.add(contenedorIzquierdo, BorderLayout.WEST);
        contenedorBase.add(contenedorDerecho, BorderLayout.EAST);
        contenedorBase.add(contenedorSuperior, BorderLayout.NORTH);

        ventanaInsPelicula.setSize(400, 300);
        ventanaInsPelicula.add(contenedorBase);
        ventanaInsPelicula.setVisible(true);

        _ventanaInsPelicula = ventanaInsPelicula;

        // Configurar evento de cierre de ventana
        _ventanaInsPelicula.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        _ventanaInsPelicula.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ProcedimientoDeCierre();
            }
        });
    }

    //Procedimiento de cierre de la ventana
    public void ProcedimientoDeCierre(){
        _ventanaInsPelicula.setVisible(false);
                _ventanaPrincipal.GenerarVentana();
                _ventanaInsPelicula.dispose(); 
    }

    /**
     * Genera el Botón de insertar película y sus acciones
     * 
     * @return Jbutton
     */
    public JButton GenerarBotonCrearPelicula() {
        JButton boton = new JButton("btnCrearPelicula");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                _ventanaInsPelicula.dispose();

            }
        });
        return boton;
    }

}
