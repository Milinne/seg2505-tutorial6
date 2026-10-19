
package com.example.recyclerviewlab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] subjects = {
                "SEG2505 - Software Engineering",
                "ITI1520 - Introduction to Computing",
                "MAT1722 - Calculus",
                "CSI2110 - Data Structures",
                "CSI2532 - Databases",
                "CEG2536 - Computer Architecture",
                "MAT1348 - Discrete Mathematics",
                "CSI2510 - Algorithms"
        };

        RecyclerView recyclerView =
                findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        CustomAdapter adapter = new CustomAdapter(subjects);
        recyclerView.setAdapter(adapter);
    }
}
