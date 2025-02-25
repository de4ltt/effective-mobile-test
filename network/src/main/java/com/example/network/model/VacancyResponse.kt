package com.example.network.model

data class VacancyResponse(
    val id: String,
    val lookingNumber: Int?,
    val title: String,
    val address: AddressResponse,
    val company: String,
    val experience: ExperienceResponse,
    val publishedDate: String,
    val isFavorite: Boolean,
    val salary: Salary,
    val schedules: List<String>,
    val appliedNumber: Int?,
    val description: String?,
    val responsibilities: String?,
    val questions: List<String>?
)