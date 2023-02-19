public class TipoVariable {
    public static void main (String [] args){
        System.out.println("Hola mundo");
        int edad = 28;
        System.out.println("La edad de las persona es "+ edad);
        edad = 47; // es posible sobre escribir el valor
        System.out.println(edad);
        edad = 40 + 20;
        System.out.println(edad);

        double salario = 120.56; //  numeros decimales
        System.out.println(salario);

        double salarioMitad = salario /3; // toda variable debe ser inicializada, antes de usarla
        System.out.println(salarioMitad);

        int division = 1250 / 3;
        System.out.println(division);
    }
}
