package Q1_TradingEvents;

public class TradingEngineApp {

    public static void main(String[] args) {

        System.out.println("===== Financial Trading Engine =====");

        long currentTime = System.currentTimeMillis();

        // Generic trade event
        TradeEvent genericEvent = new TradeEvent(
                "GENERAL-001",
                currentTime,
                10000.00
        );

        // FIX stock purchase event
        TradeEvent fixEvent = new FIXOrderEvent(
                "FIX-GATEWAY",
                currentTime,
                10000.00,
                "ORDER-101"
        );

        // Reuters market quote event
        TradeEvent reutersEvent = new ReutersQuoteEvent(
                "REUTERS-GATEWAY",
                currentTime,
                150.00,
                149.50,
                150.20
        );

        System.out.println("\n===== Generic Trade Event =====");
        genericEvent.dispatch();

        System.out.println("\n===== Dispatching FIX Order =====");
        fixEvent.dispatch();

        System.out.println("\n===== Dispatching Reuters Quote =====");
        reutersEvent.dispatch();

        System.out.println("\n===== All Events Processed =====");
    }
}