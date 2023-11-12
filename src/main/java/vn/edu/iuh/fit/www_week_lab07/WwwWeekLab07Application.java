package vn.edu.iuh.fit.www_week_lab07;

import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_week_lab07.backend.enums.ProductStatus;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Customer;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Product;
import vn.edu.iuh.fit.www_week_lab07.backend.repositories.CustomerRepository;
import vn.edu.iuh.fit.www_week_lab07.backend.repositories.ProductRepository;

import java.util.Random;

@SpringBootApplication
public class WwwWeekLab07Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwWeekLab07Application.class, args);
    }


    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Bean
    CommandLineRunner createListCus(){
        return args -> {
            for(int i=0;i<10;i++){
                Customer customer = new Customer(
                        "hiep"+i,
                        "hiep"+i+"@gmail.com",
                        "0123456789",
                        "hcm"
                );
                customerRepository.save(customer);
            }
        };
    }

//        @Bean
//        CommandLineRunner createSampleProducts(){
//        return args -> {
//            Faker faker =new Faker();
//            Random rnd = new Random();
//            Device devices = faker.device();
//            for (int i = 0; i < 10; i++) {
//                Product product =new Product(
//                        devices.modelName(),
//                        faker.lorem().paragraph(30),
////                        rnd.nextInt(10)%2==0?"Kg":"piece",
//                        "piece",
//                        devices.manufacturer(),
//                        ProductStatus.ACTIVE
//                );
//                productRepository.save(product);
//            }
//        };
//    }
}

