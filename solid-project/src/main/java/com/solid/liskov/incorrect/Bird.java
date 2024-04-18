package com.solid.liskov.incorrect;

class Bird {
    public void fly() {
        // Default implementation
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}