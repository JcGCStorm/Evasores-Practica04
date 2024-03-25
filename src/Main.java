import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Fabrica productora.
        DisenoNaves nave = new DisenoNaves();

        System.out.println("Bienvenido al Tianguis intergalactico de Naves Espaciales\n" +
                "Aquí contamos con la mas selecta variedad de piezas para tu nave espacial\n" +
                "Antes de presentarte nuestro catalogo de piezas, por favor introduce tu presupuesto:");

        Scanner sc = new Scanner(System.in);
        if (!(sc.hasNextInt())) {
            System.out.println("\nPor favor, ingresa un valor valido.");
            sc.nextLine();
        }

        double presupuesto = sc.nextInt();
        System.out.println("Gracias por introducir tu presupuesto, aquí en el Imperio Galactico " +
                "contamos con las siguientes piezas:");
        System.out.println("Cabina: \n  1. Cabina para un Ejercito: $400 \n  2. Cabina Individual: $100 \n" +
                "  3. Cabina para una Tripulacion: $200");
        System.out.println("Blindaje: \n  1. Blindaje simple: $100 \n  2. Blindaje reforzado: $180 \n" +
                "  3. Blindaje de fortaleza: $200");
        System.out.println("Arma: \n  1. Misiles de Plasma: $1,500 \n  2. Laser Destructor: $2,000 \n" +
                "  3. Laser Simple: $800");
        System.out.println(
                "Propulsion: \n  1. Propulsion intercontinental: $5,000 \n  2. Propulsion Intergalactica: $7,000 \n"
                        + "  3. Propulsion Planetaria: $2,000");
        System.out.println("Por favor escoja los componentes con los que desea construir su nave" +
                "a continuación se muestran las especificaciones de las cabinas.");

        System.out.println("CABINA:");
        new CabinaEjercito().getEstadisticas();
        new CabinaIndividual().getEstadisticas();
        new CabinaTripulacion().getEstadisticas();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        Nave nna = new Nave(null, null, null, null);

        DisenoNaves naves = new DisenoNaves();
        // Fabricas para cada parte del auto.
        AbstractFactory fabricaPropulsion = nave.getFactory("PROPULSION");
        AbstractFactory fabricaBlindaje = nave.getFactory("BLINDAJE");
        AbstractFactory fabricaCabina = nave.getFactory("CABINA");
        AbstractFactory fabricaArmas = nave.getFactory("ARMAS");

        Cabina cabinaNueva = (Cabina) fabricaPropulsion.getComponente(opcion);
        cabinaNueva.crearCabina();

        if (sc.hasNextInt()) {
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    new CabinaIndividual();
                case 2:
                    new CabinaTripulacion();
                case 3:
                    new CabinaEjercito();
                default:
                    break;
            }
        }
        System.out.println("\nIngrese una entrada valida");
        sc.nextLine();
    }
}
