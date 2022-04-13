package mg.as.dp.cr.abstractFactory.Car;

public class FactoryProducer {
  public static CarFactory getCarFactory(String factoryType){
    switch(factoryType){
      case "hyundai":
        return new HyundaiCarFactory();
      case "honda":
        return new HondaCarFactory();
      default:
        return null;
    }
  }
}