package ru.ifmo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ifmo.service.WorkerService;

@RestController
@RequestMapping("/api/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;

}
