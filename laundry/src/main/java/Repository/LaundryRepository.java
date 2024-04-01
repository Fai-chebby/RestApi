package Repository;

import demo.example.laundry.LaundryApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaundryRepository extends JpaRepository <LaundryApplication,String>{
}
