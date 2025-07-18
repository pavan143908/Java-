// created on 18/07/2025

package oopsLevel2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line1", "hyderabad", "25364");

		Customer customer = new Customer("pavan", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("line2", "andhra", "123456");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
//name :pavan Homeaddress:line1 hyderabad 25364   workAddress:null
// name :pavan Homeaddress:line1 hyderabad 25364   workAddress:line2 andhra 123456
