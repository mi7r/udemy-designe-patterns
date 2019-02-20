package patterns;

import patterns.adapter.*;

public class Main {
    public static void main(String[] args) {
        EuSocket euSocket = new EuSocket();

        UkSocket ukSocket = new UkSocket();

        EuDevice euRadio = new EuDevice() {
            public void powerOnEu() {
                System.out.println("music play in Europe");
            }
        };


        UKDevice ukRadio = new UKDevice() {
            public void powerOnUk() {
                System.out.println("music plays in UK");
            }
        };

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(ukRadio, euRadio);
        euSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);

    }
}
