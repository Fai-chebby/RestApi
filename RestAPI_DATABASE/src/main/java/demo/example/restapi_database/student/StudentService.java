package demo.example.restapi_database.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "FAITH",
                        "CHEBETF034@GMAIL",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21

                )
        );
    }
}
