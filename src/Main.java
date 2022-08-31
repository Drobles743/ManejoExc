import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception,NumeroNegativoExcepcion {
        Longitud p = new Longitud();
        Raiz r =new Raiz();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una texto: ");
        String s =  scan.nextLine();

        try{
            System.out.println(p.caracterEn(s, 7));
        } catch(Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
        System.out.println("Ingrese un numero para sacarle Raiz");
        double x = scan.nextDouble();
        try {
            System.out.println(r.raiz(x));
        } catch (Exception e) {
            System.out.println("el numero es negativo");
        }


    }




}


