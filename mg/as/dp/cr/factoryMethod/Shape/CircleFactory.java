package mg.as.dp.cr.factoryMethod.Shape;

public class CircleFactory extends ShapeFactory{

  @Override
  protected Shape createShape(int shapeType) throws Throwable {
    switch(shapeType){
      case CIRCLE :
        return new Circle();
      default: throw new Throwable("Shape undefined");
    }
  }
  
}
