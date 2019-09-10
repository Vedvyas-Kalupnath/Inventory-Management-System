import java.util.Scanner;

/**
 * 
 */

/**
 * @author 
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Display a welcome message.
		System.out.println("     ______________________________________________________________________________       ");
		System.out.println("     | ******Welcome to inventory management system of Electronics LabInventory Store****** |      ");
		System.out.println("     |_____________________________________________________________________________|      ");
		Scanner keyboard = new Scanner(System.in);
		String Password = "DitProg123";  
		
		
		
	    String item_id ;
		String name ;
		String description ;
		String category;
		String supplier_name;
		int contact ;
		double price ;
		int quantity ;
		boolean loop1 = true;
		boolean loop2 = true;
		
		//Prompt the user for the maximum number of Items the store can contain.
		System.out.println(' ');
		System.out.println("______________________________________________________________________");
		System.out.println("First progam must know the maximum number of Items the store can contain.Please enter : ");
		int size = keyboard.nextInt();
		
		
		//Create an empty array, called itemDatabase that will have the potential of keeping track of created Item objects
		System.out.println("Please enter the number of Items you wish to have in  the store's database : ");
		int n = keyboard.nextInt();
		Item [] itemDatabase = new Item[n];
		System.out.println("______________________________________________________________________");
	
		
		
		while (loop1 == true)
		{
			int chance = 0 ;
			for(chance = 0; chance>=0;chance++)
			{   
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("______________________________________________________________________");
				System.out.println("| What do you want to do ? ");
				System.out.println("| 	  1. Enter a new Item to the inventory password required");
				System.out.println("| 	  2. Change information of an existing Item password required");
				System.out.println("|  	  3. Display all the Items with the specified category");
				System.out.println("|         4.Display all items to be re-ordered");
				System.out.println("| 	  5. Number of Items currently in store");
				System.out.println("|	  6. Quit");
				System.out.println("|_____________________________________________________________________");
				System.out.println(' ');
				System.out.print("Please enter your choice as numbers 1 to 6 only: ");
				System.out.println(" ");
				
				int option = keyboard.nextInt();
				
				//A user has a maximum of 3 attempts to enter the correct password. After the 3rd wrong attempt, main menu in figure one must be displayed again.
				
				if (option == 1) 
				{
					
					int index = 0 ;
					
				    for (index = 0 ;index <= 3 ;index += 1)
				    	
				    	
				    	//Prompt the use for his/her password. (use a constant to hold the password “DitProg123
				    {
						System.out.println("Enter password to continue:(Hint:DitProg123)");
						String password = keyboard.next();
						
						if (password.equalsIgnoreCase(Password)) 
						{
							System.out.println("Number of items you wish to have in  the item database is: " + n + ".  Enter again to confirm:");
							int l = keyboard.nextInt();
							
							if (l>n)
							{
								System.out.println("There is not enough space. Space is limited to "+ n +" only as entered above");
								System.out.println(" ");
								System.out.println("PROGRAM TERMINATED AND IS STARTING AGAIN. ");
								System.out.println("TO QUIT ENTER 6. ");
								System.out.println(" ");
								break;
								
							}
							
							
							//else if (n>l){
								//System.out.println(" This is impossible!!!!!!!!!!!!");
								//System.out.println("PROGRAM TERMINATED AND IS STARTING AGAIN. ");
								//break;
							//}
							
							
							
							//the correct password is entered, ask the user how many Items he/she wants to enter.
							itemDatabase = new Item[l];
							System.out.println(" ");
							System.out.println("Please enter item details for item you wish to add to database"); 
							
							
							int x ;
							int total= Item.totalitems();
							for (x=(total) ; x < l ; x ++)
							{ 	
								System.out.print("Enter item id: ");
								item_id = keyboard.next();
								 
								System.out.print("Enter item name:");
								name = keyboard.next();
								
								System.out.print("Enter item description: ");
								description = keyboard.next();
								
								System.out.print("Enter item category: ");
								category = keyboard.next();
								
								System.out.print("Enter item's supplier name: ");
								supplier_name = keyboard.next();
								
								System.out.print("Enter supplier contact(Integer value) : ");
								contact = keyboard.nextInt();
								
								System.out.print("Enter item price(Integer/Decimal value): ");
								price  = keyboard.nextDouble();
								
								System.out.print("Enter item quantity(Integer Value): ");
								quantity = keyboard.nextInt();
								System.out.println(" ");
								
								itemDatabase[x]= new Item(item_id, name, description, category, supplier_name, contact, price, quantity );
								itemDatabase[x].setItem_id(item_id);
								itemDatabase[x].setName(name);
								itemDatabase[x].setDescription(description);
								itemDatabase[x].setCategory(category);
								itemDatabase[x].setSupplier_name(supplier_name);
								itemDatabase[x].setContact(contact);
								itemDatabase[x].setPrice(price);
								itemDatabase[x].setQuantity(quantity);
								System.out.println(" ");
								
	
							}
							
							
							System.out.println("----|Details entered of item|------");
							for (int y=0; y<l ; y++ ) {
							 System.out.println("___________________________________________________________________");
							 
							 System.out.println(itemDatabase[y]);
							 
							 
						}
							
							break;
										
					}
						else if (!password.equalsIgnoreCase(Password))
						{
							
								System.out.println("Wrong password. Remaining chances: " +(3 - (index)) ); 
								if (index == 2) 
								{
									continue;
								}
								
							   	else if (chance == 3) 
							   		
							   	{
							   		System.out.println("Program detected suspicious activity and is terminating!!!!");				
							   		break;
							   		
							   	}
								
								
						 }
						
					}   
					    
				}
				
				
				if (option == 2) 
				{
					int count = 0 ;
				    for (count = 0 ;count < 3 ;count += 1) 
				    {
				    	while (loop2 == true) 
				    	{
							System.out.print("Enter password to continue:(Hint:DitProg123) ");
							String pass = keyboard.next();
							
							if (pass.equalsIgnoreCase(Password)) 
							{
									System.out.print("Please enter the item id you want to update : ");
									String id_input = keyboard.next();
									System.out.println("No such item foound!!!!!!"); 
									
									
									for (int i=0 ; i <n; i++ )
									{
											String q = itemDatabase[i].getItem_id();
									    if(id_input.equalsIgnoreCase(q)) 
									    {
		
								     	     System.out.println("Your searched item is:");
									         System.out.println(itemDatabase[i]);
									
										System.out.println("Item ID : " + itemDatabase[i].getItem_id());
										System.out.println("Name : " + itemDatabase[i].getName());
										System.out.println("Description : " + itemDatabase[i].getDescription());
										System.out.println("Category : " + itemDatabase[i].getCategory());
										System.out.println("Supplier Name : " + itemDatabase[i].getSupplier_name());
										System.out.println("Contact : " + itemDatabase[i].getContact());
										System.out.println("Price : " + itemDatabase[i].getPrice());
										System.out.println("Quantity : " + itemDatabase[i].getQuantity());
										
										System.out.println(" ");
										
									while(true) 
									{
											System.out.println("__________________________________");
											System.out.println("|What do you want to change ");
											System.out.println("|     1. Name ");
											System.out.println("|     2. Description "); 
											System.out.println("|     3. Category "); 
											System.out.println("|     4.Supplier Name "); 
											System.out.println("|     5.Supplier Contacts ");
											System.out.println("|     6.Price "); 
											System.out.println("|     7.Available qty"); 
											System.out.println("|     8.Quit" );
											System.out.println("|__________________________________");
											System.out.println("Please enter your selection:"); 
											int choice = keyboard.nextInt();
											if (choice == 1) 
											{
												System.out.print("New Name : ");
												name = keyboard.next();
												
												itemDatabase[i].setName(name);
												System.out.println(itemDatabase[i]);
											
											}
											else if (choice == 2 )
											{
												System.out.print("New Description : ");
												description = keyboard.next();
												
												itemDatabase[i].setDescription(description);
												System.out.println(itemDatabase[i]);
												
											}
											else if (choice == 3) 
											{
												System.out.print("New Category : ");
												category = keyboard.next();
												
												itemDatabase[i].setCategory(category);
												System.out.println(itemDatabase[i]);
												
											}
											else if (choice == 4) 
											{
												System.out.print("New Supplier Name : ");
												supplier_name = keyboard.next();
												
												itemDatabase[i].setSupplier_name(supplier_name);
												System.out.println(itemDatabase[i]);
											}
											else if(choice == 5)
											{
												System.out.print("New Supplier Contact : ");
												contact = keyboard.nextInt();
												
												itemDatabase[i].setContact(contact);
												System.out.println(itemDatabase[i]);
												
											}
											else if(choice == 6)
											{
												System.out.print("New Price : ");
												price = keyboard.nextDouble();
												
												itemDatabase[i].setPrice(price);
												System.out.println(itemDatabase[i]);										
											}
											else if(choice == 7) 
											{
												System.out.print("New Available quantity : ");
												quantity = keyboard.nextInt();
												
												itemDatabase[i].setQuantity(quantity);
												System.out.println(itemDatabase[i]);
											}
	
											else if(choice == 8)
											{
												loop2 = false;
												break;
											}
											else 
											{
											System.out.println("Invalid operation.Please input numbers 1 to 8 only!!!!!");
											break;
											}
											
								     }
									
								}
									    
							}
									
						}
							
							
							else if (!pass.equalsIgnoreCase(Password)) 
							{
								
								System.out.println("Wrong password. Remaining chances:" +(3 - (count+1)));
							}
						  loop2 = false;  
						  }
						    if (count == 2) 
						    
						    	break;				
						  }
				 
				    }
				if (option == 4) 
				{
					
				}
				if (option == 3)
					
					//You must display the information of all the Items with the specified category. (Hint: You may use a static method, called findItemByCat, which accepts a string for category and then performs the needed search).
				{
					System.out.print("Please enter Category of item to get its information :" );
					String input_cat = keyboard.next();
					
					for (int i=0; i <n; i++) 
					{
						String y = itemDatabase[i].getCategory();
					 if(input_cat.equalsIgnoreCase(y)) {
						 System.out.println(itemDatabase[i].finditembyCat());						
					}
		
				}
				}
				
				
				//When option 5 (in the main menu shown in figure. 1) is entered, display a count to show the number of Items which have been created so far.
				if (option == 5) 
				{
					System.out.print("The total number of items that has been created so far is: ");
					Item.totalitem();
				}
				
				//When option 6 (in the main menu shown in figure. 1) is entered, display a closing message and exit the program
				if(option == 6) 
				{
					System.out.println(" ");
					System.out.println("______________________________");
					System.out.println("       See you soon...        ");
					System.out.println("       End of Program         ");
					System.out.println("______________________________");
					loop1 = false;
					break;
				}

			}

		}

	}

}
