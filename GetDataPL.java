package src.test;

import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Generated("jsonschema2pojo")
public class GetDataPL {
        @SerializedName("data")
        @Expose
        private String data;
        @SerializedName("cena")
        @Expose
        private static Double cena;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public static Double getCena() {
            return cena;
        }

        public void setCena(Double cena) {
            this.cena = cena;
        }

}


