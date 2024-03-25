/**
 * Clase que representa al blindaje de tipo Reforzado, implementa
 * a la interfaz {@link Blindaje}, nos ayuda a crear una nave.
 * 
 * @implements Blindaje
 */
public class BlindajeReforzado implements Blindaje {
    String tipo = "   2. Blindaje reforzado";
    int precio = 180;
    int ataque = 0;
    int defensa = 100;
    int velocidad = 0;
    int peso = 70;

    /**
     * Método crearBlindaje, que sobreescribe al metodo homonimo de la interfaz
     * {@link Blindaje},
     * nos ayuda a crear un <i>blindaje</i> con una <b>defensa</b> especifica para
     * la nave
     * del cliente.
     */
    @Override
    public void crearBlindaje() {
        tipo = "   - Blindaje reforzado";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Blindaje} y que
     * obtiene el <i>blindaje</i> de tipo <b>reforzado</b> de nuestra nave.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }

    /**
     * Método getEstadisticas, que obtiene las estadisticas del componente
     */
    @Override
    public void getEstadisticas() {
        System.out.println(tipo + "\n  Precio: " + precio +
                "\n  Ataque: " + ataque + "\n  Defensa:" + defensa + "\n  Velocidad: " + velocidad +
                "\n  Peso: " + peso);
    }

    /**
     * Metodos get para obtener las estadisticas y el precio
     */

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public int getPeso() {
        return peso;
    }

}
