package strategy;

public class Main {

  public static void main(String[] args) {
   /* AInterface aInterface = new AInterfaceImpl();
    aInterface.funcA();

    AObj aObj = new AObj();
    aObj.funcAA();*/

    GameCharacter character = new GameCharacter();
    character.attack();
    character.setWeapon(new Knife());
    character.attack();
    character.setWeapon(new Sword());
    character.attack();
  }
}
