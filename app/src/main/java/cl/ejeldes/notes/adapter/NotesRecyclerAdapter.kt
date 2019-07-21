package cl.ejeldes.notes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.ejeldes.notes.R
import cl.ejeldes.notes.model.Note

/**
 * Created by ejeldes on Jul 20, 2019
 */
class NotesRecyclerAdapter(val myNotes: List<Note>) : RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_note_list_item, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.timestamp.text = myNotes[position].timestamp
        holder.title.text = myNotes[position].title
    }

    override fun getItemCount(): Int = myNotes.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.note_title)
        var timestamp: TextView = view.findViewById(R.id.notes_timestamp)
    }
}