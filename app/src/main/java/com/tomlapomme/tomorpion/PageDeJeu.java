package com.tomlapomme.tomorpion;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class PageDeJeu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_de_jeu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page_de_jeu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     *
     * @param view
     */
    public void poserPion1(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_1);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion2(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_2);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion3(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_3);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion4(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_4);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion5(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_5);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion6(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_6);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion7(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_7);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion8(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_8);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }

    /**
     *
     * @param view
     */
    public void poserPion9(View view) {

        //Change images
        ImageView position = (ImageView) findViewById(R.id.position_9);
        if (position.getTag() != null && position.getTag().toString().equals("cercle")){
            position.setImageResource(R.drawable.croix);
            position.setTag("croix");
        } else if (position.getTag() != null && position.getTag().toString().equals("croix")){
            position.setImageResource(R.drawable.imgblanc);
            position.setTag(null);
        } else {
            position.setImageResource(R.drawable.cercle);
            position.setTag("cercle");
        }

        // Repainter
        position.invalidate();
    }
}
