package eci.ieti.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import eci.ieti.data.model.Customer;

import java.util.List;

public interface UserRepository extends MongoRepository<Customer, String> {

    User findByName(String name);

    List<User> findByEmail(String email);

}