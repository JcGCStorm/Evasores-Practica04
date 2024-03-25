/*
 * Interfaz que representa a la <i>Propulsion</i> de las naves, dependiendo su tipo de
 * propulsion la nave tiene más o menos <b>velocidad</b>. Esta interfaz cuenta con los métodos
 * necesarios para crear una propulsion especifica y obtener el tipo de propulsion creado.
 */
public interface Propulsion {

    public abstract void getEstadisticas();
    public abstract int getPrecio();
    public abstract int getAtaque();
    public abstract int getDefensa();
    public abstract int getVelocidad();
    public abstract int getPeso();
    /**
     * Método crearPropulsion, el cuál crea una <i>propulsion</i> que agrega una <b>velocidad</b>
     * especifica a la nave del cliente.
     */
    public void crearPropulsion();

    /**
     * Método getTipo, que obtiene el tipo de la <i>propulsion</i> de nuestra nave.
     */
    public void getTipo();
    
}
