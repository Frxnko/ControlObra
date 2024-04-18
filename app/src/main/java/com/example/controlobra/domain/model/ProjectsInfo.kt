package com.example.controlobra.domain.model

data class ProjectsInfo(
    val code: String,
    val site: String,
    val nodeType: String,
    val latitude: Double?,
    val longitude: Double?,
    val txNodeAssociated: String,
    val bathAssociated: String?,
    val aprovedCandidateRFT: String?,
    val towerStatus: String?,
    val towerHeight: Int?,
    val towerType: String?,
    val towerSupplier: String?
)