package mg.as.dp.cr.abstractFactory.Car;

public class Main {
  public static void main(String[] args) {
    CarFactory hondaCarFactory = FactoryProducer.getCarFactory("honda");
    Car i10 = hondaCarFactory.createCar("i10");
    Car i20 = hondaCarFactory.createCar("i20");
    i10.drive();
    i20.drive();
  }
}
