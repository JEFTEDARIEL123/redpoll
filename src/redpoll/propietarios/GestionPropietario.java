package redpoll.propietarios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Villalobos
 */
public class GestionPropietario {
    private static GestionPropietario instanciaGestionPropietario;
    private Map<String, Propietario> propietarios;
    
    
    
    public GestionPropietario() {
        this.propietarios = new HashMap<>();
        Propietario prop1 = new Propietario(1, "Juan", 208830311, 85418900, "Por el barrio la juana", "juan@email.com");
        Propietario prop2 = new Propietario(2, "Paco", 205230365, 85003111, "200mts este del palo de mango, barrio tomas", "paco@email.com");
        Propietario prop3 = new Propietario(3, "Maria", 207540433, 55769649, "100mts sur de la plaza queko", "maria@email.com");
        this.propietarios.put(String.valueOf(prop1.getID()), prop1);
        this.propietarios.put(String.valueOf(prop2.getID()), prop2);
        this.propietarios.put(String.valueOf(prop3.getID()), prop3);
    }
    
    public static GestionPropietario getInstance(){
        if(instanciaGestionPropietario == null){
            instanciaGestionPropietario = new GestionPropietario();
        }
        return instanciaGestionPropietario;
    }

    public Map<String, Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Map<String, Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    
     public void agregarPropietario(Propietario propietario) {
        int id = obtenerUltimoId() + 1;
        propietario.setID(id);
        this.propietarios.put(propietario.getNombre(), propietario);
    }

    public Propietario obtenerPropietario(String propietario) {
        
        return this.propietarios.get(propietario);
    }
    public boolean validarExistencia(String propietario){
        return this.propietarios.containsKey(propietario);
    }
    public void actualizarPropietario(Propietario propietario) {
        this.propietarios.put(propietario.getNombre(), propietario);
    }

    public void eliminarPropietario(String propietario) {
        this.propietarios.remove(propietario);
    }

    public int obtenerUltimoId() {
        if (this.propietarios.isEmpty()) {
            return 0; 
        }
        return this.propietarios.values().stream()
                .mapToInt(Propietario::getID)
                .max()
                .orElse(0); 
    }
    
}

