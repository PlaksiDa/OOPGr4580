package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {

    /**
     * Принимает клиента в магазин.
     * 
     * @param actor объект типа iActorBehaviuor, представляющий клиента.
     */
    void acceptToMarket(iActorBehaviuor actor);

    /**
     * Освобождает клиентов из магазина.
     * 
     * @param actors список объектов типа Actor, представляющих клиентов.
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * Обновляет состояние магазина.
     */
    void update();
    
    boolean isPromotionFull();
}