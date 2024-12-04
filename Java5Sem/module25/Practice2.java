package module25;

public class Practice2 {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer и StringBuilder
        String str = "Hello Java!";
        StringBuffer sbf = new StringBuffer(str);
        StringBuilder sbd = new StringBuilder(str);

        System.out.println("StringBuffer из String: " + sbf);
        System.out.println("StringBuilder из String: " + sbd);

        // Преобразование StringBuffer и StringBuilder обратно в String
        String fromSbf = sbf.toString();
        String fromSbd = sbd.toString();

        System.out.println("String из StringBuffer: " + fromSbf);
        System.out.println("String из StringBuilder: " + fromSbd);

        // Преобразование между StringBuffer и StringBuilder
        StringBuffer sbfFromSbd = new StringBuffer(sbd);
        StringBuilder sbdFromSbf = new StringBuilder(sbf);

        System.out.println("StringBuffer из StringBuilder: " + sbfFromSbd);
        System.out.println("StringBuilder из StringBuffer: " + sbdFromSbf);
    }
}
