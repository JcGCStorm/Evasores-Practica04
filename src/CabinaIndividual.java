/**
 * Clase que representa a una <i>cabina</i> de tipo <b>Individual</b>,
 * implementa a la
 * interfaz {@link Cabina}, nos ayuda a crear una nave con una <i>cabina</i>
 * <b>individual</b>.
 * 
 * @implements Cabina
 */
public class CabinaIndividual implements Cabina {
    String tipo = "   2. Cabina Individual";
    int precio = 100;
    int ataque = 0;
    int defensa = 30;
    int velocidad = 0;
    int peso = 70;

    /**
     * Método crearCabina, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina}.
     * Nos ayuda a crear una <i>cabina</i> con un <b>peso</b> especifico para la
     * nave
     * del cliente. Además de decirnos que la cabina de la nave solo es para una
     * persona.
     */
    @Override
    public void crearCabina() {
        tipo = "   - Cabina Individual";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Cabina} y que
     * obtiene la <i>cabina</i> de tipo <b>individual</b> de nuestra nave.
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
        System.out.println("2. Cabina Individual:" + "\n  Precio: " + precio +
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
