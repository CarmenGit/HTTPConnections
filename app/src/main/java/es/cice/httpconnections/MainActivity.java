package es.cice.httpconnections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import es.cice.httpconnections.util.HTTPConnectionUtil;


public class MainActivity extends AppCompatActivity {

    private HTTPHandler mHandler;
    //para almacenar los bytes
    private TextView bytesMonitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new HTTPHandler(R.id.bytesMonitorTV);
        bytesMonitor = (TextView)findViewById(R.id.bytesMonitorTV);
    }

    public  void startDownload(View v){
        String url="http://www.mit.edu/";
        HTTPConnectionUtil util=new HTTPConnectionUtil(mHandler);
        util.obtainResource(url);

    }
}
