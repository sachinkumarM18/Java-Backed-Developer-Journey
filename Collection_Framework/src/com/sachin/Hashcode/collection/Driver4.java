package com.sachin.Hashcode.collection;

public class Driver4 {
		
		public static void analyzeEmployee(String employeeId) {
			
			int hash = employeeId.hashCode();
			int spreadHash = hash ^ (hash >>> 16);
			int bucketNumber = spreadHash & 15;

			System.out.println("Employee Id : " + employeeId);
			System.out.println("Hash : " + hash);
			System.out.println("Spread Hash : " + spreadHash);
			System.out.println("Bucket Number : " + bucketNumber);
			
			if(bucketNumber >= 0 && bucketNumber <=7) {
				System.out.println("Bucket Type : Lower Half Bucket");
			}else {
				System.out.println("Bucket Type : Upper Half Bucket");
			}
			System.out.println("========================");
	}

	public static void main(String[] args) {
		analyzeEmployee("EMP101");
        analyzeEmployee("EMP205");
        analyzeEmployee("EMP309");
        analyzeEmployee("EMP412");
        analyzeEmployee("EMP518");
	}

}
