package com.example.tms_an_15_homework_lesson_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle = findViewById<RecyclerView>(R.id.recyclerView)
        recycle.layoutManager = LinearLayoutManager(this)
        val adapter = NoteAdapter()
        recycle.adapter = adapter

        val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val note = it.data?.getParcelableExtra<Note>("note")
            if (note != null) {
                adapter.addNote(note)
            }
        }

        val button = findViewById<AppCompatButton>(R.id.button)
        button.setOnClickListener {
            launcher.launch(Intent(this, CreateNoteActivity::class.java))
        }
    }
}