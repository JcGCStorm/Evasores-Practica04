import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se inicializa el programa
        System.out.println("Bienvenido al Tianguis intergalactico de Naves Espaciales\n" +
                "Aquí contamos con la mas selecta variedad de piezas para tu nave espacial\n" +
                "Antes de presentarte nuestro catalogo de piezas, por favor introduce tu presupuesto:");

        Scanner sc = new Scanner(System.in);
        if (!(sc.hasNextInt())) {
            System.out.println("\nPor favor, ingresa un valor valido.");
            sc.nextLine();
        }

        // Se introduce el presupuesto
        double presupuesto = sc.nextInt();
        System.out.println("Gracias por introducir tu presupuesto, aquí en el Imperio Galactico " +
                "contamos con las siguientes piezas, por favor escoja los componentes con los que" +
                "desea construir su nave, a continuación se muestran a detalle las especificaciones de" +
                "las cabinas.");

        // Si el presupuesto es valido, se podra crear la nave, en el caso contrario se
        // muestra el menu
        Nave nna = crearNave();
        if (presupuesto > nna.sumaPrecio()) {
            System.out.println("Tu nave está lista para recoger, estas son sus características, " +
                    "paga en la caja la cantidad de $" + nna.sumaPrecio());
            nna.muestraNave();
            System.out.println("Presiona 0 para salir");
        } else {
            nna.sumaPrecio();
            System.out.println("Chanfles, el costo de tu nave sobrepasa tu presupuesto. ¿Deseas " +
                    "diseñar otra nave o ver nuestro catálogo?");
            System.out.println("1. Ver Catalogo. \n 2. Diseñar otra nave.");
        }

        // Despliega el menu de naves fabricadas
        int opcionCatalogo = sc.nextInt();
        switch (opcionCatalogo) {
            case 1:
                System.out.println("######## Catalogo ########");
                nna.naveFabricada();
                break;
            case 2:
                crearNave();
                break;
            default:
                break;
        }

        if (presupuesto < nna.naveIndividualPrecio() && presupuesto < nna.naveMilitarPrecio() &&
                presupuesto < nna.naveGuerraPrecio()) {
            System.out.println("No te alcanza, regresa cuando hayas cobrado la quincena.");
            System.out.println("Presiona 0 para salir.");
            int salir = sc.nextInt();
        } else {
            System.out.println("Escoge una nave");
            int opcionCatalogo2 = sc.nextInt();
            switch (opcionCatalogo2) {
                case 1:
                    nna.naveIndividualdeCombate();
                    break;
                case 2:
                    nna.naveMilitarDeTransporte();
                case 3:
                    nna.naveDeGuerra();
                default:
                    break;
            }
        }
    }

    // Inicializa el metodo de cracion de naves
    public static Nave crearNave() {
        DisenoNaves nave = new DisenoNaves();
        System.out.println("CABINA:");
        new CabinaEjercito().getEstadisticas();
        new CabinaIndividual().getEstadisticas();
        new CabinaTripulacion().getEstadisticas();
        Scanner scanner = new Scanner(System.in);
        String opcionCabina = scanner.nextLine();

        // Fabricas para cada parte de la nave.
        AbstractFactory fabricaPropulsion = nave.getFactory("PROPULSION");
        AbstractFactory fabricaBlindaje = nave.getFactory("BLINDAJE");
        AbstractFactory fabricaCabina = nave.getFactory("CABINA");
        AbstractFactory fabricaArmas = nave.getFactory("ARMAS");

        Cabina cabinaNueva = (Cabina) fabricaCabina.getComponente(opcionCabina);
        cabinaNueva.crearCabina();

        System.out.println("A continuación se muestran a detalle las especificaciones de" +
                "las propulsiones con las que contamos.");
        new PropulsionIntercontinental().getEstadisticas();
        new PropulsionIntergalactico().getEstadisticas();
        new PropulsionInterplanetario().getEstadisticas();
        Scanner scannerPropulsion = new Scanner(System.in);
        String opcionPropulsion = scanner.nextLine();
        Propulsion propulsionNueva = (Propulsion) fabricaPropulsion.getComponente(opcionPropulsion);
        propulsionNueva.crearPropulsion();

        System.out.println("A continuación se muestran a detalle las especificaciones de" +
                "los blindajes con los que contamos.");
        new BlindajeSimple().getEstadisticas();
        new BlindajeReforzado().getEstadisticas();
        new BlindajeFortaleza().getEstadisticas();
        Scanner scannerBlindaje = new Scanner(System.in);
        String opcionBlindaje = scanner.nextLine();
        Blindaje blindajeNuevo = (Blindaje) fabricaBlindaje.getComponente(opcionBlindaje);
        blindajeNuevo.crearBlindaje();

        System.out.println("A continuación se muestran a detalle las especificaciones de" +
                "las armas con las que contamos.");
        new ArmaMisilesPlasma().getEstadisticas();
        new ArmaLaserDestructor().getEstadisticas();
        new ArmaLaserSimple().getEstadisticas();
        Scanner scannerArmas = new Scanner(System.in);
        String opcionArmas = scanner.nextLine();
        Armas armasNuevas = (Armas) fabricaArmas.getComponente(opcionArmas);
        armasNuevas.crearArmas();
        Nave nna = new Nave(propulsionNueva, blindajeNuevo, cabinaNueva, armasNuevas);
        return nna;
    }
}
