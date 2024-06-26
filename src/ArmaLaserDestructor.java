/**
 * Clase que representa a la <i>propulsion</i> de tipo <i>LazerDestructor</i>,
 * implementa
 * a la interfaz {@link Arma}, nos ayuda a crear una nave.
 * 
 * @implements Arma
 */
public class ArmaLaserDestructor implements Armas {

    String tipo = "   -Laser Destructor";
    int precio = 2000;
    int ataque = 20;
    int defensa = 0;
    int velocidad = 0;
    int peso = 300;

    /**
     * Método crearArmas, que sobreescribe al metodo homonimo de la interfaz
     * {@link Arma},
     * nos ayuda a crear un <i>arma</i> con un <b>ataque</b> especifico para la nave
     * del cliente.
     */
    @Override
    public void crearArmas() {
        tipo = "Laser Destructor";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz
     * {@link Arma} y que
     * obtiene el <i>arma</i> de tipo <b>LaserDestructor</b> de nuestra nave.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }

    @Override
    public void getEstadisticas() {
        System.out.println(tipo + "\n  Precio: " + precio +
                "\n  Ataque: " + ataque + "\n  Defensa:" + defensa + "\n  Velocidad: " + velocidad +
                "\n  Peso: " + peso);

    }

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
