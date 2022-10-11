package com.example.JsonToXmlConversions.Controller;



import com.example.JsonToXmlConversions.model.ModelClass;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @PostMapping(path = "/mapJsontoXML", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody ModelClass mapJsonToXML(@RequestBody final ModelClass request) {
        return request;
    }

    @PostMapping(path = "/mapXMLtoJson", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ModelClass mapXMLtoJson(@RequestBody final ModelClass request) {
        return request;
    }
}

