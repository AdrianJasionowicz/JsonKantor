package src.test;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class ApiTest {
    static Data data = new Data();
static CurrencyCode currencyCode = new CurrencyCode();
    public static final String CurrencyInformation = "http://api.nbp.pl/api/exchangerates/rates/c/";
    public static final String Currency = CurrencyCode.askCurrency();
    public static final String Year = data.year();
    public static final String Month = data.month();
    public static final String Day =  "07";            //data.day();

    public static void main(String[] args) throws IOException {
        URL url = new URL(CurrencyInformation + Currency + "/" + Year + "-" + Month + "-" + Day + "/?format=json");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        GetDataPL getdata = new Gson().fromJson(reader, GetDataPL.class);
System.out.println(getdata);
    }
}
