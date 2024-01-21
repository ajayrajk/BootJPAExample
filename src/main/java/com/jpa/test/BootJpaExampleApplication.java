package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
@EnableJpaRepositories
public class BootJpaExampleApplication {
  
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootJpaExampleApplication.class, args);
	    UserRepository userRepository= context.getBean(UserRepository.class);
	     
//	    User user=new User();
//	    
//	    user.setName("Ajay Kumar Rajput");
//	    user.setCity("Farrukhabad");
//	    user.setStatus("I am a programmer");
//	    // save user to our database 
//	    User user1=userRepository.save(user);
//	    System.out.println(user1);
	    
	    //create object of user
	    User user1=new User();
	    user1.setName("Kamlesh");
	    user1.setCity("City1");
	    user1.setStatus("Python Programmer");
	    
	    
	    User user2=new User();
	    user2.setName("Ajay");
	    user2.setCity("city2");
	    user2.setStatus("Java Programmer");
	    
	    //saving single user
	    //User resultUser=userRepository.save(user2);
	    
	    //saving multiple object 
//	   List<User> users=List.of(user1,user2);
//       Iterable<User> result=userRepository.saveAll(users);
//	    result.forEach(user->System.out.println(user)
//           );
//	    
	    
	    //System.out.println("Saved user "+resultUser);
//	    System.out.println("done");
	    
	    //update the user of id 52
//	    Optional<User> optional=userRepository.findById(52);
//	    User user= optional.get();
//	    user.setName("Kamlesh Rajput");
//
//	    User result= userRepository.save(user);
//	    System.out.println("Saved user" +result);

	    //delete by ID 
//	    userRepository.deleteById(52);
//	    System.out.println("deleted user");
//	    
	    //use of custom finder methods or Derived method
	    
	   List<User> users= userRepository.findbyName("Ajay");
	    users.forEach(user->System.out.println(user));
	    
	    
	    
	    
	    
	}

}
