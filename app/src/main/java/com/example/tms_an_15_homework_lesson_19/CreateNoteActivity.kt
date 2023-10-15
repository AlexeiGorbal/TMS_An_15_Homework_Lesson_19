package com.example.tms_an_15_homework_lesson_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import java.util.Date

class CreateNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_note)

        val button = findViewById<AppCompatButton>(R.id.button)
        button.setOnClickListener {
            val titleView = findViewById<AppCompatEditText>(R.id.title)
            val title = titleView.text.toString()
            val textView = findViewById<AppCompatEditText>(R.id.text)
            val text = textView.text.toString()
            val date = Date(System.currentTimeMillis())
            if (title.isBlank()) {
                titleView.error = "Empty title"
            }
            if (text.isBlank()) {
                textView.error = "Empty text"
            }
            if (!title.isBlank() && !text.isBlank()) {
                val note = Note(title, text, date)
                val intent = Intent()
                intent.putExtra("note", note)
                setResult(101, intent)
                finish()
            }
        }
    }
}
