public class Program10 {
    public static void main(String[] args) {

        int value1 = 300;
        double value2 = 3.14;
        short value3 = 5;
        char value4 = 'A';

        // Part A: create StringBuilder and add 4 values to it.
        StringBuilder builder = new StringBuilder();
        builder.append(value1).append("\n");
        builder.append(value2).append("\n");
        builder.append(value3).append("\n");
        builder.append(value4);

        // Part B: display results.
        String result = builder.toString();
        System.out.println(result);
    }
}