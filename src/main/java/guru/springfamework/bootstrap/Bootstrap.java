package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 9/24/17.
 */
@Component
public class Bootstrap implements CommandLineRunner{

    private CategoryRepository categoryRespository;
    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRespository, CustomerRepository customerRepository) {
        this.categoryRespository = categoryRespository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRespository.save(fruits);
        categoryRespository.save(dried);
        categoryRespository.save(fresh);
        categoryRespository.save(exotic);
        categoryRespository.save(nuts);


        System.out.println("Data Loaded = " + categoryRespository.count() );

        loadCustomersData();

    }

    private void loadCustomersData() {
        Customer michael = new Customer();
        michael.setFirstname("Michael");
        michael.setLastname("Lachappele");

        Customer david = new Customer();
        david.setFirstname("David");
        david.setLastname("Winter");

        Customer alice = new Customer();
        alice.setFirstname("Alice");
        alice.setLastname("Eastman");

        Customer mercury = new Customer();
        mercury.setFirstname("Mercury");
        mercury.setLastname("Freddy");

        Customer marc = new Customer();
        marc.setFirstname("marc");
        marc.setLastname("Meyers");

        Customer max = new Customer();
        max.setFirstname("Max");
        max.setLastname("Mustermann");

        Customer marcWinter = new Customer();
        marcWinter.setFirstname("marc");
        marcWinter.setLastname("Winter");

        Customer bob = new Customer();
        bob.setFirstname("Bob");
        bob.setLastname("Winter");

        Customer musterman2N = new Customer();
        musterman2N.setFirstname("Max");
        musterman2N.setLastname("Musterman2n");

        Customer winter = new Customer();
        winter.setFirstname("Bob");
        winter.setLastname("Winter");

        customerRepository.save(michael);
        customerRepository.save(david);
        customerRepository.save(alice);
        customerRepository.save(mercury);
        customerRepository.save(marc);
        customerRepository.save(max);
        customerRepository.save(marcWinter);
        customerRepository.save(bob);
        customerRepository.save(musterman2N);

        System.out.println("Data Loaded = " + customerRepository.count() );
    }
}
