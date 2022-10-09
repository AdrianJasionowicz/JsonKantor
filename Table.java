package src.test;

public class Table {
    public static void Tablet() {
        System.out.println("Lista Walut oraz ich skrótów do Użytku");


        String[] Table = {"Tajlandia - THB", "Dolar Amerykański - USD", "Dolar Australijski - AUD", "Dolar Hongkongu - HKD", "Dolar Kanadyjski - CAD", "Dolar Nowozelandzki - NZD", "Dolar Singapurski - SGD", "Euro - EUR", "Forint (Węgry) -  HUF", "Frank Szwajcarski - CHF", "Funt Szterling -  GBP", "Hrywna (Ukraina) -  UAH", "Jen (Japonia) - JPY", "Korona Czeska - CZK", "Korona Duńska -  DKK", "Korona Islandzka -  ISK", "Korona Norweska - NOK", "Korona Szwedzka - SEK", "Kuna (Chorwacja) - HRK", "Lej Rumuński - RON", "Lew (Bułgaria) - BGN", "Lira Turecka - TRY", "Nowy Izraelski Szekel - ILS", "Peso Chilijskie - CLP", "Peso Filipińskie	- PHP", "Peso Meksykańskie - MXN", "Rand (Republika Południowej Afryki) - ZAR", "Real (Brazylia) - BRL", "Ringgit (Malezja)	- MYR", "Rupia Indonezyjska - IDR", "Rupia Indyjska - INR", "Won Południowokoreański - KRW", "Yuan Renminbi (Chiny) - CNY"};

        for (String i : Table) {
            System.out.println(i);
        }
    }
}