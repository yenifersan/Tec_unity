package com.santiago.asesorias.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.santiago.asesorias.R;
import com.santiago.asesorias.adapter.AsesoriasAdapter;
import com.santiago.asesorias.models.ApiService;
import com.santiago.asesorias.models.Asesoria;
import com.santiago.asesorias.service.ApiServiceGenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView  asesoriasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asesoriasList = findViewById(R.id.recyclerview);
        asesoriasList.setLayoutManager(new LinearLayoutManager(this));

        asesoriasList.setAdapter(new AsesoriasAdapter());

        initialize();
    }

    private void initialize() {

        ApiService service = ApiServiceGenerator.createService(ApiService.class);

        Call<List<Asesoria>> call = service.getAsesorias();

        call.enqueue(new Callback<List<Asesoria>>() {
            @Override
            public void onResponse(Call<List<Asesoria>> call, Response<List<Asesoria>> response) {
                try {

                    int statusCode = response.code();
                    Log.d(TAG, "HTTP status code: " + statusCode);

                    if (response.isSuccessful()) {

                        List<Asesoria> asesorias = response.body();
                        Log.d(TAG, "asesorias: " + asesorias);

                        AsesoriasAdapter adapter = (AsesoriasAdapter) asesoriasList.getAdapter();
                        adapter.setAsesorias(asesorias);
                        adapter.notifyDataSetChanged();

                    } else {
                        Log.e(TAG, "onError: " + response.errorBody().string());
                        throw new Exception("Error en el servicio");
                    }

                } catch (Throwable t) {
                    try {
                        Log.e(TAG, "onThrowable: " + t.toString(), t);
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }catch (Throwable x){}
                }
            }

            @Override
            public void onFailure(Call<List<Asesoria>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.toString());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }

        });
    }

}
