package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaExampleApplication {
  
	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootJpaExampleApplication.class, args);
	    UserRepository userRepository= context.getBean(UserRepository.class);
	     
	    User user=new User();
	    
	    user.setName("Ajay Kumar Rajput");
	    user.setCity("Farrukhabad");
	    user.setStatus("I am a programmer");
	    User user1=userRepository.save(user);
	    System.out.println(user1);
	
	}

}
