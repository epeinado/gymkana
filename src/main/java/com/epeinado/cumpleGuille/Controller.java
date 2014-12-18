package com.epeinado.cumpleGuille;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: epeinado
 * Date: 18/12/2014
 * Time: 10:53
 */
@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = "/{UUID}.html", method = RequestMethod.GET)
    public String gymkana(@PathVariable String UUID, ModelMap model) {
        if (UUID.equals("1c7a0a9e-3fd8-4e69-8d3a-faaeac07b0b9")) {
            // Vamos a jugar a un juego
            return "1";
        } else if (UUID.equals("8b419610-6f01-4993-afee-fbd2e4b04448")) {
            // Tiene el video de Thriller
            return "2";
        } else if (UUID.equals("218694b9-aabf-4801-bc1f-857876dffbd9")) {
            return "3";
        } else if (UUID.equals("3782b899-2446-4cf1-93f3-ede928490dc8")) {
            return "4";
        } else if (UUID.equals("06362194-a7c5-460c-8cab-5ab3ee8cd00c")) {
            return "5";
        } else if (UUID.equals("079989e0-7fd9-4548-a3b5-ad1eeba6cd8f")) {
            return "6";
        } else if (UUID.equals("68b6da23-308f-47d8-afc9-20cfb41c4a65")) {
            return "7";
        } else if (UUID.equals("40048fa1-b756-403a-bdb1-15f0f92f13dd")) {
            return "8";
        } else if (UUID.equals("891e33ff-80c3-4a71-b819-8a282e8f4942")) {
            return "9";
        } else if (UUID.equals("c672c788-8090-4159-8c57-b63a7b32450c")) {
            return "10";
        }
        return "notesobres";
    }

}
