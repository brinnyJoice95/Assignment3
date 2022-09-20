package Assignment;

import org.apache.poi.ss.formula.functions.Fixed;

public class BankInfo {
/****	Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank****/
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("It shows the Saving");

	}
      public void fixed() {
		// TODO Auto-generated method stub
    	  System.out.println("It shows the Fixed Deposit");

	}
      public void deposit() {
		// TODO Auto-generated method stub
    	  System.out.println("It shows the Deposit balance" );

	}
      public static void main(String[] args) {
    	  BankInfo bnk1 =new BankInfo();
    	  bnk1.deposit();
	}

}
