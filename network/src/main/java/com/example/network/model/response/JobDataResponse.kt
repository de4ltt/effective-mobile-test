package com.example.network.model.response

data class JobDataResponse(
    val offers: List<OfferResponse>,
    val vacancies: List<VacancyResponse>
)