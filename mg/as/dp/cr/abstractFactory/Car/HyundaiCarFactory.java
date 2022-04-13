package mg.as.dp.cr.abstractFactory.Car;

public class HyundaiCarFactory implements CarFactory{
  @Override
  public Car createCar(String carType) {
    switch(carType){
      case "brio":
        return new Brio();
      case "city":
        return new City();
      default:
        return null;
    }
  }
}
