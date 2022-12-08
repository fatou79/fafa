package com.fatou.OneToOne2;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToOne2.entity.Gender;
import com.fatou.OneToOne2.entity.User;
import com.fatou.OneToOne2.entity.UserProfile;
import com.fatou.OneToOne2.repository.UserProfileRepository;
import com.fatou.OneToOne2.repository.UserRepository;

@SpringBootApplication
public class OneToOne2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToOne2Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//user object
		User user = new User();
		user.setName("Fatou");
		user.setEmail("fdiopdiagne@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAdress("Sicap");
		userProfile.setBirthOfDate(LocalDate.of(1979, 05, 04));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhoneNumber("776415455");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
