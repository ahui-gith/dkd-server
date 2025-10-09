package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionVo extends Region {

    // 点位数量
    private Integer nodeCount;

}
