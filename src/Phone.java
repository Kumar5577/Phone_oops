public interface Phone {
    void powerOn();
    void callNumber(String number);
    void receiveCall(String number);
    boolean answerCall();
    boolean isRinging();

}
