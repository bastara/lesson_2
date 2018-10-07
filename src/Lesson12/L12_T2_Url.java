package Lesson12;

public class L12_T2_Url {
    public static void main(String[] args) {
        String url = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";

        String server = getServerName(url);

        System.out.println(server);
    }

    public static String getServerName(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex + 3);
        return (endIndex > 0) ? url.substring(startIndex, endIndex) : url.substring(startIndex);
    }
}
