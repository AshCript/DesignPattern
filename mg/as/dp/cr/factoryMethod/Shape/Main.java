package mg.as.dp.cr.factoryMethod.Shape;

public class Main {
  public static void main(String[] args) throws Throwable {
    ShapeFactory factory = new CircleFactory();
    
    Shape circle = factory.createShape(ShapeFactory.CIRCLE);
    circle.draw();

    factory = new SquareFactory();
    Shape square = factory.createShape(ShapeFactory.SQUARE);
    try {
      square.draw();
    } catch (Exception e) {
      System.out.println("Erreur : " + e.getMessage());
    }
  }
}