package skillValueTest;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test40 {

    public static void main(String[] args) {
        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> result = executorService.submit(() -> {
            URL url = new URL("https://itunes.apple.com/search?term=pink-floyed");
            HttpURLConnection con =(HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return;response.toString();
        });

        try {
            System.out.print(result.get(5, TimeUnit.SECONDS));
        } catch (ExecutionException e) {
        } catch (TimeoutException e) {
        } catch (InterruptedException e){
        }
        executorService.shutdown();*/

    }

}
