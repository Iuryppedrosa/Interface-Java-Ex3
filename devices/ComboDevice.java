package problema3.devices;

public class ComboDevice extends Device implements Printer, Scanner {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processesDoc(String doc) {

    }

    @Override
    public void print(String doc) {

    }

    @Override
    public String scan() {
        return null;
    }
}
