package com.example.ecoecho;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "arvore")
public class Arvore {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "nome")
    private String nome;
    @ColumnInfo(name = "descricao_botanica")
    private String descricaoBotanica;
    @ColumnInfo(name = "frutificacao")
    private String frutificacao;
    @ColumnInfo(name = "dispersao")
    private String dispersao;
    @ColumnInfo(name = "aspectos_ecologicos")
    private String aspectosEcologicos;
    @ColumnInfo(name = "regeneracao_natural")
    private String regeneracaoNatural;
    @ColumnInfo(name = "dados_nutricionais")
    private String dadosNutricionais;
    @ColumnInfo(name = "formas_consumo")
    private String formasConsumo;
    @ColumnInfo(name = "composicao")
    private String composicao;
    @ColumnInfo(name = "potenciais_bioprodutos")
    private String potenciaisBioprodutos;
    @ColumnInfo(name = "bioatividade")
    private String bioatividade;
    @ColumnInfo(name = "paisagismo")
    private String paisagismo;
    @ColumnInfo(name = "colheita_sementes")
    private String colheitaSementes;
    @ColumnInfo(name = "producao_mudas")
    private String producaoMudas;
    @ColumnInfo(name = "transplante")
    private String transplante;
    @ColumnInfo(name = "agua")
    private String agua;
    @ColumnInfo(name = "solos")
    private String solos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoBotanica() {
        return descricaoBotanica;
    }

    public void setDescricaoBotanica(String descricaoBotanica) {
        this.descricaoBotanica = descricaoBotanica;
    }

    public String getFrutificacao() {
        return frutificacao;
    }

    public void setFrutificacao(String frutificacao) {
        this.frutificacao = frutificacao;
    }

    public String getDispersao() {
        return dispersao;
    }

    public void setDispersao(String dispersao) {
        this.dispersao = dispersao;
    }

    public String getAspectosEcologicos() {
        return aspectosEcologicos;
    }

    public void setAspectosEcologicos(String aspectosEcologicos) {
        this.aspectosEcologicos = aspectosEcologicos;
    }

    public String getRegeneracaoNatural() {
        return regeneracaoNatural;
    }

    public void setRegeneracaoNatural(String regeneracaoNatural) {
        this.regeneracaoNatural = regeneracaoNatural;
    }

    public String getDadosNutricionais() {
        return dadosNutricionais;
    }

    public void setDadosNutricionais(String dadosNutricionais) {
        this.dadosNutricionais = dadosNutricionais;
    }

    public String getFormasConsumo() {
        return formasConsumo;
    }

    public void setFormasConsumo(String formasConsumo) {
        this.formasConsumo = formasConsumo;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getPotenciaisBioprodutos() {
        return potenciaisBioprodutos;
    }

    public void setPotenciaisBioprodutos(String potenciaisBioprodutos) {
        this.potenciaisBioprodutos = potenciaisBioprodutos;
    }

    public String getBioatividade() {
        return bioatividade;
    }

    public void setBioatividade(String bioatividade) {
        this.bioatividade = bioatividade;
    }

    public String getPaisagismo() {
        return paisagismo;
    }

    public void setPaisagismo(String paisagismo) {
        this.paisagismo = paisagismo;
    }

    public String getColheitaSementes() {
        return colheitaSementes;
    }

    public void setColheitaSementes(String colheitaSementes) {
        this.colheitaSementes = colheitaSementes;
    }

    public String getProducaoMudas() {
        return producaoMudas;
    }

    public void setProducaoMudas(String producaoMudas) {
        this.producaoMudas = producaoMudas;
    }

    public String getTransplante() {
        return transplante;
    }

    public void setTransplante(String transplante) {
        this.transplante = transplante;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getSolos() {
        return solos;
    }

    public void setSolos(String solos) {
        this.solos = solos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arvore arvore = (Arvore) o;
        return id == arvore.id
                && Objects.equals(nome, arvore.nome)
                && Objects.equals(descricaoBotanica, arvore.descricaoBotanica)
                && Objects.equals(frutificacao, arvore.frutificacao)
                && Objects.equals(dispersao, arvore.dispersao)
                && Objects.equals(aspectosEcologicos, arvore.aspectosEcologicos)
                && Objects.equals(regeneracaoNatural, arvore.regeneracaoNatural)
                && Objects.equals(dadosNutricionais, arvore.dadosNutricionais)
                && Objects.equals(formasConsumo, arvore.formasConsumo)
                && Objects.equals(composicao, arvore.composicao)
                && Objects.equals(potenciaisBioprodutos, arvore.potenciaisBioprodutos)
                && Objects.equals(bioatividade, arvore.bioatividade)
                && Objects.equals(paisagismo, arvore.paisagismo)
                && Objects.equals(colheitaSementes, arvore.colheitaSementes)
                && Objects.equals(producaoMudas, arvore.producaoMudas)
                && Objects.equals(transplante, arvore.transplante)
                && Objects.equals(agua, arvore.agua)
                && Objects.equals(solos, arvore.solos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nome,
                descricaoBotanica,
                frutificacao,
                dispersao,
                aspectosEcologicos,
                regeneracaoNatural,
                dadosNutricionais,
                formasConsumo,
                composicao,
                potenciaisBioprodutos,
                bioatividade,
                paisagismo,
                colheitaSementes,
                producaoMudas,
                transplante,
                agua,
                solos);
    }
}
