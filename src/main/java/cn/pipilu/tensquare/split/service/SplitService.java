package cn.pipilu.tensquare.split.service;

import cn.pipilu.tensquare.split.entity.SplitEntity;

import java.util.List;

public interface SplitService {

    List<SplitEntity> findList();

    void insert(SplitEntity reqData);
}
