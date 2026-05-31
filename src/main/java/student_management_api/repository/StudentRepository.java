package student_management_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student_management_api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
