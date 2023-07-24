package com.idLogin.idLogin.controller;

import com.idLogin.idLogin.dto.MemberDTO;
import com.idLogin.idLogin.dto.SDataDTO;
import com.idLogin.idLogin.entity.MDataEntity;
import com.idLogin.idLogin.entity.SDataEntity;
import com.idLogin.idLogin.repository.MDataRepository;
import com.idLogin.idLogin.repository.SDataRepository;
import com.idLogin.idLogin.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping
public class DataController {
    private final DataService dataService;
    private final SDataRepository sDataRepository;
    private final MDataRepository mDataRepository;

    @GetMapping("/data")
    public String dataForm() {
        return "data";
    }

    //@PostMapping("/data")
    //public String data(@ModelAttribute SDataDTO memberDTO){;}

    @GetMapping("/data/sRobot")
    List<SDataEntity> prints() {
        return sDataRepository.findAll();
    }

    @GetMapping("/data/mRobot")
    List<MDataEntity> printm() {
        return mDataRepository.findAll();
    }

}
