package com.example.shopping_cart

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var enterItemButton = findViewById<Button>(R.id.enter_item_button)
        var removeItemButton = findViewById<Button>(R.id.remove_item_button)
        var itemInput = findViewById<EditText>(R.id.add_item_input)
        var itemList = findViewById<TextView>(R.id.item_list)
        var items: MutableList<String> = mutableListOf()



        enterItemButton.setOnClickListener {
            var string = itemInput.text.toString()
            items.add(string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
            itemList.text = items.toString()
            itemInput.text.clear()
        }

        removeItemButton.setOnClickListener {
            var string = itemInput.text.toString()
            items.remove(string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
            itemList.text = items.toString()
            itemInput.text.clear()
        }



    }
}