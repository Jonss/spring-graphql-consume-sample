package br.com.jonss.graphqlconsume.feign;

import br.com.jonss.graphqlconsume.domain.GraphqlData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//
@FeignClient(value = "swapi", url = "http://localhost:8080/graphql")
public interface Swapi {

    @GetMapping
    GraphqlData getData(@RequestParam("query") String query);

}
