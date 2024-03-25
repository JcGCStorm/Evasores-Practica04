/*
 * Interfaz que representa a las <i>Armas</i> que tienen las naves, dependiendo el tipo de
 * armas la nave hace más o menos ataque. Esta interfaz cuenta con los métodos
 * necesarios para crear un arma especifica y obtener el tipo de arma creado.
 */
public interface Armas {
  
    public abstract void getEstadisticas();
    public abstract int getPrecio();
    public abstract int getAtaque();
    public abstract int getDefensa();
    public abstract int getVelocidad();
    public abstract int getPeso();
    
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
