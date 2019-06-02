package com.santiago.asesorias.adapter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.santiago.asesorias.R;
import com.santiago.asesorias.models.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursosAdapter extends RecyclerView.Adapter<CursosAdapter.ViewHolder> {

    private List<Curso> cursos;

    public CursosAdapter(){
        this.cursos = new ArrayList<>();
    }

    public void setCursos(List<Curso> cursos){
        this.cursos = cursos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombreText;


        public ViewHolder(View itemView) {
            super(itemView);

            nombreText = itemView.findViewById(R.id.nombre_text);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_curso, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Curso curso = this.cursos.get(position);

        viewHolder.nombreText.setText(curso.getNombre());

    }

    @Override
    public int getItemCount() {
        return this.cursos.size();
    }

}

