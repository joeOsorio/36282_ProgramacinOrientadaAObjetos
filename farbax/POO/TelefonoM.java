import java.util.ArrayList;
import java.util.List;

public class TelefonoM{
    private String marca, modelo, numSerie;
    private List<TarjetaSIM> sims;

    public TelefonoM(String marca, String modelo, String numSerie){
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.sims = new ArrayList <>();
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getNumSerie(){
        return numSerie;
    }
    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }
    public void añadirSIM(TarjetaSIM sim){
        sims.add(sim);
        System.out.println("SIM agregada: "+sim.getNumTelefono());
    }
    public void ListaSIM(){
            if(sims.isEmpty()){
                System.out.println("El telefono no tiene SIM.");
            }else{
                System.out.println("\nEl telefono contiene las siguientes SIM: ");
                for(TarjetaSIM sim : sims){
                    System.out.println(sim);
                }
            }
    }
    public String mostrarDetalles(){
        return "\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de Serie: "+numSerie;
    }
}
