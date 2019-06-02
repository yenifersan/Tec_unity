package com.santiago.asesorias.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.santiago.asesorias.R;
import com.santiago.asesorias.models.ApiService;
import com.santiago.asesorias.models.Asesoria;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AsesoriasAdapter extends RecyclerView.Adapter<AsesoriasAdapter.ViewHolder> {

    private List<Asesoria> asesorias;

    public AsesoriasAdapter(){
        this.asesorias = new ArrayList<>();
    }

    public void setAsesorias(List<Asesoria> asesorias){
        this.asesorias = asesorias;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tituloText;
        public TextView etiquetaText;
        public TextView estadoText;

        public ViewHolder(View itemView) {
            super(itemView);

            tituloText = itemView.findViewById(R.id.titulo_text);
            etiquetaText = itemView.findViewById(R.id.etiqueta_text);
            estadoText = itemView.findViewById(R.id.estado_text);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_asesoria, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Asesoria asesoria = this.asesorias.get(position);

        viewHolder.tituloText.setText(asesoria.getTituloAsesoria());
        viewHolder.etiquetaText.setText(asesoria.getEtiquetaAsesoria());
        viewHolder.estadoText.setText(asesoria.getEstadoAsesoria());
    }

    @Override
    public int getItemCount() {
        return this.asesorias.size();
    }

}
