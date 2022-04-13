package mg.as.dp.cr.factoryMethod.Shape;

public class SquareFactory extends ShapeFactory{

  @Override
  protected Shape createShape(int shapeType) throws Throwable {
    switch(shapeType){
      case SQUARE :
        return new Square();
      default: throw new Throwable("Shape undefined");
    }
  }
}
