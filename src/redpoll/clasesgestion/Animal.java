
package proyectodos;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC-Familiar
 */
public class Animal {
    protected int id;
    protected String raza;
    protected Date fechaNacimiento;
    protected int idGrupo;
    protected Map<Integer,Animal>infoAnimal;
    
    public Animal(int id, String raza, Date fechaNacimiento, int idGrupo) {
        this.id = id;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.idGrupo = idGrupo;
        this.infoAnimal = new HashMap <>();
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
}
