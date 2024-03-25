import java.util.List;
import java.util.ArrayList;

/**
 * Clase que representa una <i>Nave</i> espacial con diferentes componentes como
 * propulsión, blindaje, cabina y armas.
 * 
 * <p>
 * Esta clase permite crear naves con componentes específicos, calcular y
 * mostrar
 * estadísticas de la nave, y fabricar diferentes tipos de naves mediante un
 * diseño
 * de fábrica.
 */
public class Nave {

    Propulsion propulsion;
    Blindaje blindaje;
    Cabina cabina;
    Armas arma;

    List<Nave> navesPrefabricadas = new ArrayList<>();

    /**
     * Constructor de la clase <i>Nave</i>.
     * 
     * @param propulsion El tipo de propulsión de la nave.
     * @param blindaje   El tipo de blindaje de la nave.
     * @param cabina     El tipo de cabina de la nave.
     * @param arma       El tipo de armas de la nave.
     */
    public Nave(Propulsion propulsion, Blindaje blindaje, Cabina cabina,
            Armas arma) {
        this.propulsion = propulsion;
        this.blindaje = blindaje;
        this.cabina = cabina;
        this.arma = arma;
    }

    /**
     * Agrega una <i>Nave</i> prefabricada a la lista de naves.
     * 
     * @param nave La nave a agregar.
     */
    public void agregarNave(Nave nave) {
        navesPrefabricadas.add(nave);
    }

    /**
     * Muestra los detalles de la <i>Nave</i> actual, incluyendo los tipos de
     * propulsión, blindaje, cabina y armas, así como las estadísticas generales.
     */
    public void muestraNave() {
        System.out.println("  Propulsión: ");
        propulsion.getTipo();
        System.out.println(" Blindaje: ");
        blindaje.getTipo();
        System.out.println(" Cabina: ");
        cabina.getTipo();
        System.out.println(" Arma: ");
        arma.getTipo();
        muestraEstadisticas();
    }

    /**
     * Muestra las estadísticas generales de la <i>Nave</i>, incluyendo velocidad,
     * ataque, defensa, peso y precio.
     */
    public void muestraEstadisticas() {
        System.out.println("Las estadisticas de su nave son:");
        System.out.println("  Velocidad: " + sumaVelocidad());
        System.out.println("  Ataque: " + sumaAtaque());
        System.out.println("  Defensa: " + sumaDefensa());
        System.out.println("  Peso: " + sumaPeso());
        System.out.println("Precio: " + sumaPrecio());
    }

    /**
     * Calcula la suma de la velocidad de los componentes de la <i>Nave</i>.
     * 
     * @return La velocidad total de la <i>Nave</i>.
     */
    public int sumaVelocidad() {
        int velocidad = arma.getVelocidad() + blindaje.getVelocidad();
        return velocidad;
    }

    /**
     * Calcula la suma del ataque de los componentes de la <i>Nave</i>.
     * 
     * @return El ataque total de la <i>Nave</i>.
     */
    public int sumaAtaque() {
        int ataque = arma.getAtaque() + blindaje.getAtaque() + cabina.getAtaque() + propulsion.getAtaque();
        return ataque;
    }

    /**
     * Calcula la suma de la defensa de los componentes de la <i>Nave</i>.
     * 
     * @return La defensa total de la <i>Nave</i>.
     */
    public int sumaDefensa() {
        int defensa = arma.getDefensa() + blindaje.getDefensa() + cabina.getDefensa() + propulsion.getDefensa();
        return defensa;
    }

    /**
     * Calcula la suma del peso de los componentes de la <i>Nave</i>.
     * 
     * @return El peso total de la <i>Nave</i>.
     */
    public int sumaPeso() {
        int peso = arma.getPeso() + blindaje.getPeso() + cabina.getPeso() + propulsion.getPeso();
        return peso;
    }

    /**
     * Calcula la suma del precio de los componentes de la <i>Nave</i>.
     * 
     * @return El precio total de la <i>Nave</i>.
     */
    public int sumaPrecio() {
        int precio = arma.getPrecio() + blindaje.getPrecio() + propulsion.getPrecio() + cabina.getPrecio();
        return precio;
    }

    DisenoNaves nave = new DisenoNaves();

    // Fabricas para cada parte del auto.
    AbstractFactory fabricaPropulsion = nave.getFactory("PROPULSION");
    AbstractFactory fabricaBlindaje = nave.getFactory("BLINDAJE");
    AbstractFactory fabricaCabina = nave.getFactory("CABINA");
    AbstractFactory fabricaArmas = nave.getFactory("ARMAS");

    /**
     * Crea y muestra una <i>Nave</i> individual de combate con componentes
     * específicos.
     */
    public void naveIndividualdeCombate() {
        // Nave 1
        Propulsion nuevaPropulsionIntercontinental = (Propulsion) fabricaPropulsion.getComponente("1");
        Blindaje nuevoBlindajeSimple = (Blindaje) fabricaBlindaje.getComponente("1");
        Cabina nuevaCabinaIndividual = (Cabina) fabricaCabina.getComponente("2");
        Armas nuevaArmaDestructor = (Armas) fabricaArmas.getComponente("2");
        Nave naveIndividualdeCombate = new Nave(nuevaPropulsionIntercontinental, nuevoBlindajeSimple,
                nuevaCabinaIndividual,
                nuevaArmaDestructor);
        naveIndividualdeCombate.muestraNave();
    }

