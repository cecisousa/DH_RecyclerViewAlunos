package br.com.digitalhouse.dh_recyclerviewalunos.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.dh_recyclerviewalunos.R;
import br.com.digitalhouse.dh_recyclerviewalunos.model.Alunos;

public class AlunosAdapter extends RecyclerView.Adapter<AlunosAdapter.ViewHolder> {

    private List<Alunos> listaAlunos;

    public AlunosAdapter(List<Alunos> listaAlunos){
        this.listaAlunos = listaAlunos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int posicao) {
        Alunos aluno = listaAlunos.get(posicao);

        viewHolder.onBind(aluno);

    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNome;
        private TextView txtRA;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtRA = itemView.findViewById(R.id.txtRA);
        }

        public void onBind(Alunos aluno){
            txtNome.setText(aluno.getNome());
            txtRA.setText(aluno.getRA());

        }
    }
}
