package com.solid.di.incorrect.good;

class Client {
    private final Parent parent;

    public Client(Parent parent) {
        this.parent = parent;
    }

    void useParent() {
        parent.doSomething();
    }
}