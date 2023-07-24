package com.idLogin.idLogin.entity;

import com.idLogin.idLogin.dto.SDataDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "sRobot_info")
public class SDataEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long sRobot_info_id;

    @Column
    private Float sHumidity;

    @Column
    private Float sTemp;

    @Column
    private Double sLocate;

    public static SDataEntity toDataEntity(SDataDTO dataDTO) {
        SDataEntity sdataEntity = new SDataEntity();
        sdataEntity.setSHumidity(dataDTO.getSHumidity());
        sdataEntity.setSTemp(dataDTO.getSTemp());
        sdataEntity.setSLocate(dataDTO.getSLocate());
        return sdataEntity;
    }

    public static SDataEntity toUpdateDataEntity(SDataDTO dataDTO) {
        SDataEntity sdataEntity = new SDataEntity();
        sdataEntity.setSRobot_info_id(dataDTO.getSRobot_info_id());
        sdataEntity.setSHumidity(dataDTO.getSHumidity());
        sdataEntity.setSTemp(dataDTO.getSTemp());
        sdataEntity.setSLocate(dataDTO.getSLocate());
        return sdataEntity;
    }
}
