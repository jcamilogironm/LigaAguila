package com.example.juancamilogiron.ligaaguila;



import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Edicion prueba
public class TablaActivity extends ActionBarActivity {

    private TextView txtteam1;//,txtteam2,txtteam3,txtteam4,txtteam5,txtteam6,txtteam7,txtteam8,txtteam9,txtteam10,txtteam11,txtteam12,txtteam13,txtteam14,txtteam15,txtteam16,txtteam17,txtteam18,txtteam19,txtteam20;
    private TextView txtpj1;//,txtpj2,txtpj3,txtpj4,txtpj5,txtpj6,txtpj7,txtpj8,txtpj9,txtpj10,txtpj11,txtpj12,txtpj13,txtpj14,txtpj15,txtpj16,txtpj17,txtpj18,txtpj19,txtpj20;
    private TextView txtpg1;//,txtpg2,txtpg3,txtpg4,txtpg5,txtpg6,txtpg7,txtpg8,txtpg9,txtpg10,txtpg11,txtpg12,txtpg13,txtpg14,txtpg15,txtpg16,txtpg17,txtpg18,txtpg19,txtpg20;
    private TextView txtpe1;//,txtpe2,txtpe3,txtpe4,txtpe5,txtpe6,txtpe7,txtpe8,txtpe9,txtpe10,txtpe11,txtpe12,txtpe13,txtpe14,txtpe15,txtpe16,txtpe17,txtpe18,txtpe19,txtpe20;
    private TextView txtpp1;//,txtpp2,txtpp3,txtpp4,txtpp5,txtpp6,txtpp7,txtpp8,txtpp9,txtpp10,txtpp11,txtpp12,txtpp13,txtpp14,txtpp15,txtpp16,txtpp17,txtpp18,txtpp19,txtpp20;
    private TextView txtpts1;//,txtpts2,txtpts3,txtpts4,txtpts5,txtpts6,txtpts7,txtpts8,txtpts9,txtpts10,txtpts11,txtpts12,txtpts13,txtpts14,txtpts15,txtpts16,txtpts17,txtpts18,txtpts19,txtpts20;
    private int posicion=0;
    private Button mostrar;
    private List<Tabla> listaTabla;
    private Tabla tabla;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);


        listaTabla=new ArrayList<Tabla>();
        txtteam1=(TextView)findViewById(R.id.team1);
 /*       txtteam2=(TextView)findViewById(R.id.team2);
        txtteam3=(TextView)findViewById(R.id.team3);
        txtteam4=(TextView)findViewById(R.id.team4);
        txtteam5=(TextView)findViewById(R.id.team5);
        txtteam6=(TextView)findViewById(R.id.team6);
        txtteam7=(TextView)findViewById(R.id.team7);
        txtteam8=(TextView)findViewById(R.id.team8);
        txtteam9=(TextView)findViewById(R.id.team9);
        txtteam10=(TextView)findViewById(R.id.team10);
        txtteam11=(TextView)findViewById(R.id.team11);
        txtteam12=(TextView)findViewById(R.id.team12);
        txtteam13=(TextView)findViewById(R.id.team13);
        txtteam14=(TextView)findViewById(R.id.team14);
        txtteam15=(TextView)findViewById(R.id.team15);
        txtteam16=(TextView)findViewById(R.id.team16);
        txtteam17=(TextView)findViewById(R.id.team17);
        txtteam18=(TextView)findViewById(R.id.team18);
        txtteam19=(TextView)findViewById(R.id.team19);
        txtteam20=(TextView)findViewById(R.id.team20);*/

        txtpj1=(TextView)findViewById(R.id.pj1);
  /*      txtpj2=(TextView)findViewById(R.id.pj2);
        txtpj3=(TextView)findViewById(R.id.pj3);
        txtpj4=(TextView)findViewById(R.id.pj4);
        txtpj5=(TextView)findViewById(R.id.pj5);
        txtpj6=(TextView)findViewById(R.id.pj6);
        txtpj7=(TextView)findViewById(R.id.pj7);
        txtpj8=(TextView)findViewById(R.id.pj8);
        txtpj9=(TextView)findViewById(R.id.pj9);
        txtpj10=(TextView)findViewById(R.id.pj10);
        txtpj11=(TextView)findViewById(R.id.pj11);
        txtpj12=(TextView)findViewById(R.id.pj12);
        txtpj13=(TextView)findViewById(R.id.pj13);
        txtpj14=(TextView)findViewById(R.id.pj14);
        txtpj15=(TextView)findViewById(R.id.pj15);
        txtpj16=(TextView)findViewById(R.id.pj16);
        txtpj17=(TextView)findViewById(R.id.pj17);
        txtpj18=(TextView)findViewById(R.id.pj18);
        txtpj19=(TextView)findViewById(R.id.pj19);
        txtpj20=(TextView)findViewById(R.id.pj20);*/


        txtpg1=(TextView)findViewById(R.id.pg1);
  /*      txtpg2=(TextView)findViewById(R.id.pg2);
        txtpg3=(TextView)findViewById(R.id.pg3);
        txtpg4=(TextView)findViewById(R.id.pg4);
        txtpg5=(TextView)findViewById(R.id.pg5);
        txtpg6=(TextView)findViewById(R.id.pg6);
        txtpg7=(TextView)findViewById(R.id.pg7);
        txtpg8=(TextView)findViewById(R.id.pg8);
        txtpg9=(TextView)findViewById(R.id.pg9);
        txtpg10=(TextView)findViewById(R.id.pg10);
        txtpg11=(TextView)findViewById(R.id.pg11);
        txtpg12=(TextView)findViewById(R.id.pg12);
        txtpg13=(TextView)findViewById(R.id.pg13);
        txtpg14=(TextView)findViewById(R.id.pg14);
        txtpg15=(TextView)findViewById(R.id.pg15);
        txtpg16=(TextView)findViewById(R.id.pg16);
        txtpg17=(TextView)findViewById(R.id.pg17);
        txtpg18=(TextView)findViewById(R.id.pg18);
        txtpg19=(TextView)findViewById(R.id.pg19);
        txtpg20=(TextView)findViewById(R.id.pg20);*/


        txtpe1=(TextView)findViewById(R.id.pe1);
   /*     txtpe2=(TextView)findViewById(R.id.pe2);
        txtpe3=(TextView)findViewById(R.id.pe3);
        txtpe4=(TextView)findViewById(R.id.pe4);
        txtpe5=(TextView)findViewById(R.id.pe5);
        txtpe6=(TextView)findViewById(R.id.pe6);
        txtpe7=(TextView)findViewById(R.id.pe7);
        txtpe8=(TextView)findViewById(R.id.pe8);
        txtpe9=(TextView)findViewById(R.id.pe9);
        txtpe10=(TextView)findViewById(R.id.pe10);
        txtpe11=(TextView)findViewById(R.id.pe11);
        txtpe12=(TextView)findViewById(R.id.pe12);
        txtpe13=(TextView)findViewById(R.id.pe13);
        txtpe14=(TextView)findViewById(R.id.pe14);
        txtpe15=(TextView)findViewById(R.id.pe15);
        txtpe16=(TextView)findViewById(R.id.pe16);
        txtpe17=(TextView)findViewById(R.id.pe17);
        txtpe18=(TextView)findViewById(R.id.pe18);
        txtpe19=(TextView)findViewById(R.id.pe19);
        txtpe20=(TextView)findViewById(R.id.pe20);*/


        txtpp1=(TextView)findViewById(R.id.pp1);
  /*      txtpp2=(TextView)findViewById(R.id.pp2);
        txtpp3=(TextView)findViewById(R.id.pp3);
        txtpp4=(TextView)findViewById(R.id.pp4);
        txtpp5=(TextView)findViewById(R.id.pp5);
        txtpp6=(TextView)findViewById(R.id.pp6);
        txtpp7=(TextView)findViewById(R.id.pp7);
        txtpp8=(TextView)findViewById(R.id.pp8);
        txtpp9=(TextView)findViewById(R.id.pp9);
        txtpp10=(TextView)findViewById(R.id.pp10);
        txtpp11=(TextView)findViewById(R.id.pp11);
        txtpp12=(TextView)findViewById(R.id.pp12);
        txtpp13=(TextView)findViewById(R.id.pp13);
        txtpp14=(TextView)findViewById(R.id.pp14);
        txtpp15=(TextView)findViewById(R.id.pp15);
        txtpp16=(TextView)findViewById(R.id.pp16);
        txtpp17=(TextView)findViewById(R.id.pp17);
        txtpp18=(TextView)findViewById(R.id.pp18);
        txtpp19=(TextView)findViewById(R.id.pp19);
        txtpp20=(TextView)findViewById(R.id.pp20);*/

        txtpts1=(TextView)findViewById(R.id.pts1);
   /*     txtpts2=(TextView)findViewById(R.id.pts2);
        txtpts3=(TextView)findViewById(R.id.pts3);
        txtpts4=(TextView)findViewById(R.id.pts4);
        txtpts5=(TextView)findViewById(R.id.pts5);
        txtpts6=(TextView)findViewById(R.id.pts6);
        txtpts7=(TextView)findViewById(R.id.pts7);
        txtpts8=(TextView)findViewById(R.id.pts8);
        txtpts9=(TextView)findViewById(R.id.pts9);
        txtpts10=(TextView)findViewById(R.id.pts10);
        txtpts11=(TextView)findViewById(R.id.pts11);
        txtpts12=(TextView)findViewById(R.id.pts12);
        txtpts13=(TextView)findViewById(R.id.pts13);
        txtpts14=(TextView)findViewById(R.id.pts14);
        txtpts15=(TextView)findViewById(R.id.pts15);
        txtpts16=(TextView)findViewById(R.id.pts16);
        txtpts17=(TextView)findViewById(R.id.pts17);
        txtpts18=(TextView)findViewById(R.id.pts18);
        txtpts19=(TextView)findViewById(R.id.pts19);
        txtpts20=(TextView)findViewById(R.id.pts20);*/

        mostrar=(Button)findViewById(R.id.mostrar);
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Mostrar().execute();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_update) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String mostrar(){
        HttpClient httpClient=new DefaultHttpClient();
        HttpPost httpPost=new HttpPost("http://webserviceligaaguila.esy.es/webService/consulta.php");
        String resultado="";
        HttpResponse response;

        try {
            response=httpClient.execute(httpPost);
            HttpEntity entity=response.getEntity();
            InputStream instream=entity.getContent();
            resultado=convertStreamToString(instream);
        }catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return resultado;
    }

    private String convertStreamToString(InputStream is)throws IOException {

        if (is != null){

            StringBuilder sb=new StringBuilder();
            String line;

            try{
                BufferedReader reader=new BufferedReader(new InputStreamReader(is, "UTF-8"));
                while ((line = reader.readLine()) != null){

                    sb.append(line).append("\n");
                }

            }

            finally {
                is.close();
            }

            return sb.toString();
        }else{

            return "";
        }
    }

    private boolean filtrarDatos(){
        listaTabla.clear();
        String data=mostrar();

        if (!data.equalsIgnoreCase("")){
            JSONObject json;
            try {
                json= new JSONObject(data);
                JSONArray jsonArray=json.optJSONArray("tabla");

                for (int i=0;i<jsonArray.length();i++){

                    tabla=new Tabla();
                    JSONObject jsonArrayChild=jsonArray.getJSONObject(i);
                    tabla.setEquipo(jsonArrayChild.optString("equipo"));
                    tabla.setPj(jsonArrayChild.optString("pj"));
                    tabla.setPg(jsonArrayChild.optString("pg"));
                    tabla.setPe(jsonArrayChild.optString("pe"));
                    tabla.setPp(jsonArrayChild.optString("pp"));
                    tabla.setPts(jsonArrayChild.optString("pts"));
                    listaTabla.add(tabla);


                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
                return true;
        }

        return true;
    }

    private void mostrarTabla(final int posicion){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Tabla tabla=listaTabla.get(posicion);
                txtteam1.setText(tabla.getEquipo());
                txtpj1.setText(tabla.getPj());
                txtpg1.setText(tabla.getPg());
                txtpe1.setText(tabla.getPe());
                txtpp1.setText(tabla.getPp());
                txtpts1.setText(tabla.getPts());

                System.out.println(tabla.getEquipo());
            }
        });


    }

    class Mostrar extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... params){

            if (filtrarDatos())mostrarTabla(posicion);
            return null;
        }

    }

}
