package com.example.itdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class Pills_map extends Activity {



    /*/**
     * Замените "your_api_key" валидным API-ключом.
     * Ключ можно получить на сайте https://developer.tech.yandex.ru/
     */
   /* private final String MAPKIT_API_KEY = "f6e12646-128f-450d-a818-315f01512988";
    private final Point TARGET_LOCATION = new Point(59.945933, 30.320045);

    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Задайте API-ключ перед инициализацией MapKitFactory.
         * Рекомендуется устанавливать ключ в методе Application.onCreate,
         * но в данном примере он устанавливается в activity.
         */
      //  MapKitFactory.setApiKey(MAPKIT_API_KEY);
        /**
         * Инициализация библиотеки для загрузки необходимых нативных библиотек.
         * Рекомендуется инициализировать библиотеку MapKit в методе Activity.onCreate
         * Инициализация в методе Application.onCreate может привести к лишним вызовам и увеличенному использованию батареи.
         */
      /*  MapKitFactory.initialize(this);
        // Создание MapView.
        setContentView(R.layout.activity_pillsmap);
        super.onCreate(savedInstanceState);
        mapView = (MapView)findViewById(R.id.mapview);

        // Перемещение камеры в центр Санкт-Петербурга.
        mapView.getMap().move(
                new CameraPosition(TARGET_LOCATION, 14.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 5),
                null);
    }

    @Override
    protected void onStop() {
        // Вызов onStop нужно передавать инстансам MapView и MapKit.
        mapView.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    protected void onStart() {
        // Вызов onStart нужно передавать инстансам MapView и MapKit.
        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapView.onStart();
    }*/
}
