package org.iago.set.OperacoesBasicas.Guests;

import java.util.HashSet;
import java.util.Set;

public class Fest {
    public static void main(String[] args) {
        Fest festGuest = new Fest();

        System.out.println("There is " + festGuest.getNumberOfGuest() + " guests in this set.");

        festGuest.setInvited("Iago", 123);
        festGuest.setInvited("Alice", 1234);
        festGuest.setInvited("Bob", 1244);
        festGuest.setInvited("Charlie", 1);
        festGuest.setInvited("David", 1245);
        festGuest.setInvited("Travis", 2458);

        System.out.println(festGuest.getAllGuest());

        System.out.println("There is " + festGuest.getNumberOfGuest() + " guests in this set.");

        festGuest.removeInvited(123);
        System.out.println("Remove guest by invite code '123'");
        System.out.println(festGuest.getAllGuest());
        System.out.println("There is " + festGuest.getNumberOfGuest() + " guests in this set.");
    }

    private Set<Guest> guestSet;

    public Fest(){
        this.guestSet = new HashSet<>();
    }

    public void setInvited(String name, int inviteCode){
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeInvited(int inviteCode){
        Guest guestToRemove = null;
        if(!guestSet.isEmpty()){
            for(Guest guest: guestSet){
                if(guest.getInviteCode() == inviteCode){
                    guestToRemove = guest;
                    break;
                }
            }
            guestSet.remove(guestToRemove);
        } else {
            throw new RuntimeException("This set is empty");
        }
    }

    public int getNumberOfGuest(){
        return guestSet.size();
    }

    public Set<Guest> getAllGuest(){
        if (!guestSet.isEmpty()){
            return guestSet;
        } else {
            throw new RuntimeException("This set is empty");
        }
    }
}
