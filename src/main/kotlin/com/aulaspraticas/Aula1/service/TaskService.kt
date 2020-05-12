package com.aulaspraticas.Aula1.service

import com.aulaspraticas.Aula1.domain.Task
import com.aulaspraticas.Aula1.repository.TaskRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskService(val taskRepository: TaskRepository) {

    fun findAll(): MutableList<Task> {
        return taskRepository.findAll()
    }

    fun findById(id: String): Optional<Task> {
        return taskRepository.findById(id)
    }

    fun save(task: Task): Task {
        return taskRepository.save(task)
    }

    fun delete(task: Task) {
        taskRepository.delete(task)
    }

    fun delete(id: String) {
        taskRepository.deleteById(id)
    }
}