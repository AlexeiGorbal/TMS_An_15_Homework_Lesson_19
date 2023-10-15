package com.example.tms_an_15_homework_lesson_19

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.text.SimpleDateFormat

class NoteAdapter : Adapter<NoteViewHolder>() {

    private val list = mutableListOf<Note>()

    fun addNote(note: Note) {
        list.add(note)
        notifyItemInserted(list.lastIndex)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = list[position]
        holder.bind(note)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}