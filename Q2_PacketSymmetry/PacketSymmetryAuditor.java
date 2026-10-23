package Q2_PacketSymmetry;

import java.util.Scanner;

public class PacketSymmetryAuditor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PACKET SYMMETRY AUDITOR =====");

        System.out.print("Enter packet payload: ");
        String packet = scanner.nextLine();

        TransactionStack stack =
                new TransactionStack(packet.length());

        RequestQueue queue =
                new RequestQueue(packet.length());

        for (int i = 0; i < packet.length(); i++) {

            char current = packet.charAt(i);

            stack.push(current);
            queue.enqueue(current);
        }

        System.out.println("Packet loaded successfully.");

        scanner.close();
    }
}