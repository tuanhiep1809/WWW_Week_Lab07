package vn.edu.iuh.fit.www_week_lab07;

import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_week_lab07.backend.enums.EmployeeStatus;
import vn.edu.iuh.fit.www_week_lab07.backend.enums.ProductStatus;
import vn.edu.iuh.fit.www_week_lab07.backend.models.*;
import vn.edu.iuh.fit.www_week_lab07.backend.repositories.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductImageRepository productImageRepository;
    @Autowired
    private ProductPriceRepository  productPriceRepository;
//    @Bean
//    CommandLineRunner createListProPrice(){
//        return args -> {
//            for(int i=0;i<10;i++){
//                ProductPrice pp = new ProductPrice(
//
//                        new Product(i+211),
//                                LocalDateTime.of(2021,10,10,10,10+i,10),
//                                1000+i,
//                                "note"+i
//                );
//                productPriceRepository.save(pp);
////                System.out.println(pp);
//            }
//        };
//    }
//    @Bean
//    CommandLineRunner createListProImage(){
//        return args -> {
//            for(int i=0;i<10;i++){
//                ProductImage pi = new ProductImage(
//                        "aaaaPath"+i,
//                        "aaaaalternative"+i,
//                        new Product(i+211)
//                );
//               productImageRepository.save(pi);
//            }
//        };
//    }
//    @Bean
//    CommandLineRunner createListOrder(){
//        return args -> {
//            for(int i=0;i<10;i++){
//                Order order = new Order(
//                        LocalDateTime.of(2021,10,10,10,10,10),
//                       new Employee(i+11),
//                        new Customer(i+1)
//                        );
//                orderRepository.save(order);
//            }
//        };
//    }
//    @Bean
//    CommandLineRunner createListEmp(){
//        return args -> {
//            for(int i=0;i<10;i++){
//                Employee employee = new Employee(
//                        "hiep"+i,
//                        LocalDate.of(1999,10,10),
//                        "HiepEmp"+i+"@gmail.com",
//                        "0123456789",
//                        "hcm",
//                        EmployeeStatus.ACTIVE
//                        );
//
//               employeeRepository.save(employee);
//            }
//        };
//    }

//    @Bean
//    CommandLineRunner createListCus(){
//        return args -> {
//            for(int i=0;i<10;i++){
//                Customer customer = new Customer(
//                        "hiep"+i,
//                        "hiep"+i+"@gmail.com",
//                        "0123456789",
//                        "hcm"
//                );
//                customerRepository.save(customer);
//            }
//        };
//    }

//        @Bean
//        CommandLineRunner createSampleProducts(){
//        return args -> {
//            Faker faker =new Faker();
//            Random rnd = new Random();
//            Device devices = faker.device();
//            for (int i = 240; i < 400; i++) {
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

