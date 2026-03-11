public class Temperatura{
private double fahTemp;

public Temperatura(double fahTemp){
this.fahTemp = fahTemp;
}

public void setFahrenheit(double fahTemp){
this.fahTemp = fahTemp;
}

public double getFahrenheit(){
return fahTemp;
}
public double getCelsius(){
return (5.0 / 9.0) * (fahTemp - 32.0);
}
public double getKelvin(){
return ((5.0/9.0) * (fahTemp - 32.0) + 273.0);
}

}