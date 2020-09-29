package Calculos;

public class Calculos {

    public double Prom(double[] Calif) {
        double a = 0;
        for (int i = 0; i < Calif.length; i++) {
            a = a + Calif[i];
        }
        a = a / Calif.length;
        return a;
    }

    public void Primeros(double[] Calif) {
        double a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print( "\nCalificacion: " + Calif[i]);
            a = a + Calif[i];
            System.out.println("");
        }
        a = a / 5;
        System.out.println("promedio de los primeros 5: " + a);
    }

    public void Finales( double[] Calif) {
        double a = 0;
        for (int i = Calif.length - 1; i > 9; i--) {
            System.out.print( "\nCalificacion: " + Calif[i]);
            a= a + Calif[i];
            System.out.println("");
        }
        a = a / 5;
        System.out.println("promedio de los ultimos 5: " + a);
    }
}
