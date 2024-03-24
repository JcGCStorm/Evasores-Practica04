/*
 * Interfaz que representa al <i>Blindaje</i> de las naves, dependiendo el tipo de
 * blindaje la nave tiene más o menos protección. Esta interfaz cuenta con los métodos
 * necesarios para crear un blindaje especifico y obtener el tipo de blindaje creado.
 */
public interface Blindaje {
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
