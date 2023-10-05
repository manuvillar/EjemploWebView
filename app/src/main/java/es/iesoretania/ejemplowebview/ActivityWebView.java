package es.iesoretania.ejemplowebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import es.iesoretania.ejemplowebview.databinding.ActivityMainBinding;
import es.iesoretania.ejemplowebview.databinding.ActivityWebViewBinding;

public class ActivityWebView extends AppCompatActivity {
    private ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String URL = getIntent().getStringExtra("url");

        binding.webviewid.setWebViewClient(new WebViewClient());
        binding.webviewid.loadUrl("https://"+URL);
    }
}