package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviuor;

import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviuor> queue;
    private int promotionParticipants;
    private static final int MAX_PROMOTION_PARTICIPANTS = 100; // Максимальное количество участников акции

    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
        this.promotionParticipants = 0;
    }

    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        String logMessage = actor.getActor().getName() + " клиент пришел в магазин";
        System.out.println(logMessage);
        LogWriter.writeLog(logMessage);

        if (actor instanceof PromotionalClient) {
            if (isPromotionFull()) {
                logMessage = "Акция полностью заполнена. " + actor.getActor().getName() + " не может присоединиться.";
                System.out.println(logMessage);
                LogWriter.writeLog(logMessage);
                return;
            }
            promotionParticipants++;
        }
        takeInQueue(actor);
    }

    @Override
    public boolean isPromotionFull() {
        return promotionParticipants >= MAX_PROMOTION_PARTICIPANTS;
    }

    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            String logMessage = actor.getName() + " клиент ушел из магазина";
            System.out.println(logMessage);
            LogWriter.writeLog(logMessage);
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
        returnOrder(); // Добавлен вызов метода returnOrder()
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviuor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviuor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    @Override
    public void returnOrder() {
        List<Actor> returnedActors = new ArrayList<>();
        for (iActorBehaviuor actor : queue) {
            if (actor instanceof iReturnOrder) {
                iReturnOrder returnableActor = (iReturnOrder) actor;
                if (returnableActor.canReturnOrder()) {
                    returnableActor.returnOrder();
                    returnedActors.add(returnableActor.getActor());
                }
            }
        }
        String logMessage = "Возврат товара:";
        for (Actor actor : returnedActors) {
            logMessage += " " + actor.getName();
        }
        System.out.println(logMessage);
        LogWriter.writeLog(logMessage);
        releaseFromMarket(returnedActors);
    }

}
