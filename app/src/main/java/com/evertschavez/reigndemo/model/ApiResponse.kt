package com.evertschavez.reigndemo.model

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

data class Item(
    val objectID: Long,
    val created_at: String,
    val title: String?,
    val url: String?,
    val author: String,
    val points: String?,
    val story_text: String?,
    val comment_text: String,
    val num_comments: String?,
    val story_id: Long,
    var story_title: String,
    val story_url: String?,
    val parent_id: Long,
    val created_at_i: Long,
    var elapsedTime: String
)