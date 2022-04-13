package mg.as.dp.cr.abstractFactory.Car;

public class HondaCarFactory implements CarFactory{

  @Override
  public Car createCar(String carType) {
    switch(carType){
      case "i10":
        return new I10();
      case "i20":
        return new I20();
      default:
        return null;
    }
  }
}
