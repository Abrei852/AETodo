package com.ae.aetodo.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ae.aetodo.R
import com.ae.aetodo.ui.adapter.TodoRecyclerViewAdapter

/**
 * A fragment representing a list of Items.
 */
class TodosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_todo_list, container, false)

        return view
    }

}