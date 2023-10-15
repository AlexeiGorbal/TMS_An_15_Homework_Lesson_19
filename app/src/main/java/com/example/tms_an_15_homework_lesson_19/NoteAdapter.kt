package com.example.tms_an_15_homework_lesson_19

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.text.SimpleDateFormat

class NoteAdapter : Adapter<NoteViewHolder>() {

    private val list = mutableListOf<Note>()
    private val formatter = SimpleDateFormat("dd.MM.yyyy hh:mm")

    fun addNote(note: Note) {
        list.add(note)
        notifyItemInserted(list.lastIndex)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_note, parent, false
        )
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = list[position]
        holder.title.text = note.title
        holder.text.text = note.text
        holder.data.text = formatter.format(note.date)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}