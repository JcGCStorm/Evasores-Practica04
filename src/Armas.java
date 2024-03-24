/*
 * Interfaz que representa a las <i>Armas</i> que tienen las naves, dependiendo el tipo de
 * armas la nave hace más o menos ataque. Esta interfaz cuenta con los métodos
 * necesarios para crear un arma especifica y obtener el tipo de arma creado.
 */
public interface Armas {
    /**
     * Método crearArmas, el cuál crea un <i>arma</i> que agrega un daño de <b>ataque</b>
     * especifico a la nave del cliente.
     */
    public void crearArmas();

    /**
     * Método getTipo, que obtiene el tipo de las <i>armas</i> de nuestra nave.
     */
    public void getTipo();
}
