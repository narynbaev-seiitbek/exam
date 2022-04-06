package exam.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Seitbek", "0701199959");
        Customer customer2 = new Customer("Azat", "08sddfsdf");

        greetCustomerBuConsumer.accept(customer1);
        greetCustomerByConsumerV2.accept(customer1, false);
        getCustomerV2(customer1,true);
        greetCustomerByConsumerV2.accept(customer2,true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerByConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.name+", thanks for registration number "
                    +(showPhoneNumber ? customer.phoneNumber : "**********"));

    static Consumer<Customer> greetCustomerBuConsumer = customer ->
            System.out.println("Hello "+customer.name+" thanks for registration number "+customer.phoneNumber);

    public static void getCustomer(Customer customer) {
        System.out.println("Hello "+customer.name+" thanks for registration number "+customer.phoneNumber);
    }

    public static void getCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello "+customer.name+", thanks for registration number "
                +(showPhoneNumber ? customer.phoneNumber : "**********"));
    }





static class Customer {
        private String name;
        private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

}

