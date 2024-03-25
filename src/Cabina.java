/*
 * Interfaz que representa a las <i>Cabinas</i> que tienen las naves, dependiendo el tipo de
 * <i>Cabina</i>, la nave es más o menos pesada, es la pieza fundamental de la nave pues esta
 * decide cuántas personas pueden ir dentro de la nave.
 * Esta interfaz cuenta con los métodos necesarios para crear una <i>cabina</i> especifica y 
 * obtener el tipo de <i>cabina</i> creado.
 */
public interface Cabina {

    /**
     * Obtiene las estadísticas de la <i>Cabina</i>.
     */
    public abstract void getEstadisticas();

    /**
     * Obtiene el precio de la <i>Cabina</i>.
     * 
     * @return el precio de la <i>Cabina</i>.
     */
    public abstract int getPrecio();

    /**
     * Obtiene el valor de Ataque de la <i>Cabina</i>.
     * 
     * @return el valor de Ataque de la <i>Cabina</i>.
     */
    public abstract int getAtaque();

    /**
     * Obtiene el valor de Defensa de la <i>Cabina</i>.
     * 
     * @return el valor de Defensa de la <i>Cabina</i>.
     */
    public abstract int getDefensa();

    /**
     * Obtiene el valor de Velocidad de la <i>Cabina</i>.
     * 
     * @return el valor de Velocidad de la <i>Cabina</i>.
     */
    public abstract int getVelocidad();

    /**
     * Obtiene el valor de Peso de la <i>Cabina</i>.
     * 
     * @return el valor de Peso de la <i>Cabina</i>.
     */
    public abstract int getPeso();

    /**
     * Método crearCabina, el cuál crea una <i>cabina</i> que agrega un <b>peso</b>
     * especifico a la nave del cliente. Además de imponer cuantas personas caben en
     * la nave
     */
    public void crearCabina();

    /**
     * Método getTipo, que obtiene el tipo de la <i>cabina</i> de nuestra nave.
     */
    public void getTipo();

}
