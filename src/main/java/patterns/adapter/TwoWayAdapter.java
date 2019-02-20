package patterns.adapter;

public class TwoWayAdapter implements UKDevice, EuDevice {

    UKDevice ukDevice;
    EuDevice euDevice;

    public TwoWayAdapter(UKDevice ukDevice, EuDevice euDevice) {
        this.ukDevice = ukDevice;
        this.euDevice = euDevice;
    }

    public void powerOnEu() {
        ukDevice.powerOnUk();
    }

    public void powerOnUk() {
        euDevice.powerOnEu();
    }
}
