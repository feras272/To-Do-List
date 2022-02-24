package com.example.todolist.ui.tasks

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import com.example.todolist.R

class TasksFragment() : Fragment(R.layout.fragment_tasks), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TasksFragment> {
        override fun createFromParcel(parcel: Parcel): TasksFragment {
            return TasksFragment(parcel)
        }

        override fun newArray(size: Int): Array<TasksFragment?> {
            return arrayOfNulls(size)
        }
    }
}