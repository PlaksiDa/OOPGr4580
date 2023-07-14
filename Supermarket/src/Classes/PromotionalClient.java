package Classes;

import Interfaces.iReturnOrder;

public class PromotionalClient extends Actor implements iReturnOrder {
    private String promotionName;
    private int clientId;
    private static int participantsCount;

    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantsCount++;
    }

    @Override
    public void returnOrder() {
        // Реализация возврата товара для акционного клиента
        String logMessage = getName() + " возвращает товар";
        System.out.println(logMessage);
        LogWriter.writeLog(logMessage);
    }

    @Override
    public boolean canReturnOrder() {
        // Логика определения возможности возврата товара для акционного клиента
        return true; // Здесь можно задать условие возврата, например, если клиент сделал заказ
    }

    public String getPromotionName() {
        return promotionName;
    }

    public int getClientId() {
        return clientId;
    }

    public static int getParticipantsCount() {
        return participantsCount;
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

    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

}