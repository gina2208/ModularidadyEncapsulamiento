package tallerpoo;

import tallerpoo.Areas;

public class Ppal {

    public static void main(String[] args) {

        Areas fi = new Areas();

        fi.base = fi.leer("Ingrese la base");
        fi.altura = fi.leer("Ingrese la altura");
        fi.radio = fi.leer("Ingrese el radio");
        fi.calcularCuadrado();
        fi.calcularCirculo();
        fi.impri("El area del cuadrado es " + fi.areaCuad);
        fi.impri("El area del circulo es " + fi.areaCir);
    }

}
