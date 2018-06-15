package com.bagirapp.radiogroup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Gyerekek> lista = new ArrayList<>();
        Gyerekek gyerek1 = new Gyerekek("Réka", "Tüskevár", "Téli berek");
        lista.add(gyerek1);
        Gyerekek gyerek2 = new Gyerekek("Hajna", "Bogáncs", "Téli berek");
        lista.add(gyerek2);
        Gyerekek gyerek3 = new Gyerekek("Enéh", "Robinson", "Bambi");
        lista.add(gyerek3);
        Gyerekek gyerek4 = new Gyerekek("Regő", "Rémusz", "Lupin");
        lista.add(gyerek4);
        Gyerekek gyerek5 = new Gyerekek("Gönci", "Buldózerek", "Téli berek");
        lista.add(gyerek5);
        Gyerekek gyerek6 = new Gyerekek("Csöpi", "Ninja", "Téli berek");
        lista.add(gyerek6);
        Gyerekek gyerek7 = new Gyerekek("Bumi", "Tüskevár", "Téli berek");
        lista.add(gyerek7);
        Gyerekek gyerek8 = new Gyerekek("Hipi", "Bogáncs", "Téli berek");
        lista.add(gyerek8);
        Gyerekek gyerek9 = new Gyerekek("Pati", "Tüskevár", "Téli berek");
        lista.add(gyerek9);
        Gyerekek gyerek10 = new Gyerekek("Szuri", "Bogáncs", "Téli berek");
        lista.add(gyerek10);
        Gyerekek gyerek11 = new Gyerekek("Káta", "Büdösbogár", "Szekérrúd");
        lista.add(gyerek11);
        Gyerekek gyerek12 = new Gyerekek("Lomb", "Bogáncs", "Téli berek");
        lista.add(gyerek12);
        Gyerekek gyerek13 = new Gyerekek("Fű", "Csí", "Lutra");
        lista.add(gyerek13);
        Gyerekek gyerek14 = new Gyerekek("Fa", "Bogáncs", "Téli berek");
        lista.add(gyerek14);
        Gyerekek gyerek15 = new Gyerekek("Virág", "Hu", "Almáskert");
        lista.add(gyerek15);
        Gyerekek gyerek16 = new Gyerekek("Hagyma", "Bogáncs", "Téli berek");
        lista.add(gyerek16);


    RecyclerView view = (RecyclerView)findViewById(R.id.recyclerView);
    MyAdapter adapter = new MyAdapter(this, lista);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        view.setLayoutManager(manager);
    view.setAdapter(adapter);
    }
}


