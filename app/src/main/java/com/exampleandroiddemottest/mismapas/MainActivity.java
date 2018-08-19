package com.exampleandroiddemottest.mismapas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View view) {
        Intent intent =new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    public void goBeach(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.markerbeach);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();

       goPlace(-69.03636542721745,18.98511634504758,b);
    }
    public void goPlace(double log, double lat,byte[] imagDraw){
        Intent intent =new Intent(this, MapsActivity.class);
        intent.putExtra(Constantantes.LONGITUDE,log);
        intent.putExtra(Constantantes.LATITUDE,lat);
        intent.putExtra(Constantantes.IMG,imagDraw);
        startActivity(intent);
    }

    public void imgForestmet(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.markerforest);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        goPlace(-79.54351369437114,38.09355457825378,b);
    }

    public void mointainImag(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.markermountain);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        goPlace(-68.91800957455024,18.982603413682728,b);
    }

    public void townGo(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.markertown);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        goPlace(-70.97394114356234,46.71024706991748,b);

    }
}
