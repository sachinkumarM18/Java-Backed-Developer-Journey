package com.sachin.Interface.Marker.Auditable;

public class AuditDriver {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(101, "Sachin", 5000);

		TemporaryCalculation calculation = new TemporaryCalculation(5000);

		AuditService.audit(account);
		AuditService.audit(calculation);
	}

}
