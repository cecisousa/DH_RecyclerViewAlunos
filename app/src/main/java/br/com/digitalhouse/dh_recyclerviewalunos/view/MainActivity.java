package br.com.digitalhouse.dh_recyclerviewalunos.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.dh_recyclerviewalunos.R;
import br.com.digitalhouse.dh_recyclerviewalunos.adapter.AlunosAdapter;
import br.com.digitalhouse.dh_recyclerviewalunos.model.Alunos;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlunosAdapter adapter;
    private List<Alunos> listaAlunos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaAlunosRecyclerView);

        adapter = new AlunosAdapter(retornaListAlunos());

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<Alunos> retornaListAlunos(){
        listaAlunos.add(new Alunos("Ana", "1111"));
        listaAlunos.add(new Alunos("Bia", "2222"));
        listaAlunos.add(new Alunos("Ceci", "3333"));
        listaAlunos.add(new Alunos("Diana", "4444"));
        listaAlunos.add(new Alunos("Elisa", "5555"));
        listaAlunos.add(new Alunos("Fabi", "6666"));
        listaAlunos.add(new Alunos("Gabi", "7777"));
        listaAlunos.add(new Alunos("Helena", "8888"));
        listaAlunos.add(new Alunos("Juliana", "9999"));
        listaAlunos.add(new Alunos("Karina", "0000"));

        return listaAlunos;
    }
}
