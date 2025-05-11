package com.project.coursecatalog

// Data model for a course

data class Course(
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
) 