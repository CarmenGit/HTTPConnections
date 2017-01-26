package es.cice.httpconnections;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cice on 26/1/17.
 */
public class HTTPHandler extends Handler{
    public static final int SET_DATOS=1;
    private TextView bytesMonitorTV;
    /**
     * Subclasses must implement this to receive messages.
     *
     * @param msg
     */
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        //bytesMonitorTV=(TextView)finalize
              //  (R.id.bytesMonitorTV);

        switch (msg.what){
            case SET_DATOS:
                Integer value=(Integer) msg.obj;

                bytesMonitorTV.append("\n" + value);
                //pBar.setProgress(pBar.getProgress()+1);
                break;
            /*case SHOW_PROGRESS:
                pBar.setVisibility(View.VISIBLE);
                break;
            case HIDE_PROGRESS:
                pBar.setVisibility(View.GONE);
                break;*/

        }

    }
    public void HTTPHandler(int v){
        bytesMonitorTV = 
    }
}
