package pl.krzysiek.spring.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.spring.pma.dao.IEmployeeRepository;
import pl.krzysiek.spring.pma.entities.Employee;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    IEmployeeRepository empRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {

        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Model model, Employee employee) {

        empRepo.save(employee);
        return "redirect:/employees/new";
    }
}
