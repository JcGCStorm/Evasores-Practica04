/*
 * Interfaz que representa al <i>Blindaje</i> de las naves, dependiendo el tipo de
 * blindaje la nave tiene más o menos protección. Esta interfaz cuenta con los métodos
 * necesarios para crear un blindaje especifico y obtener el tipo de blindaje creado.
 */
public interface Blindaje {

    /**
     * Obtiene las estadísticas del <i>Blindaje</i>.
     */
    public abstract void getEstadisticas();

    /**
     * Obtiene el precio del <i>Blindaje</i>.
     * 
     * @return el precio del <i>Blindaje</i>.
     */
    public abstract int getPrecio();

    /**
     * Obtiene el valor de Ataque del <i>Blindaje/i>.
     * 
     * @return el valor de Ataque del <i>Blindaje</i>.
     */
    public abstract int getAtaque();

    /**
     * Obtiene el valor de Defensa del <i>Blindaje</i>.
     * 
     * @return el valor de Defensa del <i>Blindaje</i>.
     */
    public abstract int getDefensa();

    /**
     * Obtiene el valor de Velocidad del <i>Blindaje</i>.
     * 
     * @return el valor de Velocidad del <i>Blindaje</i>.
     */
    public abstract int getVelocidad();

    /**
     * Obtiene el valor de Peso del <i>Blindaje</i>.
     * 
     * @return el valor de Peso del <i>Blindaje</i>.
     */
    public abstract int getPeso();

    /**
     * Método crearBlindaje, el cuál crea un <i>blindaje</i> que brinda una
     * <b>defensa</b> especifica a la nave del cliente.
     */
    public void crearBlindaje();

    /**
     * Método getTipo, que obtiene el <b>tipo</b> de <i>blindaje</i> de nuestra nave
     */
    public void getTipo();

}
