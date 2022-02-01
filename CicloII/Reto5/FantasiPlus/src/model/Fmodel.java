
package model;

/**
 *
 * @author FS - Nelson Salamanca 
 */
public class Fmodel {
    
    private String idPelicula;
    private String titulo;
    private String resumen;
    private int anio;
    private int director_fk;
    
    public Fmodel(String idPelicula, String titulo, String resumen, int anio, 
            int director_fk){
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.resumen = resumen;
        this.anio = anio;
        this.director_fk = director_fk;
    }

    /**
     * @return the idPelicula
     */
    public String getIdPelicula() {
        return idPelicula;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the resumen
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * @param resumen the resumen to set
     */
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the director_fk
     */
    public int getDirector_fk() {
        return director_fk;
    }

    /**
     * @param idPelicula the idPelicula to set
     */
    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
