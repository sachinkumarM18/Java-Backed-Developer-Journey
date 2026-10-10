package com.sachin.Interface.Marker.Auditable;

public class AuditService {
	public static void audit(Object object) {
		if (object instanceof Auditable) {
			System.out.println("AUDIT: Object is elligible for auditing.");
		} else {
			System.out.println("AUDIT: Object is Not eligible for auditing.");
		}
	}
}
