package com.renaultivo.todo

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val todoScrollList: LinearLayout = findViewById(R.id.todoScrollList);
        val buttonAdd: Button = findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener {
            TODO("implement [add todo] screen")
        }

    }

}