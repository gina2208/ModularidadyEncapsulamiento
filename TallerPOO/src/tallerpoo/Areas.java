package tallerpoo;

import javax.swing.JOptionPane;

public class Areas {

    double base;
    double altura;
    double radio;
    double areaCuad;
    double areaCir;

    public Areas() {
    }

    public double leer(String msj) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, msj));
    }

    public void calcularCuadrado() {
        areaCuad = this.base * this.altura;

    }

    public void calcularCirculo() {
        areaCir = (this.radio * this.radio) * Math.PI;
    }

    public void impri(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
