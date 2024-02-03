package org.iago.map.Ordenacao.EventsBook;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class EventsBook {
    public static void main(String[] args) {
        EventsBook eventsBook = new EventsBook();

        eventsBook.setEvent(LocalDate.of(2024, 11, 18), "Birthday", "Iago turns 22");
        eventsBook.setEvent(LocalDate.of(2025, 11, 18), "Birthday", "Iago turns 23");
        eventsBook.setEvent(LocalDate.of(2023, 11, 18), "Birthday", "Iago turns 21");
        eventsBook.setEvent(LocalDate.of(2022, 11, 18), "Birthday", "Iago turns 20");
        eventsBook.setEvent(LocalDate.of(2021, 11, 18), "Birthday", "Iago turns 19");

        eventsBook.showEventsBook();
        eventsBook.showNextEvent();
    }
    private Map<LocalDate, Event> eventBook;

    public EventsBook(){
        eventBook = new HashMap<>();
    }

    public void setEvent(LocalDate date, String eventName, String attractionName){
        eventBook.put(date, new Event(eventName, attractionName));
    }

    public void showEventsBook(){
        if(!eventBook.isEmpty()){
            System.out.println(eventBook);
        } else {
            System.out.println("There aren't event in this event book");
        }
    }

    public void showNextEvent(){
        LocalDate nowDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        if(!eventBook.isEmpty()){
            for(Map.Entry<LocalDate, Event> eventEntry: eventBook.entrySet()){
                LocalDate eventDate = eventEntry.getKey();
                if (eventDate.isEqual(nowDate) || eventDate.isAfter(nowDate)){
                    nextDate = eventDate;
                    nextEvent = eventEntry.getValue();
                    break;
                }
            }
            if (nextEvent != null) {
                System.out.println("The next event is " + nextEvent.getEventName() + " and will happens on the " + nextDate);
            } else {
                System.out.println("There aren't future events on this event book");
            }
        } else {
            System.out.println("There aren't event in this event book");
        }
    }

}
