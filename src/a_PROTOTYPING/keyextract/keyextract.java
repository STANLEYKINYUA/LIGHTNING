package a_PROTOTYPING.keyextract;

public class keyextract {

    public static void main(String[] args)
    {
        String KEY = "CAPITAL_DOT_COM_API_KEY ";

        String Code = System.getenv(KEY);

        System.out.println("API KEY = " + Code);
    }
}
