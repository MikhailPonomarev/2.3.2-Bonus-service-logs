public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    //service.calculate(amount, registered); неправильный код для расчета бонусов
    long calculate = service.calculate(amount, registered);
    System.out.println(calculate);
  }
}

