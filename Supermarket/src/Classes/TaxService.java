package Classes;

import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class TaxService implements iActorBehaviuor, iReturnOrder {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    @Override
    public void returnOrder() {
        // Реализация возврата товара для налоговой службы
        System.out.println(getName() + " возвращает товар");
    }

    @Override
    public boolean canReturnOrder() {
        // Логика определения возможности возврата товара для налоговой службы
        return false; // Налоговая служба не имеет права возвращать товары
    }

    public TaxService() {
        this.name = "Tax audit";
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
