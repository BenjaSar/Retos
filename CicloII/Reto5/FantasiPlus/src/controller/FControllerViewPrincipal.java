
package controller;

import access.Fdao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import model.Fmodel;
import view.ControlPanel;
import view.viewPrincipal;

/**
 *
 * @author FS- Nelson Salamanca 2021
 */
public class FControllerViewPrincipal implements ActionListener {
    private viewPrincipal screenP;
    
    public FControllerViewPrincipal(viewPrincipal screenP){
        this.screenP = screenP;
        this.screenP.jMConsultas.addActionListener(this);
        this.screenP.joptCargarPelicula.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == screenP.joptCargarPelicula){
            ocultar();
            ControlPanel view = new ControlPanel();
            view.setVisible(true);
            String pelicula ="", titulo = "", resumen= "";
            int año = 0; int director=0;
        
            Fmodel mod = new Fmodel(pelicula, titulo, resumen, año, director);
            //ControlPanel view = new ControlPanel();
            Fdao modC = new Fdao();
            FController controlador = new FController(mod, view, modC);
            controlador.iniciar();
        }
    }
    
    public void mostrar(){
        screenP.setVisible(true);
    }
    
    public void ocultar(){
        screenP.setVisible(false);
    }
}
