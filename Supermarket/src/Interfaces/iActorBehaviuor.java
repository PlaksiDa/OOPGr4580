package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor extends iReturnOrder {

    /**
     * Проверяет, берёт ли клиент заказ.
     * 
     * @return true, если клиент берёт заказ, иначе false.
     */
    boolean isTakeOrder();

    /**
     * Проверяет, делает ли клиент заказ.
     * 
     * @return true, если клиент делает заказ, иначе false.
     */
    boolean isMakeOrder();

    /**
     * Устанавливает состояние клиента по взятию заказа.
     * 
     * @param takeOrder true, если клиент берёт заказ, иначе false.
     */
    void setTakeOrder(boolean takeOrder);

    /**
     * Устанавливает состояние клиента по совершению заказа.
     * 
     * @param makeOrder true, если клиент делает заказ, иначе false.
     */
    void setMakeOrder(boolean makeOrder);
    
    Actor getActor();
}
