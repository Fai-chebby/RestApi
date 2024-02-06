package demo.example.restapi_database.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
   CommandLineRunner commandLineRunner(
           StudentRepository repository
   ){
       return args -> {
          Student FAITH= new Student(

                   1L,
                   "FAITH",
                   "CHEBETF034@GMAIL",
                   LocalDate.of(2002, Month.JANUARY,4)



           );
           Student ROP= new Student(
                   "ROP",
                   "ROPF034@GMAIL",
                   LocalDate.of(2005, Month.JANUARY,4)


           );
           repository.saveAll(List.of(FAITH,ROP));



       };
   }
}
