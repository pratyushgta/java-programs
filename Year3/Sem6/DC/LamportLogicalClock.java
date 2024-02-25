package Year3.Sem6.DC;

import java.util.HashMap;
import java.util.Map;

class LamportLogicalClock {
    private Map<String, Integer> clocks;

    public LamportLogicalClock() {
        this.clocks = new HashMap<>();
    }

    public void incrementClock(String process, int value) {
        int current = clocks.getOrDefault(process, 0);
        clocks.put(process, current + value);
    }

    public void sendMessage(String sender, String receiver, int timestamp) {
        incrementClock(sender, timestamp);
    }

    public void receiveMessage(String receiver, int timestamp) {
        incrementClock(receiver, timestamp);
    }

    public int getClockValue(String process) {
        return clocks.getOrDefault(process, 0);
    }

    public static void main(String[] args) {
        LamportLogicalClock clock = new LamportLogicalClock();

        // Process P1 increments its logical clock by 6
        clock.incrementClock("P1", 6);

        // Process P2 increments its logical clock by 8
        clock.incrementClock("P2", 8);

        // Process P3 increments its logical clock by 10
        clock.incrementClock("P3", 10);

        // Process P1 sends a message to P2 at timestamp 6
        clock.sendMessage("P1", "P2", 6);

        // Process P2 receives the message at timestamp 16, updates its logical clock, and increments it
        clock.receiveMessage("P2", 16);

        // Process P2 sends a message to P3 at timestamp 24
        clock.sendMessage("P2", "P3", 24);

        // Process P3 receives the message at timestamp 40, updates its logical clock, and increments it
        clock.receiveMessage("P3", 40);

        // Process P3 sends a message to P2 at timestamp 60
        clock.sendMessage("P3", "P2", 60);

        // Process P2 receives the message at timestamp 56, updates its logical clock, and increments it
        clock.receiveMessage("P2", 56);

        // Print the final logical clock values for each process
        System.out.println("Final Logical Clock Values:");
        System.out.println("P1: " + clock.getClockValue("P1"));
        System.out.println("P2: " + clock.getClockValue("P2"));
        System.out.println("P3: " + clock.getClockValue("P3"));
    }
}
