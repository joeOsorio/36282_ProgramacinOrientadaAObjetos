public class Triangulo extends Figura {
    private double baseTriangulo;
    private double alturaTriangulo;
    private double areaTriangulo;

    public Triangulo(){
        @super();
        baseTriangulo   = 0;
        alturaTriangulo = 0;
        areaTriangulo   = 0;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo){this.areaTriangulo}

    public double getBaseTriangulo() {
        return baseTriangulo;
    }

    public double getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public double getAreaTriangulo() {
        return (baseTriangulo * alturaTriangulo) / 2;
    }
}
