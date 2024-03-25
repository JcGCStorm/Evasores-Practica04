import java.util.List;
import java.util.ArrayList;

public class Nave {
    Propulsion propulsion;
    Blindaje blindaje;
    Cabina cabina;
    Armas arma;

    List<Nave> navesPrefabricadas = new ArrayList<>();

    public Nave(Propulsion propulsion, Blindaje blindaje, Cabina cabina,
            Armas arma) {
        this.propulsion = propulsion;
        this.blindaje = blindaje;
        this.cabina = cabina;
        this.arma = arma;
    }

    public void agregarNave(Nave nave) {
        navesPrefabricadas.add(nave);
    }

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

    public void muestraEstadisticas() {
        System.out.println("Las estadisticas de su nave son:");
        System.out.println("  Velocidad: " + sumaVelocidad());
        System.out.println("  Ataque: " + sumaAtaque());
        System.out.println("  Defensa: " + sumaDefensa());
        System.out.println("  Peso: " + sumaPeso());
        System.out.println("Precio: " + sumaPrecio());
    }

    public int sumaVelocidad() {
        int velocidad = arma.getVelocidad() + blindaje.getVelocidad();
        return velocidad;
    }

    public int sumaAtaque() {
        int ataque = arma.getAtaque() + blindaje.getAtaque() + cabina.getAtaque() + propulsion.getAtaque();
        return ataque;
    }

    private int sumaDefensa() {
        int defensa = arma.getDefensa() + blindaje.getDefensa() + cabina.getDefensa() + propulsion.getDefensa();
        return defensa;
    }

    private int sumaPeso() {
        int peso = arma.getPeso() + blindaje.getPeso() + cabina.getPeso() + propulsion.getPeso();
        return peso;
    }

    private int sumaPrecio() {
        int precio = arma.getPrecio() + blindaje.getPrecio() + propulsion.getPrecio() + cabina.getPrecio();
        return precio;
    }

    DisenoNaves nave = new DisenoNaves();

    // Fabricas para cada parte del auto.
    AbstractFactory fabricaPropulsion = nave.getFactory("PROPULSION");
    AbstractFactory fabricaBlindaje = nave.getFactory("BLINDAJE");
    AbstractFactory fabricaCabina = nave.getFactory("CABINA");
    AbstractFactory fabricaArmas = nave.getFactory("ARMAS");

    public void naveIndividualdeCombate() {
        // Nave 1
        Propulsion nuevaPropulsion = (Propulsion) fabricaPropulsion.getComponente("intercontinental");
        Blindaje nuevoBlindaje = (Blindaje) fabricaBlindaje.getComponente("simple");
        Cabina nuevaCabina = (Cabina) fabricaCabina.getComponente("individual");
        Armas nuevaArma = (Armas) fabricaArmas.getComponente("destructor");
        Nave naveIndividualdeCombate = new Nave(nuevaPropulsion, nuevoBlindaje, nuevaCabina, nuevaArma);
        naveIndividualdeCombate.muestraNave();
    }

    public void naveMilitarDeTransporte() {
        // Nave 2
        Propulsion nuevaPropulsion2 = (Propulsion) fabricaPropulsion.getComponente("intergalactico");
        Blindaje nuevoBlindaje2 = (Blindaje) fabricaBlindaje.getComponente("reforzado");
        Cabina nuevaCabina2 = (Cabina) fabricaCabina.getComponente("tripulacion");
        Armas nuevaArma2 = (Armas) fabricaArmas.getComponente("misiles");
        Nave naveMilitarDeTransporte = new Nave(nuevaPropulsion2, nuevoBlindaje2, nuevaCabina2, nuevaArma2);
        naveMilitarDeTransporte.muestraNave();
    }

    public void naveDeGuerra() {
        // Nave 3
        Propulsion nuevaPropulsion3 = (Propulsion) fabricaPropulsion.getComponente("intergalactico");
        Blindaje nuevoBlindaje3 = (Blindaje) fabricaBlindaje.getComponente("fortaleza");
        Cabina nuevaCabina3 = (Cabina) fabricaCabina.getComponente("ejercito");
        Armas nuevaArma3 = (Armas) fabricaArmas.getComponente("destructor");
        Nave naveDeGuerra = new Nave(nuevaPropulsion3, nuevoBlindaje3, nuevaCabina3, nuevaArma3);
        naveDeGuerra.muestraNave();
    }

    public void naveFabricada() {
        Nave nave = new Nave(propulsion, blindaje, cabina, arma);
        System.out.println("--- Nave Individual de Combate ---");
        nave.naveIndividualdeCombate();
        System.out.println("--- Nave Militar de Transporte ---");
        nave.naveMilitarDeTransporte();
        System.out.println("--- Nave de Guerra ---");
        nave.naveDeGuerra();

    }
}
