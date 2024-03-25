/*
 * Interfaz que representa a la <i>Propulsion</i> de las naves, dependiendo su tipo de
 * propulsion la nave tiene más o menos <b>velocidad</b>. Esta interfaz cuenta con los métodos
 * necesarios para crear una propulsion especifica y obtener el tipo de propulsion creado.
 */
public interface Propulsion {

    /**
     * Obtiene las estadísticas del sistema de <i>Propulsion</i>.
     */
    public abstract void getEstadisticas();

    /**
     * Obtiene el precio del sistema de <i>Propulsion</i>..
     * 
     * @return el precio del sistema de <i>Propulsion</i>.
     */
    public abstract int getPrecio();

    /**
     * Obtiene el valor de Ataque del sistema de <i>Propulsion</i>.
     * 
     * @return el valor de Ataque del sistema de <i>Propulsion</i>.
     */
    public abstract int getAtaque();

    /**
     * Obtiene el valor de Defensa del sistema de <i>Propulsion</i>.
     * 
     * @return el valor de Defensa del sistema de <i>Propulsion</i>.
     */
    public abstract int getDefensa();

    /**
     * Obtiene el valor de Velocidad del sistema de <i>Propulsion</i>.
     * 
     * @return el valor de Velocidad del sistema de <i>Propulsion</i>.
     */
    public abstract int getVelocidad();

    /**
     * Obtiene el valor de Peso del sistema de <i>Propulsion</i>.
     * 
     * @return el valor de Peso del sistema de <i>Propulsion</i>.
     */
    public abstract int getPeso();

    /**
     * Método crearPropulsion, el cuál crea una <i>propulsion</i> que agrega una
     * <b>velocidad</b>
     * especifica a la nave del cliente.
     */
    public void crearPropulsion();

    /**
     * Método getTipo, que obtiene el tipo de la <i>propulsion</i> de nuestra nave.
     */
    public void getTipo();

}
