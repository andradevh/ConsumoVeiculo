package Model;

public class Veiculo {
    private double kmpercorrido;
    private double litrosgasto;

    public Veiculo() {
    }

    public Veiculo(double kmpercorrido, double litrosgasto) {
        this.kmpercorrido = kmpercorrido;
        this.litrosgasto = litrosgasto;
    }

    public double getKmpercorrido() {
        return kmpercorrido;
    }

    public void setKmpercorrido(double kmpercorrido) {
        this.kmpercorrido = kmpercorrido;
    }

    public double getLitrosgasto() {
        return litrosgasto;
    }

    public void setLitrosgasto(double litrosgasto) {
        this.litrosgasto = litrosgasto;
    }

    public double getConsumototal() {
        return kmpercorrido/litrosgasto;
    }
    
}
