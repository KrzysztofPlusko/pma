package pl.krzysiek.spring.pma.dao;

import org.springframework.data.repository.CrudRepository;
import pl.krzysiek.spring.pma.entities.Project;

import java.util.List;

public interface IProjectRepository extends CrudRepository<Project, Long > {

    @Override
    List<Project> findAll();
}
