package com.fjavmvazquez.recyclerviewarticulos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<Articulo> articulos;

    public AdapterDatos(ArrayList<Articulo> articulos){
        this.articulos = articulos;
    }

    @NonNull
    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item_custom,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDatos.ViewHolderDatos holder, int position) {
        //Establece la comunicación entre el adaptador y ViewHolderDatos
        //holder.asignarDatos(articulos.get(position));
        holder.asignarDatos(articulos.get(position));

    }

    @Override
    public int getItemCount() {
        //retorna el tamaño de la lista
        return articulos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView data;
        TextView mTextViewDescripcion;
        TextView mTextViewFecha;
        ImageView mImageView;
        CardView mCardViewListener;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            data = itemView.findViewById(R.id.txtTitulo);
            mImageView = itemView.findViewById(R.id.imgvFondo);
            mTextViewDescripcion = itemView.findViewById(R.id.txtContenido);
            mTextViewFecha = itemView.findViewById(R.id.txtFecha);
            mCardViewListener = itemView.findViewById(R.id.cardViewListener);

            mCardViewListener.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),data.getText(),Toast.LENGTH_SHORT).show();
                }
            });



        }

        public void asignarDatos(Articulo articulo) {
            mImageView.setImageResource(articulo.getIdFoto());
           data.setText(articulo.getTitulo());
           mTextViewDescripcion.setText(articulo.getDescripcion());
           mTextViewFecha.setText(articulo.getFecha());
        }

    }
}
