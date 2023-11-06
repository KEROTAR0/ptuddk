package vn.edu.dlu.ctk45.calories_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MucTieu extends Activity {
    private TextView goalTextView;
    private int currentGoal = 0;
    private String[] goals = {"Tăng cân", "Giảm cân", "Cân bằng"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muc_tieu);

        goalTextView = findViewById(R.id.goal_textview);
        goalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentGoal = (currentGoal + 1) % goals.length;
                goalTextView.setText(goals[currentGoal]);
            }
        });
    }
}