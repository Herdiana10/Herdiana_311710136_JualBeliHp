package id.my.herdiana.jualbelihp.server;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import org.apache.http.NameValuePair;

import java.util.ArrayList;

public class AsyncinvokeURLTask extends AsyncTask<Void, Void, String>
        public String mNoteItWebUrl = "www.smartneasy.com";
        private ArrayList<NameValuePair> mParams;
        private OnPostExecuteListener onPostExecuteListener = null;
        private ProgressDialog dialog;
        public boolean showdialog = false;
        public String message = "Proses Data";
        public String url_server = "http://localhost/xphone/";
        public Context appLicationContext;

        =nameValuePairs;
        onPostExecuteListener = postExecuteListener;
        if(onPostExecuteListener ==null)
            throw new Exeception("Param cannot be null.");
    }
    @Override
    public String doInBackgroun(Void... params)
        String result = "timeout";
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost (uri:url_server+mNoteItWebUrl);
        try{
            httppost.setEntity(new UrlEncodedFormEntity(mParams));
            HttpResponse response = httpClient.execute(httppost);
            HttpEntity entity = response.getEntity();
            if (entity ! = null){
                InputStream inStream = entity.getContent();
                result = convertStreamToString(inStream);
            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception a) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public void onPostExecute(String result){
        if (onPostExecuteListener !=null){
            try {
                if (showdialog) this.dialog.dismiss();
                onPostExecuteListener.onPostExecute(result);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader((new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            while ((line = reader.readLine()) !=null) {
                sb.append(line + "\n")
            }
        }
    }
