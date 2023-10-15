package com.example.tms_an_15_homework_lesson_19

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
data class Note(val title: String, val text:String, val date:Date): Parcelable

