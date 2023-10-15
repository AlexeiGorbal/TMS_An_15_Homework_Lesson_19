package com.example.tms_an_15_homework_lesson_19

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NoteViewHolder(view: View) : ViewHolder(view) {
    val title = view.findViewById<AppCompatTextView>(R.id.title)
    val text = view.findViewById<AppCompatTextView>(R.id.text)
    val data = view.findViewById<AppCompatTextView>(R.id.data)
}