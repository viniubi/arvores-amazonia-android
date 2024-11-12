package com.example.ecoecho.data;

import androidx.annotation.StringRes;

import com.example.ecoecho.R;

public enum Aba {
    SOBRE(R.string.sobre),
    BIOLOGIA(R.string.biologia),
    ECOLOGIA(R.string.ecologia),
    CONSUMO(R.string.consumo),
    CULTIVO(R.string.cultivo),
    REFERENCIAS(R.string.referencias),
    FIGURAS(R.string.figuras);

    @StringRes
    private final int stringResource;

    Aba(@StringRes int sobre) {
        this.stringResource = sobre;
    }

    public int getStringResource() {
        return stringResource;
    }
}
