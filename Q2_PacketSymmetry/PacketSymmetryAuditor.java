package Q2_PacketSymmetry;

import java.util.Scanner;

public class PacketSymmetryAuditor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PACKET SYMMETRY AUDITOR =====");

        System.out.print("Enter packet payload: ");
        String packet = scanner.nextLine();
        if (packet.isEmpty()) {
    System.out.println("ERROR: Packet payload cannot be empty.");
    scanner.close();
    return;
}

        TransactionStack stack =
                new TransactionStack(packet.length());

        RequestQueue queue =
                new RequestQueue(packet.length());

        for (int i = 0; i < packet.length(); i++) {

            char current = packet.charAt(i);

            stack.push(current);
            queue.enqueue(current);
        }

       boolean isPalindrome = true;

System.out.println("\n===== VERIFICATION LOG =====");

int position = 1;

while (!stack.isEmpty() && !queue.isEmpty()) {

    char stackChar = stack.pop();
    char queueChar = queue.dequeue();

    System.out.println(
        "Check " + position +
        " | Stack: " + stackChar +
        " | Queue: " + queueChar
    );

    if (stackChar != queueChar) {
        isPalindrome = false;
    }

    position++;
}

System.out.println("============================");

if (isPalindrome) {
    System.out.println("RESULT: PACKET SYMMETRY VERIFIED");
    System.out.println("The packet is a PALINDROME.");
} else {
    System.out.println("RESULT: PACKET SYMMETRY FAILED");
    System.out.println("The packet is NOT a palindrome.");
}

        scanner.close();
    }
}