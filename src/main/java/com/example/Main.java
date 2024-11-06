package com.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws JSONException {
        
        /*
         * Criar um JSONObject para armazenar os dados
         * de um filme. 
         */

        //Instanciar um novo objeto
        JSONObject meujson = new JSONObject();

        //Preencher o objeto com os campos: título, ano e gênero
        meujson.put("titulo", "json x xml: A batalha final");
        meujson.put("ano", 2024);
        meujson.put("genero", "Ação");

        //Serializa para uma string e imprime
        String json_string = meujson.toString();
        System.out.println();
        System.out.println("JSONObject para armazenar os dados de um filme".toUpperCase());
        System.out.println("Objeto original: " + json_string);

        //Altera o título e imprime a nova configuração do objeto
        meujson.put("titulo", "JSON x XML: O confronto dos arquivos");
        json_string = meujson.toString();
        System.out.println("Objeto com título modificado: " + json_string);

        //Recupera campo por campo e imprime cada um
        String titulo = meujson.getString("titulo");
        Integer ano = meujson.getInt("ano");
        String genero = meujson.getString("genero");
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);

        /* Criar um JSONObject a partir de uma String 
         * 
        */

        //String json
	    String texto = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":2024,\"genero\":\"Drama\"}";
        //instancia um novo objeto passando a string como entrada
        JSONObject meujsontexto = new JSONObject(texto);

        //Recupera cada campo com o método get e imprime-os
        titulo = meujsontexto.getString("titulo");
        ano = meujsontexto.getInt("ano");
        genero = meujsontexto.getString("genero");
        System.out.println();
        System.out.println("JSONObject a partir de uma String".toUpperCase());
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);

        /* Trabalhando com um array de strings */

        JSONObject meujsonarray = new JSONObject();
        meujsonarray.put("titulo", "Revisando o Java - Parte II");
        meujsonarray.put("ano", 2024);

        //Cria um json array e preenche com os valores strings
        JSONArray generosarray = new JSONArray();
        generosarray.put("Aventura");
        generosarray.put("Drama");
        generosarray.put("Comédia");

        //Insere no jsonobject com o rótulo generos
        meujsonarray.put("generos", generosarray);

        //Serializa para uma string e imprime
        json_string = meujsonarray.toString();
        System.out.println();
        System.out.println("trabalhando com array de strings".toUpperCase());
        System.out.println(json_string);

        /* Manipulação de Array */

        System.out.println();
        System.out.println("manipulação de array".toUpperCase());

        //String json: array com 3 elementos
        texto = "{\"elenco\":[\"Json Leigh\",\"Maria Stylesheet\", \"Lucas Markup\"],\"filme\":\"Aprendendo Java\",\"local\":\"Pedras Grandes-sc\"}";
        JSONObject meujsonarraymanipulado = new JSONObject(texto);
        json_string = meujsonarraymanipulado.toString();
        System.out.println("String transformado em JSON:");
        System.out.println(json_string);

        //Recupera o array elenco
        JSONArray elencoarray = meujsonarraymanipulado.getJSONArray("elenco");

        //Imprime os valores do array elenco com os métodos get() e length()   
        System.out.println();     
        System.out.println("Elenco original:");
        for(int i=0;i<elencoarray.length();i++) {
            System.out.println("("+i+")" + elencoarray.get(i));
        }        

        //Insere um novo ator no array
        elencoarray.put("Joaquim Caninana");

        //Elenco com o novo ator:
        System.out.println();
        System.out.println("Elenco com o novo ator:");
        for(int i=0;i<elencoarray.length();i++) {
            System.out.println("("+i+")" + elencoarray.get(i));
        }

        //Trocar o nome de um ator
        elencoarray.put(0, "Rick Greenroof");
        System.out.println();
        System.out.println("Elenco com o ator trocado:");
        for(int i=0;i<elencoarray.length();i++) {
            System.out.println("("+i+")" + elencoarray.get(i));
        }

        //Removendo o último ator
        elencoarray.remove(elencoarray.length()-1);
        System.out.println();
        System.out.println("Elenco com o último ator removido:");
        for(int i=0;i<elencoarray.length();i++) {
            System.out.println("("+i+")" + elencoarray.get(i));
        }


    }
}
