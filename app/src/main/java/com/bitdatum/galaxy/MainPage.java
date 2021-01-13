package com.bitdatum.galaxy;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainPage extends AppCompatActivity {
    private ImageView Image;
    private TextInputEditText username,password;
    private TextInputLayout usernameBox,passwordBox;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpagelogin);

        Image = findViewById(R.id.loginSubmit);
        username = findViewById(R.id.username_field);
        password = findViewById(R.id.password_field);
        usernameBox = findViewById(R.id.username_box);
        passwordBox = findViewById(R.id.password_box);

        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainmenu = new Intent(MainPage.this,Menu.class);
                startActivity(mainmenu);
                finish();
            }
        });
    }
}
