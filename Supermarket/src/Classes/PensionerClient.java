package Classes;

import Interfaces.iReturnOrder;

public class PensionerClient extends Actor implements iReturnOrder {
  private int pensID;

  @Override
  public void returnOrder() {
    // Реализация возврата товара для пенсионерского клиента
    String logMessage = getName() + " возвращает товар";
    System.out.println(logMessage);
    LogWriter.writeLog(logMessage);
  }

  @Override
  public boolean canReturnOrder() {
    // Логика определения возможности возврата товара для пенсионерского клиента
    return true; // Здесь можно задать условие возврата, например, если клиент сделал заказ
  }

  public PensionerClient(String name, int pensID) {
    super(name + " - пенсионер");
    this.pensID = pensID;
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

}
