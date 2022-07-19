
package polimorfismofiguras;

import java.util.Scanner;

public class PolimorfismoFiguras {

    public static void main(String[] args) {
        int op;
        double area = 0, perimetro = 0;
        Scanner e = new Scanner(System.in);      
        
        System.out.println("""
                           Digite 1 si desea calcular el area y el perimetro de un circulo 
                            2 para un pologono regular de dos lados:""");
        op = e.nextInt();
        
        switch(op){
            case 1 -> {
                Figura circulo = new Circulo();
                System.out.println("Digite el radio del circulo: ");
                circulo.setValor1(e.nextDouble());
                area = circulo.calcularArea();
                perimetro = circulo.calcularPerimetro();
            }
            
            case 2 -> {
                Figura poligono = new Poligono();
                System.out.println("Digite la base y la altura del poligono respectivamente: ");
                poligono.setValor1(e.nextDouble());
                poligono.setValor2(e.nextDouble());
                area = poligono.calcularArea();
                perimetro = poligono.calcularPerimetro();
            }
            
            default -> {
                System.out.println("Opción incorrecta");
            }
        }
        
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
    }
    
}
