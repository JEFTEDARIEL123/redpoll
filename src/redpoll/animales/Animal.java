
package redpoll.animales;
import java.util.Date;
/**
 *
 * @author PC-Familiar
 */
public class Animal {
    private int id;
    private String raza;
    private String fechaNacimiento;
    private int idGrupo;
    private int idPropietario;

    public Animal(int id, String raza, String fechaNacimiento, int idGrupo, int idPropietario) {
        this.id = id;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.idGrupo = idGrupo;
        this.idPropietario = idPropietario;
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


    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + ", idGrupo=" + idGrupo + ", idPropietario=" + idPropietario + '}';
    }
}
