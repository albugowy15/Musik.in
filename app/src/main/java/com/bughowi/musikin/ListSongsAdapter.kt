package com.bughowi.musikin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListSongsAdapter(private val listSongs: ArrayList<Songs>) : RecyclerView.Adapter<ListSongsAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvSongsTitle: TextView = itemView.findViewById(R.id.tv_songs_title_list)
        var tvSongsArtist: TextView = itemView.findViewById(R.id.tv_songs_artist_list)
        var imgArtist: ImageView = itemView.findViewById(R.id.iv_songs_artist_list)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_songs, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val songs = listSongs[position]

        Glide.with(holder.itemView.context).load(songs.artist_cover).into(holder.imgArtist)

        holder.tvSongsTitle.text = songs.title
        holder.tvSongsArtist.text = songs.artist
        holder.itemView.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, SongsDetail::class.java)

            intent.putExtra("KEY BUAT GAMBAR", holder.bindingAdapterPosition)
            intent.putExtra("KEY BUAT TITLE", holder.tvSongsTitle.text)
            intent.putExtra("KEY BUAT ARTIST", holder.tvSongsArtist.text)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listSongs.size
    }
}