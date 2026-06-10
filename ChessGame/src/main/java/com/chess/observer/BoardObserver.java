package com.chess.observer;

public class BoardObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Update: " + message);
    }
}package com.chess.observer;

public interface Observer {
    void update(String message);
}
