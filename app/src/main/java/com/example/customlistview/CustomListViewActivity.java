package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {
ListView customListView;
//    String[] dataArray = {"One","Two","Three","Four","Five","Six","Seven","Eight","One","Two",
//            "Three","Four","Five","Six","Seven","Eight","One","Two","Three","Four","Five",
//            "Six","Seven","Eight"};
    String[] dataArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView=findViewById(R.id.custom_list_view);

        CustomListAdapter adapter = new CustomListAdapter(this, dataArray);

        customListView.setAdapter(adapter);

    }
}