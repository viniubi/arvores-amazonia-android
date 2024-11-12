package com.example.ecoecho.data;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

@Entity(tableName = "arvore")
public class Arvore {
    @PrimaryKey
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private int id;
    @ColumnInfo(name = "nome")
    @SerializedName("nome")
    private String nome;
    @ColumnInfo(name = "descricao")
    @SerializedName("descricao")
    private String descricao;
    @Nullable
    @ColumnInfo(name = "img_url")
    @SerializedName("img_url")
    private String imgUrl;
    @Nullable
    @ColumnInfo(name = "sobre")
    @SerializedName("sobre")
    private String sobre;
    @Nullable
    @ColumnInfo(name = "biologia")
    @SerializedName("biologia")
    private String biologia;
    @Nullable
    @ColumnInfo(name = "ecologia")
    @SerializedName("ecologia")
    private String ecologia;
    @Nullable
    @ColumnInfo(name = "consumo")
    @SerializedName("consumo")
    private String consumo;
    @Nullable
    @ColumnInfo(name = "cultivo")
    @SerializedName("cultivo")
    private String cultivo;
    @Nullable
    @ColumnInfo(name = "referencias")
    @SerializedName("referencias")
    private String referencias;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Nullable
    public String getImgUrl() {
        return imgUrl;
    }

    @Nullable
    public String getSobre() {
        return sobre;
    }

    @Nullable
    public String getBiologia() {
        return biologia;
    }

    @Nullable
    public String getEcologia() {
        return ecologia;
    }

    @Nullable
    public String getConsumo() {
        return consumo;
    }

    @Nullable
    public String getCultivo() {
        return cultivo;
    }

    @Nullable
    public String getReferencias() {
        return referencias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImgUrl(@Nullable String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setSobre(@Nullable String sobre) {
        this.sobre = sobre;
    }

    public void setBiologia(@Nullable String biologia) {
        this.biologia = biologia;
    }

    public void setEcologia(@Nullable String ecologia) {
        this.ecologia = ecologia;
    }

    public void setConsumo(@Nullable String consumo) {
        this.consumo = consumo;
    }

    public void setCultivo(@Nullable String cultivo) {
        this.cultivo = cultivo;
    }

    public void setReferencias(@Nullable String referencias) {
        this.referencias = referencias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arvore arvore = (Arvore) o;
        return id == arvore.id && Objects.equals(nome, arvore.nome) && Objects.equals(descricao, arvore.descricao) && Objects.equals(imgUrl, arvore.imgUrl) && Objects.equals(sobre, arvore.sobre) && Objects.equals(biologia, arvore.biologia) && Objects.equals(ecologia, arvore.ecologia) && Objects.equals(consumo, arvore.consumo) && Objects.equals(cultivo, arvore.cultivo) && Objects.equals(referencias, arvore.referencias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, imgUrl, sobre, biologia, ecologia, consumo, cultivo, referencias);
    }
}
