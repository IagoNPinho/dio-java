package org.iago.set.OperacoesBasicas.Guests;

public class Guest {
    private String name;
    private int inviteCode;

    public Guest(String name, int inviteCode){
        setName(name);
        setInviteCode(inviteCode);
    }

    private void setInviteCode(int inviteCode) {
        this.inviteCode = inviteCode;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public String toString() {
        return "Guest " + name + " with code of invite " + inviteCode;
    }
}
