package com.fishbase.fishbaseapi.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ImageUtils {
    @Value("${picture.service.base.url}")
    private String BASE_URL;

    public String getImageSource(String genus,String specie) {
        return this.BASE_URL+scientificNameToImageString(genus,specie);
    }

    private  String scientificNameToImageString(String genus, String specie) {
        StringBuilder builder = new StringBuilder();

        if(genus != null) {
            builder.append(genus.toLowerCase(), 0, 2);
        }
        if(specie != null) {
            builder.append(specie.toLowerCase(), 0, 3);
        }
        //separador
        builder.append("_u");
        //numero da imagem, setando 0, pois as imagens da FAO são 0
        builder.append("0");
        //setando .gif, pois as imagens da FAO são do tipo gif
        builder.append(".gif");

        return builder.toString();
    }
}
