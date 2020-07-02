package com.example.finalprojectzachetka;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.finalprojectzachetka.Disciplines.Listliterature;

import java.util.ArrayList;
import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        private List<Listliterature> listliterature = new ArrayList<>();
        private OnDeleteListener onDeleteListener;
        private Context context;

        public RoomAdapter(Context context, List<Listliterature> dataModels) {
            this.context = context;
            this.listliterature = dataModels;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_literature, parent, false);
            return new LiteratureViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final LiteratureViewHolder viewHolder = (LiteratureViewHolder) holder;
            viewHolder.discipline.setText(listliterature.get(position).getmNameDiscipline());
            viewHolder.link.setText(listliterature.get(position).getmLink());
         //   viewHolder.name.setText(listliterature.get(position).get());
        }

        @Override
        public int getItemCount() {
            return listliterature.size();
        }

        public class LiteratureViewHolder extends RecyclerView.ViewHolder {

            public TextView name;
            public TextView link;
            public TextView discipline;

            public LiteratureViewHolder(View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.name);
                link = itemView.findViewById(R.id.link);
                discipline = itemView.findViewById(R.id.discipline);
                //DisciplinesActivity.bind(this, itemView);

//                delete.setOnClickListener(view -> {
//                    onDeleteListener.onDelete(listliterature.get(getAdapterPosition()));
//                    listliterature.remove(getAdapterPosition());
//                    notifyItemRemoved(getAdapterPosition());
//                });
     }
        }

        public void setOnDeleteListener(OnDeleteListener onDeleteListener) {
            this.onDeleteListener = onDeleteListener;
        }

        public interface OnDeleteListener {
            void onDelete(Listliterature listliterature);
        }
    }
