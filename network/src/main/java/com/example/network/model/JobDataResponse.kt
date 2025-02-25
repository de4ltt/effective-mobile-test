package com.example.network.model

data class JobDataResponse(
    val offers: List<OfferResponse>,
    val vacancies: List<VacancyResponse>
)