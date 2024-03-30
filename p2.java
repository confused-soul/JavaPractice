import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class p2 {
    public static int findLongestAP(ListNode head) {
        if (head == null)
            return 0;

        int maxLength = 1;
        int currentLength = 1;
        int prevDiff = 0;

        ListNode current = head;
        ListNode prev = null;

        while (current != null && current.next != null) {
            int diff = current.next.val - current.val;

            if (prev == null || diff == prevDiff) {
                currentLength++;
            } else {
                currentLength = 2;
            }

            prevDiff = diff;
            prev = current;
            current = current.next;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Input reading
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int result = findLongestAP(head);
        System.out.println(result);
        scanner.close();
    }
}
