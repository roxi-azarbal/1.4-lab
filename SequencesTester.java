public class SequencesTester {

    public static void main(String[] args) {
        Sequences sequences = new Sequences();

        // The square brackets make an empty String easy to see.
        // Uncomment each pair of lines as you finish that method.

        System.out.println("sumOfFirst(5): [" + sequences.sumOfFirst(5) + "]");
        System.out.println("sumOfFirst(0): [" + sequences.sumOfFirst(0) + "]");
        System.out.println("sumOfFirst(10): [" + sequences.sumOfFirst(10) + "]");

        System.out.println("countUp(-2, 2): [" + sequences.countUp(-2, 2) + "]");
        System.out.println("countUp(5, 3): [" + sequences.countUp(5, 3) + "]");
        System.out.println("countUp(1, 5): [" + sequences.countUp(1, 5) + "]");

        System.out.println("countByThrees(1, 10): [" + sequences.countByThrees(1, 10) + "]");
        System.out.println("countByThrees(5, 3): [" + sequences.countByThrees(5, 3) + "]");
        System.out.println("countByThrees(2, 9): [" + sequences.countByThrees(2, 9) + "]");

        System.out.println("productOfFirst(5): [" + sequences.productOfFirst(5) + "]");
        System.out.println("productOfFirst(0): [" + sequences.productOfFirst(0) + "]");
        System.out.println("productOfFirst(-3): [" + sequences.productOfFirst(-3) + "]");

        System.out.println("countMultiples(20, 5): [" + sequences.countMultiples(20, 5) + "]");
        System.out.println("countMultiples(10, 0): [" + sequences.countMultiples(10, 0) + "]");
        System.out.println("countMultiples(20, 7): [" + sequences.countMultiples(20, 7) + "]");

        System.out.println("repeat(\"ab\", 3): [" + sequences.repeat("ab", 3) + "]");
        System.out.println("repeat(\"ab\", 0): [" + sequences.repeat("ab", 0) + "]");
        System.out.println("repeat(\"-\", 5): [" + sequences.repeat("-", 5) + "]");


        System.out.println("power(2, 9): [" + sequences.power(2, 9) + "]");
        System.out.println("power(5, 0): [" + sequences.power(5, 0) + "]");
        System.out.println("power(-3, 3): [" + sequences.power(-3, 3) + "]");
    }
}
