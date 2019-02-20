package patterns;

import patterns.adapter.*;

public class Main {
    public static void main(String[] args) {

        EuDevice euRadio = new EuDevice() {
            public void powerOn() {
                System.out.println("music play in Europe");
            }
        };

        EuSocket euSocket = new EuSocket();
        euSocket.plugIn(euRadio);

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("music plays in UK");
            }
        };

        UkSocket ukSocket = new UkSocket();
        ukSocket.plugIn(ukRadio);

        UKtoEUAdapter uKtoEUAdapter = new UKtoEUAdapter(ukRadio);
        euSocket.plugIn(uKtoEUAdapter);

    }
}
