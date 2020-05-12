package com.aulaspraticas.Aula1.api

import com.aulaspraticas.Aula1.domain.Task
import com.aulaspraticas.Aula1.service.TaskService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(value = ["/task"])
class TaskAPI(val taskService: TaskService) {

    @PostMapping
    fun create(@RequestBody task: Task): Task {
        return taskService.save(task)
    }

    @GetMapping
    fun findAll(): MutableList<Task> {
        return taskService.findAll()
    }

    @GetMapping(value = ["/{id}"])
    fun findById(@PathVariable("id") id: String): Optional<Task> {
        return taskService.findById(id)
    }
}