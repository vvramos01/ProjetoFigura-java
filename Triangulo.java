package Figura;


public class Triangulo implements FiguraGeometrica{
   int base;
   int altura;


   public Triangulo(int base, int altura) {
       this.base = base;
   }
   public int getAltura() {
       return altura;
   }


   public int getBase() {
       return base;
   }


   @Override
   public double calcularArea() {
       return (base * altura)/2;
   }
}
