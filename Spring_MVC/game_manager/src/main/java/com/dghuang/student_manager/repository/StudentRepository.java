//Java object that can be used to interact directly with the student table in postgreSQL

package com.dghuang.student_manager.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dghuang.student_manager.entity.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, String> {
	
}