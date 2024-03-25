/*
 * Interfaz que representa a las <i>Armas</i> que tienen las naves, dependiendo el tipo de
 * armas la nave hace más o menos ataque. Esta interfaz cuenta con los métodos
 * necesarios para crear un arma especifica y obtener el tipo de arma creado.
 */
public interface Armas {

    /**
     * Obtiene las estadísticas de las <i>Armas</i>.
     */
    public abstract void getEstadisticas();

    /**
     * Obtiene el precio de las <i>Armas</i>.
     * 
     * @return el precio de las <i>Armas</i>.
     */
    public abstract int getPrecio();

    /**
     * Obtiene el valor de Ataque de las <i>Armas/i>.
     * 
     * @return el valor de Ataque de las <i>Armas</i>.
     */
    public abstract int getAtaque();

    /**
     * Obtiene el valor de Defensa de las <i>Armas</i>.
     * 
     * @return el valor de Defensa de las <i>Armass</i>.
     */
    public abstract int getDefensa();

    /**
     * Obtiene el valor de Velocidad de las <i>Armas</i>.
     * 
     * @return el valor de Velocidad de las <i>Armas</i>.
     */
    public abstract int getVelocidad();

    /**
     * Obtiene el valor de Peso de las <i>Armas</i>.
     * 
     * @return el valor de Peso de las <i>Armas</i>.
     */
    public abstract int getPeso();

    /**
     * Método crearArmas, el cuál crea un <i>arma</i> que agrega un daño de
     * <b>ataque</b>
     * especifico a la nave del cliente.
     */
    public void crearArmas();

    /**
     * Método getTipo, que obtiene el tipo de las <i>armas</i> de nuestra nave.
     */
    public void getTipo();
}
