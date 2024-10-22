package com.example.ecoecho.activity.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ecoecho.R;
import com.example.ecoecho.data.Arvore;
import com.example.ecoecho.databinding.ItemTreeBinding;

public class ArvoreAdapter extends ListAdapter<Arvore, ArvoreAdapter.ArvoreHolder> {
    @Nullable
    private final OnItemClickListener listener;

    protected ArvoreAdapter(@Nullable OnItemClickListener listener) {
        super(new DiffCallback());
        this.listener = listener;
    }

    @NonNull
    @Override
    public ArvoreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTreeBinding binding = ItemTreeBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false);

        return new ArvoreHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ArvoreHolder holder, int position) {
        Arvore item = getItem(position);
        holder.bind(item);
    }

    public static class ArvoreHolder extends RecyclerView.ViewHolder {
        private final ItemTreeBinding binding;
        @Nullable
        private final OnItemClickListener listener;

        public ArvoreHolder(ItemTreeBinding binding, @Nullable OnItemClickListener listener) {
            super(binding.getRoot());
            this.binding = binding;
            this.listener = listener;
        }

        public void bind(Arvore arvore) {
            Glide.with(binding.getRoot().getContext())
                    .load(arvore.getImgUrl())
                    .centerCrop()
                    .placeholder(R.drawable.bg_loading)
                    .error(R.drawable.bg_loading)
                    .into(binding.ivFoto);

            binding.tvNome.setText(arvore.getNome());
            binding.tvDescricao.setText(arvore.getDescricaoBotanica());

            if (listener != null) {
                binding.getRoot().setOnClickListener(v ->
                        listener.onSelecionarArvore(arvore.getId()));
            }
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

    public interface OnItemClickListener {
        void onSelecionarArvore(int id);
    }
}
