package com.techelevator;

import com.techelevator.view.Menu;

public class VendingMachineCLI {





	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };


	 private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
		private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
		private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
		private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};



	private Menu menu;

	public VendingMachineCLI(Menu menu) {

		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				//display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				} while (true) {

				String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				 if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				// feed vending machine money
			 } else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				// select the product
				} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION));

				 if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				//feed vending machine money
			} else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
				// select the product
					 } else if (purchaseChoice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION));
				 // finish transaction
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
