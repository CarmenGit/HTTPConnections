package es.cice.httpconnections.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import es.cice.httpconnections.HTTPHandler;

/**
 * Created by cice on 26/1/17.
 */

public class HTTPConnectionUtil {

    private HTTPHandler mHandler;

    public HTTPConnectionUtil(HTTPHandler mHandler) {
        this.mHandler=mHandler;
    }

    public void obtainResource(final String urlStr){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    URL url=new URL(urlStr);
                    URLConnection con=url.openConnection();
                    InputStream in=con.getInputStream();
                    int byteLeido;
                    while ((byteLeido=in.read())!=-1){
                        //enviar mensaje al handler
                        mHandler.sendMessage(mHandler.obtainMessage(mHandler.SET_DATOS, byteLeido));
                    }
                }catch (MalformedURLException e){
                    e.printStackTrace();

                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }).start();

    }
}
