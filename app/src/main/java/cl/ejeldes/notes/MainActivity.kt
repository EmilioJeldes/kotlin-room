package cl.ejeldes.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.ejeldes.notes.adapter.NotesRecyclerAdapter
import cl.ejeldes.notes.model.Note
import cl.ejeldes.notes.util.VerticalSpacingDecorator

class MainActivity : AppCompatActivity() {

    // UI Components
    private lateinit var mRecyclerView: RecyclerView

    // Vars
    private lateinit var mNotesRecyclerAdapter: NotesRecyclerAdapter
    private var mNotes = mutableListOf<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

        insertFakeNotes()
    }

    fun initRecyclerView() {
        mNotesRecyclerAdapter = NotesRecyclerAdapter(mNotes)

        mRecyclerView = findViewById<RecyclerView>(R.id.recycler_container).apply {
            layoutManager = LinearLayoutManager(application)
            adapter = mNotesRecyclerAdapter
            addItemDecoration(VerticalSpacingDecorator(10))
            setHasFixedSize(true)
        }
    }

    private fun insertFakeNotes() {
        for (i in 1..1000) {
            mNotes.add(Note("Content #$i", "Title #$i", "Jan 2019"))
        }
        mNotesRecyclerAdapter.notifyDataSetChanged()
    }
}
