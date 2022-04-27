package strategy;

public class AObj {

  AInterface aInterface;

  public AObj() {
    this.aInterface = new AInterfaceImpl();
  }

  public void funcAA(){

    aInterface.funcA();
    aInterface.funcA();
    /*System.out.println("AAA");
    System.out.println("AAA");*/
  }
}
