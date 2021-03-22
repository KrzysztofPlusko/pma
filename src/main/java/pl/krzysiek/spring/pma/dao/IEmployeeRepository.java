package pl.krzysiek.spring.pma.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.spring.pma.entities.Employee;

import java.util.List;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    List<Employee> findAll();
}
