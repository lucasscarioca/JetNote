package com.example.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jetnote.model.Note
import com.example.jetnote.utils.DateConverter
import com.example.jetnote.utils.UUIDConverter

@Database(entities = [Note::class], version = 2, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {

        abstract fun noteDao(): NoteDatabaseDao

}