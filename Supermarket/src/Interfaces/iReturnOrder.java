package Interfaces;

import Classes.Actor;

public interface iReturnOrder {

    /**
     * Выполняет возврат товара.
     */
    void returnOrder();

    /**
     * Проверяет, может ли клиент выполнить возврат товара.
     * 
     * @return true, если клиент может выполнить возврат, иначе false.
     */
    boolean canReturnOrder();

    /**
     * Возвращает объект типа Actor, представляющий клиента.
     * 
     * @return объект типа Actor, представляющий клиента.
     */
    Actor getActor();
}