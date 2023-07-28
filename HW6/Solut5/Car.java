package HW6.Solut5;

// Класс Car теперь зависит от интерфейса Engine
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}