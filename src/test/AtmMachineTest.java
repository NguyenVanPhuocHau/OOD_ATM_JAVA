package test;

import Model.BankData;
import controller.Connection;
import view.AtmMachine;

public class AtmMachineTest {
	public static void main(String[] args) {
		AtmMachine atm = new AtmMachine();
		BankData data = new BankData();
		Connection connection = new Connection(atm, data);
		atm.run(connection);
	}

}
