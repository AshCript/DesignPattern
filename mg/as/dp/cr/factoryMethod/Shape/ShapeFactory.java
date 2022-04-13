package mg.as.dp.cr.factoryMethod.Shape;

public abstract class ShapeFactory {
  public static final int CIRCLE = 1;
  public static final int SQUARE = 2;
  protected abstract Shape createShape(int type) throws Throwable;
}