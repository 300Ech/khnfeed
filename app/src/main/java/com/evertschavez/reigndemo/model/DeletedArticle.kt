package com.evertschavez.reigndemo.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class DeletedArticle (
    @Id(assignable = true) var id: Long = 0
)