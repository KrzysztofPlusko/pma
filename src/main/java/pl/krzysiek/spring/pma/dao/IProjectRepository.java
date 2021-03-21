package pl.krzysiek.spring.pma.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.spring.pma.entities.Project;

public interface IProjectRepository extends CrudRepository<Project, Long > {
}
