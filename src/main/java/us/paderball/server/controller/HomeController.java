package us.paderball.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    public HomeController() {
    }

    @RequestMapping(value = "/home/message", method = RequestMethod.GET)
    public ResponseEntity<Map<String,Object>> homeMessage() {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", "Welcome home!");

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
