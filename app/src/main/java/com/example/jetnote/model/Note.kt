package com.example.jetnote.model

import androidx.room.*
import java.sql.Date
import java.time.Instant
import java.util.*

@Entity(tableName = "notes_tbl")
data class Note(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),

    @ColumnInfo(name = "note_title")
    val title: String,

    @ColumnInfo(name = "note_description")
    val description: String,

//    @TypeConverters(CategoryConverter::class)
    @ColumnInfo(name = "note_entry_date")
    val entryDate: String = Date.from(Instant.now()).toString()
)
