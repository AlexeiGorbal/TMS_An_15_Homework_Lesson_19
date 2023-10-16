package com.example.tms_an_15_homework_lesson_19

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.text.SimpleDateFormat

class NoteViewHolder(view: View) : ViewHolder(view) {

    private val title = view.findViewById<AppCompatTextView>(R.id.title)
    private val text = view.findViewById<AppCompatTextView>(R.id.text)
    private val data = view.findViewById<AppCompatTextView>(R.id.data)

    private val formatter = SimpleDateFormat("dd.MM.yyyy hh:mm")

    fun bind(note: Note) {
        title.text = note.title
        text.text = note.text
        data.text = formatter.format(note.date)
    }

    companion object {
        fun from(parent: ViewGroup): NoteViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_note, parent, false
            )
            return NoteViewHolder(view)
        }
    }
}