package tallerpoo;

import javax.swing.JOptionPane;

public class ObjetoCalculadora {
// se le asignan los atributos

    private double numero1;
    private double numero2;

// Se crea el constuctor 
    public ObjetoCalculadora() {
        super();
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        if (numero1 <= 0) {
            JOptionPane.showMessageDialog(null, "Error");
        } else {
            this.numero1 = numero1;
        }
    }

    public void setNumero2(double numero2) {

        if (numero2 <= 0) {
            JOptionPane.showMessageDialog(null, "Error");
        } else {
            this.numero2 = numero2;
        }
    }

//Se realizan metodos para realizar las operaciones y mostrarlas
    public double calcularSuma() {

        return numero1 + numero2;

    }

    public double calcularResta() {

        return numero1 - numero2;

    }

    public double calcularMultiplicacion() {

        return numero1 * numero2;

    }

    public double calcularDivision() {
        double resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return resultado;
    }

    public void impri(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public double leer(String msj) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, msj));
    }
}
