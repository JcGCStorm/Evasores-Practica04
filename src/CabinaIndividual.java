/**
 * Clase que representa a una <i>cabina</i> de tipo <b>Individual</b>, implementa a la
 *  interfaz {@link Cabina}, nos ayuda a crear una nave con una <i>cabina</i> <b>individual</b>.
 *  @implements Cabina
 */
public class CabinaIndividual implements Cabina{
    String tipo = "";

    /**
     * Método crearCabina, que sobreescribe al metodo homonimo de la interfaz {@link Cabina}. 
     * Nos ayuda a crear una <i>cabina</i> con un <b>peso</b> especifico para la nave 
     * del cliente. Además de decirnos que la cabina de la nave solo es para una persona.
     */
    @Override
    public void crearCabina() {
        tipo = "Carroceria deportiva";
    }

    /**
     * Método getTipo, que sobreescribe al metodo homonimo de la interfaz {@link Cabina} y que
     * obtiene la <i>cabina</i> de tipo <b>individual</b> de nuestra nave.
     */
    @Override
    public void getTipo() {
        System.out.println(tipo);
    }
}
