package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "Did a lot of stuff!"),
            Note(title = "AWESOME", description = "HAD A GREAT DAY"),
            Note(title = "Kinda Meh", description = "Not a lot of things to do..."),
            Note(title = "Ok day", description = "Nothing out of the ordinary happened"),
            Note(title = "Casual day", description = "Got a lot of time to just chill"),
            Note(title = "Cold day", description = "I was literally freezing!"),
            Note(title = "Healthy day", description = "I started a diet :D"),
            Note(title = "Shit day", description = "Not feeling great about my diet :c"),
            Note(title = "Dieting is hard..", description = "I can't take this any longer, I need some junk food like RIGHT NOW!")
        )
    }
}