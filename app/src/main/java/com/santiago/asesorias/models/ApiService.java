package com.santiago.asesorias.models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    String API_BASE_URL = "http://192.168.137.1:7070";
    @GET("/api/asesorias")

    Call<List<Asesoria>>getAsesorias();

    Call<List<Curso>> getCursos();
}
