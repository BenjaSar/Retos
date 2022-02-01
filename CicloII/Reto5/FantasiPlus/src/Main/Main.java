package Main;

import access.Fdao;
import controller.FController;
import controller.FControllerViewPrincipal;
import model.Fmodel;
import view.ControlPanel;
import view.viewPrincipal;

/**
 *
 * @author FS -- Nelson Salamanca 2021
 */
public class Main {

    public static void main(String[] args) {
        /*String pelicula ="", titulo = "", resumen= "";
        int año = 0; int director=0;
        
        Fmodel mod = new Fmodel(pelicula, titulo, resumen, año, director);
        ControlPanel view = new ControlPanel();
        Fdao modC = new Fdao();*/
        viewPrincipal screenP = new viewPrincipal();
        
        FControllerViewPrincipal controladorP = new FControllerViewPrincipal(screenP);
        
        /*FController controlador = new FController(mod, view, modC);
        controlador.iniciar();*/
        //view.setVisible(false);
        screenP.setVisible(true);
    }
}
