package Classes;

import Interfaces.iReturnOrder;

public class SpecialClient extends Actor implements iReturnOrder {
  private int idVip;

  @Override
  public void returnOrder() {
    // Реализация возврата товара для особого клиента
    String logMessage = getName() + " возвращает товар";
    System.out.println(logMessage);
    LogWriter.writeLog(logMessage);
  }

  @Override
  public boolean canReturnOrder() {
    // Логика определения возможности возврата товара для особого клиента
    return true; // Здесь можно задать условие возврата, например, если клиент сделал заказ
  }

  public SpecialClient(String name, Integer id) {
    super(name);
    idVip = id;
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

  // @Override
  // public String getName() {
  // return name;
  // }

  // public int getIdVip() {
  // return idVip;
  // }
}
