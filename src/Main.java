import javax.xml.transform.SourceLocator;

public class Main {
    public static void main(String[] args) {

        SolarSystemBasic Omnax =new SolarSystemBasic();
        Omnax.Moon="2";
        Omnax.Sun="1";
        Omnax.Planets="2";
        Omnax.Star="4";

        FeatureSun AdamX = new FeatureSun();
        AdamX.name="poya";
        AdamX.temp="12344231 celcius";
        AdamX.size="32942Km";

        Money obj1 = new Money();
        obj1.currencyName="dollar";



    }
}