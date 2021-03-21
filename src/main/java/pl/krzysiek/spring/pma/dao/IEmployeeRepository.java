package pl.krzysiek.spring.pma.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.spring.pma.entities.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
