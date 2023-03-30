package org.zutjmx.cliente.jaxrs;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import kong.unirest.Unirest;
import org.zutjmx.cliente.jaxrs.models.Cliente;
import org.zutjmx.cliente.jaxrs.models.ColombiaCountry;
import org.zutjmx.cliente.jaxrs.models.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget rootUri = client
                .target("http://127.0.0.1:8080/webapp-jaxrs-jpa-sql-server/api")
                .path("/cursos");

        System.out.println(":: Por Id ::");
        try {
            /*Curso curso = rootUri.path("/5")
                    .request(MediaType.APPLICATION_JSON)
                    .get(Curso.class);*/

            Response response = rootUri.path("/5")
                    .request(MediaType.APPLICATION_JSON)
                    .get();

            Curso curso = response.readEntity(Curso.class);

            System.out.println(curso);
            System.out.println("HttpStatusCode: " + response.getStatus());
            System.out.println("MediaType: " + response.getMediaType());
            System.out.println("Headers: " + response.getHeaders());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(":: Todos los cursos ::");

        /*List<Curso> cursos = rootUri.request(MediaType.APPLICATION_JSON)
                .get(Response.class)
                .readEntity(new GenericType<List<Curso>>(){});*/

        Response responseCursos = rootUri.request(MediaType.APPLICATION_JSON)
                .get();
        List<Curso> cursos = responseCursos.readEntity(new GenericType<List<Curso>>(){});

        cursos.forEach(System.out::println);

        System.out.println(":: Api Colombia ::");
        Client clienteApiColombia = ClientBuilder.newClient();
        WebTarget webTargetApiColombia = client.target("https://api-colombia.com/api/v1");

        System.out.println(":: Información general de Colombia ::");

        try {
            Response responseInfoGeneral = webTargetApiColombia
                    .path("/Country/Colombia")
                    .request(MediaType.APPLICATION_JSON)
                    .get();
            ColombiaCountry colombiaCountry = responseInfoGeneral.readEntity(ColombiaCountry.class);
            System.out.println(colombiaCountry);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(":: Clientes Mockroo, usando Unirest ::");

        List<Cliente> clientes = Unirest.get("https://my.api.mockaroo.com/clientes_mockaroo.json")
                .header("X-API-Key","2c31e070")
                .asObject(new kong.unirest.GenericType<List<Cliente>>(){})
                .getBody();

        clientes.forEach(System.out::println);
    }
}
