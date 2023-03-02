package learninging0910.WN;

import java.io.*;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.util.HashMap;

import java.net.URL;

public class Image {

    /**

     * 发送http get请求

     *

     * @param

     * @return

     */
    public static void main(String[] args) {
        Image image = new Image();
        image.sendGetRequest("https://iw233.cn/API/Random.php?type=image]");
        System.out.println(image.sendGetRequest("https://iw233.cn/API/Random.php?type=image]"));
    }

    public String sendGetRequest(String getUrl)

    {
        StringBuffer sb = new StringBuffer();
        InputStreamReader isr = null;
        BufferedReader br = null;
        try
        {
            URL url = new URL(getUrl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setAllowUserInteraction(false);
            isr = new InputStreamReader(url.openStream());
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null)
            {
                sb.append(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

}// "https://iw233.cn/API/Random.php?type=image]";


