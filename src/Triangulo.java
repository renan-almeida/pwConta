public class Triangulo {
    private double x;
    private double y;
    private double z;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void valida() {
        if (x + y > z || z + x > y || y + z > x )  {
            System.out.println("Isso pode ser um triângulo!");
            if (x == y && x == z ) {
                System.out.println("Esse triângulo é um triângulo Equilátero!");
            }
            else if (x == y && x != z && y != z || x == z && x != y || y == z && y != x ) {
                System.out.println("Esse triângulo é um triângulo Isòsceles!");
            }
            else if (x != y && x != z && y != z) {
                System.out.println("Esse triângulo é um triângulo Escaleno!");
            }
        }
        else {
            System.out.println("Isto não pode ser um triângulo!!!");
        }

    }
}
