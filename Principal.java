import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        double radio = scan.nextDouble();
        Circulo c1 = new Circulo();
        if(radio > 0){
            c1.setRadio(radio);
            System.out.println("Radio de c1 "+c1.getRadio());
        }else{
            System.out.println("Error, ¿de que me hablas viejo?");
        }
        System.out.println("Fin programa");
    }
   
}