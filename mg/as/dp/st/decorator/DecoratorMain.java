package mg.as.dp.st.decorator;

public class DecoratorMain {
  public static void main(String[] args) {
    Boisson cafe = new Cafe();
    System.out.println("Boisson : " + cafe.getDescription() + " | cout : " + cafe.cout());
    cafe = new Lait(cafe);
    System.out.println("Boisson : " + cafe.getDescription() + " | cout : " + cafe.cout());
    cafe = new Chocolat(cafe);
    System.out.println("Boisson : " + cafe.getDescription() + " | cout : " + cafe.cout());
  }
}
