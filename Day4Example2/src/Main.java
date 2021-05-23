import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Elif");
		customer.setLastName("Yanar");
		customer.setDateOfBirth(LocalDate.of(1999, 11, 02));
		customer.setNationalityId("19256567846");
		customerManager.Save(customer);
	}

}
