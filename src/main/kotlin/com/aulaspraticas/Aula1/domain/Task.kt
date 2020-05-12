package com.aulaspraticas.Aula1.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Task(@Id val id: String? = null,
                val description: String,
                val summary: String,
                val createdAt: Date,
                val taskNumber: Number)