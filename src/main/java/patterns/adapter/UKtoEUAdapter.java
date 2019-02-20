package patterns.adapter;

public class UKtoEUAdapter implements EuDevice {

    UKDevice device;

    public UKtoEUAdapter(UKDevice device) {
        this.device = device;
    }

    public void powerOn() {
        device.powerOn();
    }
}
