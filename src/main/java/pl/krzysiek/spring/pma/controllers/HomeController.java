package pl.krzysiek.spring.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.krzysiek.spring.pma.dao.IEmployeeRepository;
import pl.krzysiek.spring.pma.dao.IProjectRepository;
import pl.krzysiek.spring.pma.entities.Employee;
import pl.krzysiek.spring.pma.entities.Project;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    IProjectRepository proRepo;

    @Autowired
    IEmployeeRepository empRepo;

    @GetMapping("/")
    public String displayHome(Model model) {

        List<Project> projectsList = proRepo.findAll();
        model.addAttribute("projectsList", projectsList);

        List<Employee> employeesList = empRepo.findAll();
        model.addAttribute("employeesList", employeesList);


        return "main/home";
    }
}
