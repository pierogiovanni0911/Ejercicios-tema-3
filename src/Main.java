public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(20, 20, 20);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void AumentarPuertas(){
        this.puertas++;
    }
}

