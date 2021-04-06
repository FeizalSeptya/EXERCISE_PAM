package com.example.exercise1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exercise1.R;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = edEmail.getText().toString();
                String Password = edPassword.getText().toString();
                if (Email.equals("admin@mail.com") && Password.equals("123456")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();


                    if (TextUtils.isEmpty(email)) {
                        edEmail.setError("Email tidak boleh kosong");
                    }

                    else if (TextUtils.isEmpty(password)) {
                        edPassword.setError("Password tidak boleh kosong");
                    }

                    email = edEmail.getText().toString();

                    password = edPassword.getText().toString();

                    String email = "admin@mail.com";

                    String pass = "123456";

                    Toast t = Toast.makeText(getApplicationContext(),
                            "email anda: " + email + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", email.trim());

                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), DaftarActivity.class);

                    i.putExtras(b);

                    startActivity(i);
                } else if (!Email.equals("admin@mail.com") && Password.equals("123")) {
                    Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG).show();
                } else if (Email.equals("admin@mail.com") && !Password.equals("123")) {
                    Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Email dan Password salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mnDaftar) {

            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}









