package pl.krzysiek.spring.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.krzysiek.spring.pma.dao.IProjectRepository;
import pl.krzysiek.spring.pma.entities.Project;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectRepository proRepo;

    @GetMapping
    public String displayProjects(Model model) {
        List<Project> projects = proRepo.findAll();
        model.addAttribute("projects", projects);
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model){

        Project aProject = new Project();
        model.addAttribute("project", aProject);

        return"projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Model model, Project project){
        proRepo.save(project);

        return "redirect:/projects/new";
    }
}
