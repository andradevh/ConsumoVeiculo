package Principal;
import Model.Veiculo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       Veiculo consumo = new Veiculo();
       consumo.setKmpercorrido(Double.parseDouble(JOptionPane.showInputDialog("Digite os quilômetros percorridos: ")));
       consumo.setLitrosgasto(Double.parseDouble(JOptionPane.showInputDialog("Digite os litros consumidos")));
       
               
       JOptionPane.showMessageDialog(null, "Consumo total foi de: " + consumo.getConsumototal() + " L");
    }
    
}
