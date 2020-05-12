package com.aulaspraticas.Aula1.repository

import com.aulaspraticas.Aula1.domain.Task
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : MongoRepository<Task, String>