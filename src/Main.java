public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("9133163109");
        Landline l2 = new Landline("8374115945");



        l1.callNumber("8374115945");
        l2.receiveCall("8374115945");
        System.out.println(l2.answerCall());

    }
}