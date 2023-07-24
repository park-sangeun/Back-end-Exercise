package com.idLogin.idLogin.entity;

import com.idLogin.idLogin.dto.MDataDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
@Table(name = "mRobot_info")
public class MDataEntity {


    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long mRobot_info_id;

    @Column
    @NotNull
    private Float mHumidity;

    @Column
    @NotNull
    private Float mTemp;

    @Column
    @NotNull
    private Double mLocate;

    public static MDataEntity toMDataEntity(MDataDTO mdataDTO) {
        MDataEntity mdataEntity = new MDataEntity();
        mdataEntity.setMHumidity(mdataDTO.getMHumidity());
        mdataEntity.setMTemp(mdataDTO.getMTemp());
        mdataEntity.setMLocate(mdataDTO.getMLocate());
        return mdataEntity;
    }

    public static MDataEntity toUpdateMDataEntity(MDataDTO mdataDTO) {
        MDataEntity mdataEntity = new MDataEntity();
        mdataEntity.setMRobot_info_id(mdataDTO.getMRobot_info_id());
        mdataEntity.setMHumidity(mdataDTO.getMHumidity());
        mdataEntity.setMTemp(mdataDTO.getMTemp());
        mdataEntity.setMLocate(mdataDTO.getMLocate());
        return mdataEntity;
    }
}
