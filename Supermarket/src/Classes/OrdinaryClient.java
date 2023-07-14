package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder {

  // private boolean setTakeOrder;
  // private boolean setMakeOrder;

  @Override
  public void returnOrder() {
    // Реализация возврата товара для обычного клиента
    String logMessage = getName() + " возвращает товар";
    System.out.println(logMessage);
    LogWriter.writeLog(logMessage);
  }

  @Override
  public boolean canReturnOrder() {
    // Логика определения возможности возврата товара для обычного клиента
    return true; // Здесь можно задать условие возврата, например, если клиент сделал заказ
  }

  public OrdinaryClient(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return super.name;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
  }

  public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  public Actor getActor() {
    return this;
  }

  // public boolean isSetTakeOrder() {
  // return setTakeOrder;
  // }

  // public void setSetTakeOrder(boolean setTakeOrder) {
  // this.setTakeOrder = setTakeOrder;
  // }

  // public boolean isSetMakeOrder() {
  // return setMakeOrder;
  // }

  // public void setSetMakeOrder(boolean setMakeOrder) {
  // this.setMakeOrder = setMakeOrder;
  // }

  // @Override
  // public String getName() {
  // return name;
  // }
}
