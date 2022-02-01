package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fmodel;
import utils.ConnectionDB;

/**
 *
 * @author FS - Nelson Salamanca
 */
public class Fdao {
    private Connection conn = null;
    
    //CRUD
    public ArrayList<Fmodel> obtenerPeliculas(){
        
        ArrayList<Fmodel> peliculas = new ArrayList<Fmodel>();
        
        try{
            if(conn == null)
               conn = ConnectionDB.getConnection();
        String sql = "SELECT pel_id AS Id, pel_titulo AS Titulo,"
                + "pel_resumen AS Resumen, pel_anio AS Año, "
                + "dir_id AS Director FROM pelicula";

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
            //TODO
            Fmodel pelicula = new Fmodel(rs.getString(1), rs.getString(2), 
                    rs.getString(3), rs.getInt(4), rs.getInt(5)); 
                    peliculas.add(pelicula);
        }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
    
        return peliculas;
    }
    
        public boolean obtenerPelicula(Fmodel peli){
        
        try{
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT pel_id AS Id, pel_titulo AS Titulo, pel_resumen AS Resumen, "
                    + " pel_anio AS Año FROM pelicula WHERE pel_id=?";
               
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, peli.getIdPelicula());

            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                /*Fmodel pelicula = new Fmodel(rs.getString(1), rs.getString(2), 
                    rs.getString(3), rs.getInt(4), rs.getInt(5)); */
                peli.setIdPelicula(rs.getString("Id"));
                peli.setTitulo(rs.getString("Titulo"));
                peli.setResumen(rs.getString("Resumen"));
                peli.setAnio(Integer.parseInt(rs.getString("Año")));
            }
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
           
            return false;
        }
    }
    
    public boolean agregarPelicula(Fmodel pelicula){
        try{
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
        String sql = "INSERT INTO pelicula(pel_id, pel_titulo, pel_resumen, pel_anio,"
                + "dir_id) "
                + "VALUES(?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            //Data injection
            statement.setString(1, pelicula.getIdPelicula());
            statement.setString(2, pelicula.getTitulo());
            statement.setString(3, pelicula.getResumen());
            statement.setInt(4, pelicula.getAnio());
            statement.setInt(5, pelicula.getDirector_fk());
            
            int rowsInserted = statement.executeUpdate();
            
            if(rowsInserted>0)
                 JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
            return false;
        }
    }
    
    public boolean actualizarPelicula(Fmodel pelicula){
        
        try{
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "UPDATE pelicula SET pel_titulo=?, pel_resumen=?, "
                    + "pel_anio=? WHERE pel_id=?";
                    
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getResumen());
            ps.setInt(3, pelicula.getAnio());
            ps.setString(4, pelicula.getIdPelicula());
        
            ps.execute();
            
            return true;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminarPelicula(Fmodel pelicula){
        try{
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "DELETE FROM pelicula WHERE pel_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pelicula.getIdPelicula());
            
            int rDeleted = ps.executeUpdate();
            
            if(rDeleted>0){
                JOptionPane.showMessageDialog(null, "El registro fue eliminado exitosamente !");
            }return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
            return false;
        }
    }
    
}
