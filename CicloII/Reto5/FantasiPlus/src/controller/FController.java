package controller;

import access.Fdao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Fmodel;
import view.ControlPanel;

/**
 *
 * @authors FS -- 2021
 */
public class FController implements ActionListener{
    private Fmodel mod;
    private ControlPanel view;
    private Fdao modC;
    DefaultTableModel modelTable = new DefaultTableModel();

    
    public FController(Fmodel mod, ControlPanel view, Fdao modC){
    
        this.mod = mod;
        this.modC = modC;
        this.view = view;
        this.view.jbtnBuscar.addActionListener(this);
        this.view.jbtnEliminar.addActionListener(this);
        this.view.jbtnGuardar.addActionListener(this);
        this.view.jbtnListar.addActionListener(this);
        this.view.jbtnModificar.addActionListener(this);
        this.view.jbtnLimpiar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == view.jbtnGuardar){
            mod.setIdPelicula(view.jTFId.getText());
            mod.setTitulo(view.jTFTitulo.getText());
            mod.setAnio(Integer.parseInt(view.jTAnio.getText()));
            mod.setResumen(view.jTFResumen.getText());
            if(modC.agregarPelicula(mod)){
                limpiar();
            }
        }
        
        if(e.getSource() == view.jbtnBuscar){
            mod.setIdPelicula(view.jTFId.getText());
            
            if(modC.obtenerPelicula(mod)){
                //view.jTFId.setText(String.valueOf(mod.getIdPelicula()));
                view.jTFTitulo.setText(String.valueOf(mod.getTitulo()));
                view.jTFResumen.setText(String.valueOf(mod.getResumen()));
                view.jTAnio.setText(String.valueOf(mod.getAnio()));
            }else{
                limpiar();   
            }             
        }
        
        if(e.getSource() == view.jbtnEliminar){
            mod.setIdPelicula(view.jTFId.getText());
            if(modC.eliminarPelicula(mod)){
                limpiar();
            }
        }
        
        if(e.getSource() == view.jbtnModificar){
            
            mod.setIdPelicula(view.jTFId.getText());
            mod.setTitulo(view.jTFTitulo.getText());
            mod.setAnio(Integer.parseInt(view.jTAnio.getText()));
            mod.setResumen(view.jTFResumen.getText());

            if(modC.actualizarPelicula(mod)){
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
                limpiar();
            }
        }
        
        if(e.getSource() == view.jbtnListar){
            listar(view.jTable);
        }
        
        if(e.getSource() == view.jbtnLimpiar){
            limpiar();
        }
    }
    
    public void mostrar(){
        view.setVisible(true);
    }
    
    public void ocultar(){
        view.setVisible(false);
    }
    
    public void limpiar(){
        view.jTFId.setText(null);
        view.jTFTitulo.setText(null);
        view.jTFResumen.setText(null);
        view.jTAnio.setText(null);
    }
    
    public void listar(JTable tabla){
        modelTable = (DefaultTableModel)tabla.getModel();
        
         List<Fmodel> lista = modC.obtenerPeliculas();
         //Recorrer y almacenar dentro de la interfaz
         //1- Definir un vector de objetos
         Object[] objecto = new Object[4];
         
         for(int i=0; i<lista.size(); i++){
             objecto[0]= lista.get(i).getIdPelicula();
             objecto[1]= lista.get(i).getTitulo();
             objecto[2]= lista.get(i).getResumen();
             objecto[3]= lista.get(i).getAnio();
             modelTable.addRow(objecto);
         }
         
         view.jTable.setModel(modelTable);
    }
    
    public void iniciar(){
        view.setTitle("Peliculas");
        view.setLocationRelativeTo(null);

    }
    
}
