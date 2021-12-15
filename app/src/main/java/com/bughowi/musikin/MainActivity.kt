package com.bughowi.musikin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvSongs: RecyclerView
    private var list: ArrayList<Songs> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSongs = findViewById(R.id.rv_songs)
        rvSongs.setHasFixedSize(true)

        list.addAll(SongsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            (R.id.account) -> {
                val moveIntent = Intent(this@MainActivity, AuthorActivity::class.java)
                startActivity(moveIntent)
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    private fun showRecyclerList() {
        rvSongs.layoutManager = LinearLayoutManager(this)
        val listSongsAdapter = ListSongsAdapter(list)
        rvSongs.adapter = listSongsAdapter
    }
}