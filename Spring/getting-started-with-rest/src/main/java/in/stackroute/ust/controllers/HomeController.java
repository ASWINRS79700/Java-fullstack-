package in.stackroute.ust.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/home")
    public String gree(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\"\n" +
                "          content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>JS Hacakthon</title>\n" +
                "    <link rel=\"stylesheet\"\n" +
                "          href=\"css/site.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <main class=\"container\">\n" +
                "        <h1>Movie Library</h1>\n" +
                "        <div class=\"sections\">\n" +
                "            <section class=\"left\">\n" +
                "                <h2>Movies</h2>\n" +
                "                <div class=\"list\" id=\"movieList\">\n" +
                "                    \n" +
                "                </div>\n" +
                "            </section>\n" +
                "            <section class=\"right\">\n" +
                "                <h2>Favourites</h2>\n" +
                "                <div class=\"list\" id=\"favList\">\n" +
                "                    \n" +
                "                </div>\n" +
                "            </section>\n" +
                "        </div>\n" +
                "    </main>\n" +
                "    <script src=\"./js/script.js\"></script>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }


}
