package com.example.ecoecho;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecoecho.databinding.ItemTreeBinding;

public class ArvoreAdapter extends ListAdapter<Arvore, ArvoreAdapter.ArvoreHolder> {

    protected ArvoreAdapter() {
        super(new DiffCallback());
    }

    @NonNull
    @Override
    public ArvoreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTreeBinding binding = ItemTreeBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false);

        return new ArvoreHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArvoreHolder holder, int position) {
        Arvore item = getItem(position);
        holder.bind(item);
    }

    public static class ArvoreHolder extends RecyclerView.ViewHolder {
        private final ItemTreeBinding binding;

        public ArvoreHolder(ItemTreeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Arvore arvore) {
            binding.tvNome.setText(arvore.getNome());
            binding.tvDescricao.setText(arvore.getDescricaoBotanica());
        }
    }

    public static class DiffCallback extends DiffUtil.ItemCallback<Arvore> {

        @Override
        public boolean areItemsTheSame(@NonNull Arvore oldItem, @NonNull Arvore newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull Arvore oldItem, @NonNull Arvore newItem) {
            return oldItem.equals(newItem);
        }
    }
}
