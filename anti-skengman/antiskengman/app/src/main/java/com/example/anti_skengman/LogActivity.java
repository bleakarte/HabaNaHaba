package com.example.anti_skengman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LogActivity extends AppCompatActivity {
    private TextView tvSignIn;
    private Button btnSignIn;
    private TextView tvSignUp;
    private Button btnSignUp;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Totals totalsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        tvSignIn = findViewById(R.id.tvSignIn);
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogSignIn();
            }
        });
    }

    private void showDialogSignIn() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.signin);

        TextView tvSignIn = dialog.findViewById(R.id.tvSignIn);
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}