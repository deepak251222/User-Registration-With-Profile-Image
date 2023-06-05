package com.main.controller;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.main.Entity.User;
import com.main.Entity.UserLogin;
import com.main.service.UserServiceImpl;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/form")
	public String openform() {
		return "userform";
	}

	@PostMapping("/add")
	public ModelAndView registerUser(@ModelAttribute User user, @RequestParam("profile_picture") MultipartFile file)
			throws Exception {

		ModelAndView mv = null;
		String message = "";
		User user1 = null;
		if (!file.isEmpty()) {
			String image = file.getOriginalFilename();
			// chaging into byte extra

			System.out.println(image);
			user.setUser_profile_picture(image);
			System.out.print(file.getOriginalFilename());
			System.out.println("before service" + user);
			user1 = userService.add(user);
			String u1 = user.getUser_profile_picture();
			if (u1 != null) {
				try {
					System.out.println(new ClassPathResource("").getFile().getAbsolutePath());
					Path path = Path.of("d:" , "Spring Boot", "UserRegistration", "imgs",file.getOriginalFilename());
					Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
					System.out.println("path" + path);
					System.out.println(path.toUri());
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
			message="insertion is sucessFull";
			return new ModelAndView("status", "message", message);
		}

         message="insertion is falire";
		return new ModelAndView("status", "message", message);

	}
	
	/// retrib=ve 
	
	//Path path = Path.of("d:" , "Spring Boot", "UserRegistration", "imgs",file.getOriginalFilename());
	

	// **** User Login *****

	public ModelAndView login(@ModelAttribute UserLogin userlogin) {

		User user = new User();
		String message = "";
		if (user.getUemail() == userlogin.getUlemail() && user.getUpwd() == userlogin.getUlpwd()) {
			return new ModelAndView("userDetails", "user", user);
		} else {
			message = "User not Existed";
			return new ModelAndView("status", "message", message);
		}
	}

}
