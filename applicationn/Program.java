package problema3.applicationn;

import problema3.devices.ComboDevice;
import problema3.devices.ConcretePrinter;
import problema3.devices.ConcreteScanner;

public class Program {

    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processesDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processesDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processesDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
