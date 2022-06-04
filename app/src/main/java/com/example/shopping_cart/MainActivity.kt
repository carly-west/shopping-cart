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
//        Setting up all the variables
        var enterItemButton = findViewById<Button>(R.id.enter_item_button)
        var removeItemButton = findViewById<Button>(R.id.remove_item_button)
        var itemInput = findViewById<EditText>(R.id.add_item_input)
        var itemList = findViewById<TextView>(R.id.item_list)
        var items: MutableList<String> = mutableListOf()



        enterItemButton.setOnClickListener {
//            Puts the input to a variable string
            var string = itemInput.text.toString()

//            Capitalizes the first letter of the string and adds it to the items list
            items.add(string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

//            Puts the item list to the textview
            itemList.text = items.toString()

//            Clears the input field
            itemInput.text.clear()
        }

        removeItemButton.setOnClickListener {
//            Puts the input to a variable string
            var string = itemInput.text.toString()

//            Capitalizes the first letter of the string and removes it from the items list
            items.remove(string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

//            Puts the item list to the textview
            itemList.text = items.toString()

//            Clears the input field
            itemInput.text.clear()
        }



    }
}