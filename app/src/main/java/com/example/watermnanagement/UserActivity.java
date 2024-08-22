package com.example.watermnanagement;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.watermnanagement.R;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        // Example: Handle button clicks
        Button waterUsageButton = findViewById(R.id.waterUsageButton);
        Button alertsButton = findViewById(R.id.alertsButton);
        Button settingsButton = findViewById(R.id.settingsButton);

        waterUsageButton.setOnClickListener(view -> {
            // Navigate to Water Usage Activity
            // startActivity(new Intent(UserDashboardActivity.this, WaterUsageActivity.class));
        });

        alertsButton.setOnClickListener(view -> {
            // Navigate to Alerts Activity
            // startActivity(new Intent(UserDashboardActivity.this, AlertsActivity.class));
        });

        settingsButton.setOnClickListener(view -> {
            // Navigate to Settings Activity
            // startActivity(new Intent(UserDashboardActivity.this, SettingsActivity.class));
        });
    }
}
