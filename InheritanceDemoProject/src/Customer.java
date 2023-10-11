
public class Customer {

	private int custId;
	private String name;
	private Address[] addresses;
	private static int addressCount;
	
	public Customer() {
		super();
		this.addresses = new Address[10];
	}

	public Customer(int custId, String name) {
		this();
		this.custId = custId;
		this.name = name;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	
	public void addNewAddress(Address address) {
		this.addresses[addressCount] = address;
		addressCount++;
	}
	
	
}
