package org.iago.map.Ordenacao.EventsBook;

public class Event {
    private String eventName;
    private String attractionName;

    public Event(String eventName, String attractionName){
        setEventName(eventName);
        setAttractionName(attractionName);
    }

    private void setEventName(String eventName) {
        this.eventName = eventName;
    }

    private void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getEventName() {
        return eventName;
    }

    public String getAttractionName() {
        return attractionName;
    }

    @Override
    public String toString() {
        return "Event " + eventName + " attraction " + attractionName;
    }
}
