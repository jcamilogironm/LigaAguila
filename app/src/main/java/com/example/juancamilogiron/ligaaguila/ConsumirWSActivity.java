package com.example.juancamilogiron.ligaaguila;


import android.app.Activity;


import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import com.google.gson.reflect.TypeToken;


public class ConsumirWSActivity extends Activity {
//Constantes para la invocacion del web service
    private static final String NAMESPACE="http://localhost/webservice/";
    private static String URL="https://127.0.0.1/webservice/ejecutar.php";
    private static final String METHOD_NAME="getAllAndroidOS";
    private static final String SOAP_ACTION="http://localhost/webservice/getAllAndroidOS";

    //Declaracion de variables para consumir el web service
    private SoapObject request=null;
    private SoapSerializationEnvelope envelope=null;
    private SoapPrimitive resultsRequestSOAP=null;

    //Declaracion de variables para serealziar y deserealizar
    //objetos y cadenas JSON
    Gson gson;

    //Variables para manipular los controles de la UI


}
