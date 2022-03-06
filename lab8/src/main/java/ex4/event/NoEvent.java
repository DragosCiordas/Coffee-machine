package ex4.event;

class NoEvent extends Event {

    NoEvent() {
        super(EventType.NONE);
    }

    @Override
    public String toString() {
        return "NoEvent{}";
    }
}

