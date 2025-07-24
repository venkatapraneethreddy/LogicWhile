package LogicWhile;

public class CollegeFest {
    public static void main(String[] args) {
        Participant p = new Participant();
        p.setParticipantId(501);
        p.setName("Rahul");
        p.setBaseRegistrationFee(200.0);
        p.setNumberOfEvents(3);
        p.setEventChargePerEvent(100.0);
        p.displayDetails();
    }
}

class Participant {
    private int participantId;
    private String name;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseRegistrationFee(double baseRegistrationFee) {
        this.baseRegistrationFee = baseRegistrationFee;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public void setEventChargePerEvent(double eventChargePerEvent) {
        this.eventChargePerEvent = eventChargePerEvent;
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getName() {
        return name;
    }

    public double getBaseRegistrationFee() {
        return baseRegistrationFee;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public double getEventChargePerEvent() {
        return eventChargePerEvent;
    }

    public double calculateTotalFee() {
        return baseRegistrationFee + (numberOfEvents * eventChargePerEvent);
    }

    public void displayDetails() {
        System.out.println("Participant Record");
        System.out.println("ID: " + participantId);
        System.out.println("Name: " + name);
        System.out.println("Base Registration Fee: " + baseRegistrationFee);
        System.out.println("Event Charges: " + numberOfEvents + " events @ " + eventChargePerEvent + "/event");
        System.out.println("Total Fee: " + calculateTotalFee());
    }
}


