package com.solid.di.incorrect;

class Client {
    private final Child child;

    public Client(Child child) {
        this.child = child;
    }

    void useChild() {
        child.doSomething();
    }
}