    public int naveIndividualPrecio() {
        Propulsion nuevaPropulsionIntercontinental = (Propulsion) fabricaPropulsion.getComponente("1");
        Blindaje nuevoBlindajeSimple = (Blindaje) fabricaBlindaje.getComponente("1");
        Cabina nuevaCabinaIndividual = (Cabina) fabricaCabina.getComponente("2");
        Armas nuevaArmaDestructor = (Armas) fabricaArmas.getComponente("2");
        Nave naveIndividualdeCombate = new Nave(nuevaPropulsionIntercontinental, nuevoBlindajeSimple,
                nuevaCabinaIndividual,
                nuevaArmaDestructor);
        return naveIndividualdeCombate.sumaPrecio();
    }

    /**
     * Crea y muestra una <i>Nave</i> individual de combate con componentes
     * específicos.
     */
    public void naveMilitarDeTransporte() {
        // Nave 2
        Propulsion nuevaPropulsionIntergalactica = (Propulsion) fabricaPropulsion.getComponente("2");
        Blindaje nuevoBlindajeReforzado = (Blindaje) fabricaBlindaje.getComponente("2");
        Cabina nuevaCabinaTripulacion = (Cabina) fabricaCabina.getComponente("3");
        Armas nuevaArmaMisiles = (Armas) fabricaArmas.getComponente("1");
        Nave naveMilitarDeTransporte = new Nave(nuevaPropulsionIntergalactica, nuevoBlindajeReforzado,
                nuevaCabinaTripulacion,
                nuevaArmaMisiles);
        naveMilitarDeTransporte.muestraNave();
    }

    public int naveMilitarPrecio() {
        Propulsion nuevaPropulsionIntergalactica = (Propulsion) fabricaPropulsion.getComponente("2");
        Blindaje nuevoBlindajeReforzado = (Blindaje) fabricaBlindaje.getComponente("2");
        Cabina nuevaCabinaTripulacion = (Cabina) fabricaCabina.getComponente("3");
        Armas nuevaArmaMisiles = (Armas) fabricaArmas.getComponente("1");
        Nave naveMilitarDeTransporte = new Nave(nuevaPropulsionIntergalactica, nuevoBlindajeReforzado,
                nuevaCabinaTripulacion,
                nuevaArmaMisiles);
        return naveMilitarDeTransporte.sumaPrecio();
    }

    /**
     * Crea y muestra una <i>Nave</i> individual de combate con componentes
     * específicos.
     */
    public void naveDeGuerra() {
        // Nave 3
        Propulsion nuevaPropulsionIntergalactica = (Propulsion) fabricaPropulsion.getComponente("2");
        Blindaje nuevoBlindajeFortaleza = (Blindaje) fabricaBlindaje.getComponente("3");
        Cabina nuevaCabinaEjercito = (Cabina) fabricaCabina.getComponente("1");
        Armas nuevaArmaDestructor = (Armas) fabricaArmas.getComponente("2");
        Nave naveDeGuerra = new Nave(nuevaPropulsionIntergalactica, nuevoBlindajeFortaleza, nuevaCabinaEjercito,
                nuevaArmaDestructor);
        naveDeGuerra.muestraNave();
    }

    public int naveGuerraPrecio() {
        Propulsion nuevaPropulsionIntergalactica = (Propulsion) fabricaPropulsion.getComponente("2");
        Blindaje nuevoBlindajeFortaleza = (Blindaje) fabricaBlindaje.getComponente("3");
        Cabina nuevaCabinaEjercito = (Cabina) fabricaCabina.getComponente("1");
        Armas nuevaArmaDestructor = (Armas) fabricaArmas.getComponente("2");
        Nave naveDeGuerra = new Nave(nuevaPropulsionIntergalactica, nuevoBlindajeFortaleza, nuevaCabinaEjercito,
                nuevaArmaDestructor);
        return naveDeGuerra.sumaPrecio();
    }

    /**
     * Crea una <i>Nave</i> utilizando las propiedades de <code>propulsion</code>,
     * <code>blindaje</code>,
     * <code>cabina</code> y <code>arma</code> de la clase actual y muestra
     * información detallada
     * sobre tres tipos diferentes de naves: "Nave Individual de Combate", "Nave
     * Militar de Transporte"
     * y "Nave de Guerra".
     */
    public void naveFabricada() {
        Nave nave = new Nave(propulsion, blindaje, cabina, arma);
        System.out.println("--- 1. Nave Individual de Combate ---");
        nave.naveIndividualdeCombate();
        System.out.println("--- 2. Nave Militar de Transporte ---");
        nave.naveMilitarDeTransporte();
        System.out.println("--- 3. Nave de Guerra ---");
        nave.naveDeGuerra();

    }
}
