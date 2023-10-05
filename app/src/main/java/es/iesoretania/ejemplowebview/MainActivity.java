package es.iesoretania.ejemplowebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import es.iesoretania.ejemplowebview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void irURL(View view) {
        Intent intent = new Intent(this, ActivityWebView.class);

        intent.putExtra("url",binding.editTextURL.getText().toString());

        startActivity(intent);
    }
}