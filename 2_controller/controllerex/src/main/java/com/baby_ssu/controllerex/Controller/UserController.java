package com.baby_ssu.controllerex.Controller;

import com.baby_ssu.controllerex.dto.SpecialtyDto;
import com.baby_ssu.controllerex.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "/user")
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Basic"));

        return new UserDto(1, "eun", "pse0219@naver.com", specialties);
    }
}
