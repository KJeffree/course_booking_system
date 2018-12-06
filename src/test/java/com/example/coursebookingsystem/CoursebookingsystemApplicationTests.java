package com.example.coursebookingsystem;

import com.example.coursebookingsystem.models.Booking;
import com.example.coursebookingsystem.models.Course;
import com.example.coursebookingsystem.models.Customer;
import com.example.coursebookingsystem.repositories.BookingRepositories.BookingRepository;
import com.example.coursebookingsystem.repositories.CourseRepositories.CourseRepository;
import com.example.coursebookingsystem.repositories.CustomerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingsystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canMakeBookingsCustomersAndCourses(){
		Course course = new Course("Java", "Edinburgh", 5);
		courseRepository.save(course);
		Customer customer = new Customer("Nyalls", "Leeds", 22);
		customerRepository.save(customer);
		Booking booking = new Booking("12/03/2018", customer, course);
		bookingRepository.save(booking);
		}


}
