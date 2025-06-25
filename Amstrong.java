//Check the given number is a amstrong number or not
public class Amstrong {
    void isAmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not Amstrong Number");
        }
    }
    public static void main(String[] args) {
        Amstrong a = new Amstrong();
        a.isAmstrong(153);
    }
}
