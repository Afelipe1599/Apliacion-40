package com.example.ejerciciosmas40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejerciciosmas40.models.ejercicio;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class adaptadorVideos extends RecyclerView.Adapter<adaptadorVideos.ViewHolderVideos> {

    ArrayList<ejercicio> listaVideos;


    public adaptadorVideos(ArrayList<ejercicio> listaVideos) {
        this.listaVideos = listaVideos;
    }

    @NonNull
    @Override
    public ViewHolderVideos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_player,null,false);
        return new ViewHolderVideos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderVideos holder, final int position) {
        holder.etiNombre.setText(listaVideos.get(position).getNombre());
        holder.etiDescripcion.setText(listaVideos.get(position).getDescripcion());
        holder.video.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {

            public void onReady(@NonNull YouTubePlayer youTubePlayer){

                String videoId = listaVideos.get(position).getId();
                youTubePlayer.loadVideo(videoId, 0);

            }


        });

    }

    @Override
    public int getItemCount() {
        return listaVideos.size();
    }

    public class ViewHolderVideos extends RecyclerView.ViewHolder {

        TextView etiNombre,etiDescripcion;
        YouTubePlayerView video;


        public ViewHolderVideos(@NonNull View itemView) {
            super(itemView);

            etiNombre = itemView.findViewById(R.id.nombreEjercicio);
            etiDescripcion = itemView.findViewById(R.id.descripcionEjercicio);
            video = (YouTubePlayerView) itemView.findViewById(R.id.videoplayer);


        }
    }
}
