package diamondProblem.application;

import diamondProblem.devices.ComboDevice;
import diamondProblem.devices.ConcretePrinter;
import diamondProblem.devices.ConcreteScanner;

public class Main {
	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		ConcreteScanner s = new ConcreteScanner("760mx");
		s.processDoc("My mail");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println("------------------------------");
		ComboDevice c = new ComboDevice("2091fx");
		c.processDoc("My dissertation.");
		c.print("My dissertation.");
		System.out.println("Scan result: " + c.scan());
		System.out.println("------------------------------");
	}
}
