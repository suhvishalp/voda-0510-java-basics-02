
public class HasARelationshipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(101, "Mohit");
		
		Address add1 = new Address();
		add1.setAddressLine1("Avenue7, D101, Ravet");
		add1.setAddressLine2("Near Sentosa Resort");
		add1.setArea("Ravet");
		add1.setPinCode("412101");
		add1.setCity("Pune");

		Address add2 = new Address();
		add2.setAddressLine1("Runal Gateway");
		add2.setAddressLine2("D 104, Near Sentosa Resort");
		add2.setArea("Wakad");
		add2.setPinCode("412101");
		add2.setCity("Pune");
		
		customer.addNewAddress(add1);
		customer.addNewAddress(add2);
		
		
		Address[] addresses = customer.getAddresses();
		System.out.println(addresses[0].getAddressLine1());
		System.out.println(addresses[1].getAddressLine1());
	}

}
