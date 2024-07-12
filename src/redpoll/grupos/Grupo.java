package redpoll.grupos;



 
public class Grupo {
    private int idGrupo;
 private String tipo,descripcion;
    
     @Override
    public String toString() {
        return "Grupo{" + "idGrupo=" + idGrupo + ", tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }
   


    public Grupo(int idGrupo, String tipo, String descripcion) {
        this.idGrupo = idGrupo;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
