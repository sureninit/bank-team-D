// Team D
package com.vastika.teamd.bank.uia;

import java.util.Scanner;

import com.vastika.teamd.bank.controller.BankController;

public class BankUia {

	public static void main(String[] args) {
		BankController bankController = new BankController();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for open Account, Enter 2 for deposit amount");
		String choice = input.nextLine();
		switch (choice) {
		case "1":
			bankController.BankAccountInfo(input);
			break;
		case "2":
			bankController.amountDeposit(input);
			
			break;

		default:
			break;
		}
		

	}

}
