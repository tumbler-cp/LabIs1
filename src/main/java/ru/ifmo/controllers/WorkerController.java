package ru.ifmo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ifmo.model.Worker;
import ru.ifmo.service.WorkerService;

@Controller
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers")
    public String listWorkers(Model model) {
        model.addAttribute("workers", workerService.findAll());
        return "workers";
    }

    @GetMapping("/workers/new")
    public String createWorkerForm(Model model) {
        model.addAttribute("worker", new Worker());
        return "create_worker";
    }

    @PostMapping("/worker")
    public String saveWorker(@ModelAttribute("worker") Worker worker) {
        workerService.save(worker);
        return "redirect:/workers";
    }
}
