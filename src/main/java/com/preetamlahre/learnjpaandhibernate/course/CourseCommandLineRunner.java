package com.preetamlahre.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.preetamlahre.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn Sql now ", "Ranga"));
		repository.save(new Course(2, "Learn Jpa now ", "ranga"));
		repository.save(new Course(3, "Learn Hibernate now", "preetam"));
		repository.save(new Course(4, "Learn devops now", "shao"));
		
//repository.deleteById(1l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(4l));
		
		System.out.println(repository.count());
		System.out.println(repository.findAll());
		System.out.println("here"+repository.findByAuthor("Ranga"));
		
		
				
		
				
		
	}

}
