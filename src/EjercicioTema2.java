import  java.util.Scanner;
public class EjercicioTema2 {
    public static void main(String[] args) {
        float total;
        Scanner sc= new Scanner(System.in);
        total= sc.nextFloat();
        String res= ObtenerIva(total);
        System.out.println(res);
    }

    private static String ObtenerIva(float total) {
        float iva = total*14/100;
        String res="El total es: "+total+" con iva: "+iva;
        return res;
    }
}
