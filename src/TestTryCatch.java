public class TestTryCatch {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;           // Throws ArithmeticException
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}
