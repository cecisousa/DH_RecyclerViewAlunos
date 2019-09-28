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
        retornaListAlunos().add(new Alunos("Ana", "1111"));
        retornaListAlunos().add(new Alunos("Ana", "2222"));
        retornaListAlunos().add(new Alunos("Ana", "3333"));
        retornaListAlunos().add(new Alunos("Ana", "4444"));
        retornaListAlunos().add(new Alunos("Ana", "5555"));
        retornaListAlunos().add(new Alunos("Ana", "6666"));
        retornaListAlunos().add(new Alunos("Ana", "7777"));
        retornaListAlunos().add(new Alunos("Ana", "8888"));
        retornaListAlunos().add(new Alunos("Ana", "9999"));
        retornaListAlunos().add(new Alunos("Ana", "0000"));

        return listaAlunos;
    }
}
