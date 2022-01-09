package com.example.asj_project_main

val HEALTH_EXTRA = "bookExtra"
var healthcareList = mutableListOf<healthcare>()
class healthcare (
    var cover: Int,
    var title:String,
    var info: String,
    val id: Int? = healthcareList.size
    )