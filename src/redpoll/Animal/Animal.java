
package redpoll.Animal;
import java.util.Date;
/**
 *
 * @author PC-Familiar
 */
public class Animal {
    protected int id;
    protected String raza;
    protected String fechaNacimiento;
    protected int idGrupo;
    protected int idPropietario;
    protected int idProduccion;

    public Animal(int id, String raza, String fechaNacimiento, int idGrupo, int idPropietario, int idProduccion) {
        this.id = id;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.idGrupo = idGrupo;
        this.idPropietario = idPropietario;
        this.idProduccion = idProduccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + ", idGrupo=" + idGrupo + ", idPropietario=" + idPropietario + ", idProduccion=" + idProduccion + '}';
    }
}
