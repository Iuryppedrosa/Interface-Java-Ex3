package problema3.devices;

public class ConcreteScanner extends Device implements Scanner{
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processesDoc(String doc) {

    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
