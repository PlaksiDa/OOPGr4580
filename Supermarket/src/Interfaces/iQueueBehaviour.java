package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    
    /**
     * Принимает клиента в очередь.
     * 
     * @param actor объект типа iActorBehaviuor, представляющий клиента.
     */
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Освобождает клиентов из очереди.
     */
    void releaseFromQueue();

    /**
     * Записывает заказы от клиентов.
     */
    void takeOrder();

    /**
     * Выдаёт заказы клиентам.
     */
    void giveOrder();
    void returnOrder();
}