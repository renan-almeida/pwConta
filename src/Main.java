import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor de x: ");
        triangulo.setX(leitura.nextDouble());


        System.out.println("Digite o valor de y: ");
        triangulo.setY(leitura.nextDouble());

        System.out.println("Digite o valor de z: ");
        triangulo.setZ(leitura.nextDouble());

        triangulo.valida();

    }
}