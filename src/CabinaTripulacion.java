/**
 * Clase que representa a una <i>cabina</i> de tipo <b>Tripulacion</b>,
 * implementa a la
 * interfaz {@link Cabina}, nos ayuda a crear una nave con una <i>cabina</i>
 * para una
 * <b>tripulacion</b>.
 * 
 * @implements Cabina
 */
public class CabinaTripulacion implements Cabina {
    String tipo = "   3. Cabina para una Tripulacion";
    int precio = 200;
    int ataque = 0;
    int defensa = 150;
    int velocidad = 0;
    int peso = 150;

    /**
     * Método crearCabina, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina}.
     * Nos ayuda a crear una <i>cabina</i> con un <b>peso</b> especifico para la
     * nave
     * del cliente. Además de decirnos que la cabina de la nave es para una
     * tripulacion.
     */
    @Override
    public void crearCabina() {
        tipo = "   - Cabina para una Tripulacion";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina} y que
     * obtiene la <i>cabina</i> de tipo <b>tripulacion</b> de nuestra nave.
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
        System.out.println("3. Cabina para una Tripulación:" + "\n  Precio: " + precio +
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
