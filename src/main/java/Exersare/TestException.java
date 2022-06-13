package Exersare;

public class TestException {
    public static void main(String[] args) throws InvalidAgeException {
        test(15);

    }

    static void test(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Nu vinde alcool");
        } else System.out.println("Vindem alcool");

    }
}
