package String_Regex.CrawlListMagazineTitle;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListMagazineTitle {
    public static void main(String[] args) {
        URL url;
        {
            try {
                url = new URL( "https://dantri.com.vn/the-gioi.htm");
                Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
                scanner.useDelimiter("\\Z");
                String content = scanner.next();
                content = content.replaceAll("\\n+", "");
//                content = content.replaceAll("\\s","");
                Pattern p = Pattern.compile("<a\\s*data-utm=\".*\\s*title=\".*\">\\s*(.*?)\\s*</a>");
//                news-item__avatar\".*\">
                Matcher m = p.matcher(content);
                while (m.find()) {
                    System.out.println(m.group(1));
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}
