package com.example.ecoecho.activity.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecoecho.R;
import com.example.ecoecho.activity.arvore.ArvoreActivity;
import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.data.source.local.AppDatabase;
import com.example.ecoecho.data.source.local.ArvoreDao;
import com.example.ecoecho.data.source.remote.ApiController;
import com.example.ecoecho.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainAdapter.OnItemClickListener {
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArvoreDao arvoreDao = AppDatabase.getDatabase(this).arvoreDao();
        MainPresenter presenter = new MainPresenter(this, new ApiController(), arvoreDao);

        adapter = new MainAdapter(this);
        binding.rvArvores.setAdapter(adapter);

        binding.toolbar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.sobre) {
                redirecionarSobre();
                return true;
            }

            if (item.getItemId() == R.id.atualizar) {
                presenter.buscarDadosApi();
                return true;
            }

            if (item.getItemId() == R.id.remover_anuncios) {
                redirecionarRemoverAnuncios();
                return true;
            }

            return false;
        });

        presenter.buscarArvores();
    }

    @Override
    public void onSelecionarArvore(int id) {
        Intent intent = new Intent(this, ArvoreActivity.class)
                .putExtra(ArvoreActivity.EXTRA_ARVORE_ID, id);

        startActivity(intent);
    }

    public void mostrarArvores(List<Arvore> arvores) {
        adapter.submitList(arvores);
    }

    private void redirecionarSobre() {

    }

    private void redirecionarRemoverAnuncios() {
        Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://youtu.be/dQw4w9WgXcQ?si=MCWiow5GN4zl9zyT"));
        startActivity(intent);
    }

    public void mostrarErro(String erro) {
        Toast.makeText(this, erro, Toast.LENGTH_SHORT).show();
    }
}