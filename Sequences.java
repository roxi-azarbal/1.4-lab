public class Sequences {

    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        for (int i = start; i <= limit; i++) {
            if (result.length() > 0) {
                result += " ";
            }
            result += i;
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        for (int i = start; i <= limit; i += 3) {
            if (result.length() > 0) {
                result += " ";
            }
            result += i;
        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (n <= 0) {
                return 1;
            }
            result *= i;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        if (n <= 0 || factor == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            if (i % factor == 0) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        if (s == null) {
            return s;
        }
        for (int i = 0; i < times; i++) {
            if (s.length() <= 0) {
                return "";
            }
            result += s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        if (exponent <= 0) {
            return 0;
        }
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
