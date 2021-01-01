package com.evertschavez.reigndemo.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

data class HnResponse(
    val nbHits: Int,
    val page: Int,
    val nbPages: Int,
    val hitsPerPage: Int,
    val exhaustiveNbHits: Boolean,
    val query: String,
    val params: String,
    val processingTimeMS: Int,
    val hits: List<Item>
)

@Entity
data class Item(
    @Id(assignable = true)
    var objectID: Long = 0,
    var created_at: String = "",
    var title: String? = null,
    var url: String? = null,
    var author: String = "",
    var points: String? = null,
    var story_text: String? = null,
    var comment_text: String? = null,
    var num_comments: String? = null,
    var story_id: Long = 0,
    var story_title: String? = "",
    var story_url: String? = null,
    var parent_id: Long = 0,
    var created_at_i: Long = 0,
    var elapsedTime: String = ""
)