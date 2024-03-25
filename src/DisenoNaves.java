public class DisenoNaves {
    public static AbstractFactory getFactory(String opcion){
		if(opcion.equalsIgnoreCase("PROPULSION")){
			return new FabricaPropulsion();
		} else if(opcion.equalsIgnoreCase("BLINDAJE")){
			return new FabricaBlindaje();
		} else if(opcion.equalsIgnoreCase("CABINA")){
			return new FabricaCabina();
		} else if (opcion.equalsIgnoreCase("ARMAS")){
            return new FabricaArmas();
        }
		return null;
	}
}
