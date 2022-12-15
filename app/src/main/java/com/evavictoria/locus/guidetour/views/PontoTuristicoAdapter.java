package com.evavictoria.locus.guidetour.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.evavictoria.locus.guidetour.R;
import com.evavictoria.locus.guidetour.model.PontoTuristico;

import java.util.List;

public class PontoTuristicoAdapter extends RecyclerView.Adapter {

    List<PontoTuristico> pontosTuristicos;

    public PontoTuristicoAdapter(List<PontoTuristico> pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pontosturisticos, parent, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass) holder;
        PontoTuristico pontoTuristico = pontosTuristicos.get(position);
        viewHolderClass.tvNome.setText(pontoTuristico.getNome());
        viewHolderClass.tvDescricao.setText(pontoTuristico.getDescricao());
    }

    @Override
    public int getItemCount() {
        return pontosTuristicos.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        TextView tvNome;
        TextView tvDescricao;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            this.tvNome = itemView.findViewById(R.id.nomePontoTuristicoRotas);
            this.tvDescricao = itemView.findViewById(R.id.descricaoPontoTuristicoRotas);
        }
    }
}