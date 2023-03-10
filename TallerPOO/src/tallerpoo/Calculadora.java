package tallerpoo;

import tallerpoo.ObjetoCalculadora;

public class Calculadora {

    public static void main(String[] args) {
//Creacion de objeto
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
//Se asignan valores a los atributos de la clase

        calculadora.setNumero1(calculadora.leer("Ingrese el numero 1"));
        calculadora.setNumero2(calculadora.leer("Ingrese el numero 2"));
        if (calculadora.getNumero1() > 0 && calculadora.getNumero2() > 0) {
//Se ejecutan las operaciones
//Suma
            calculadora.impri("El resultado de la suma es " + calculadora.calcularSuma());
//Resta

            calculadora.impri("El resultado de la resta es " + calculadora.calcularResta());
//Multiplicacion

            calculadora.impri("El resultado de la multiplicacion es " + calculadora.calcularMultiplicacion());
//División

            calculadora.impri("El resultado de la division es " + calculadora.calcularDivision());
        }
    }
}
