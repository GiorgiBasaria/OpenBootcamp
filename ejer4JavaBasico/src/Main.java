import com.ejer.SmartDevice;
import com.ejer.SmartPhone;
import com.ejer.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone samsungGalaxy = new SmartPhone("Samsung", "Galaxy S45", 32, 1500, "4k", "Android", 1550 );

        System.out.println(samsungGalaxy.getFabricante()+" "+samsungGalaxy.getModelo()+" "+samsungGalaxy.getMemoriaRAM()+" "+samsungGalaxy.getMemoriaInterna()+
                " "+samsungGalaxy.getResolucionPantalla()+" "+samsungGalaxy.getSistemaOperativo()+" "+samsungGalaxy.getResolucionCamara());

        SmartWatch appelWatch = new SmartWatch("Apple", "3", 2, 32, "FHD", "WIOS", true);
        System.out.println(appelWatch.getFabricante()+" "+appelWatch.getPulspmetro());



    }
}