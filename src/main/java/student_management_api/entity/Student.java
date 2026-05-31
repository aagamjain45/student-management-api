package student_management_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Students")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    @Size(min = 2)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Min(value = 3, message = "Age must be at least 3 years")
    @Max(value = 50, message = "Student can not be more than 50 years")
    private int age;

    @Column(nullable = false)
    private String course;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    @Size(min = 5, max = 100)
    private String address;

}
