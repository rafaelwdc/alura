package br.com.alura.estoque.retrofit;

import retrofit2.Retrofit;

public class EstoqueRetrofit {

    public EstoqueRetrofit() {
        new Retrofit.Builder().baseUrl("http://172.22.160.1:8080/produto");
    }
}
