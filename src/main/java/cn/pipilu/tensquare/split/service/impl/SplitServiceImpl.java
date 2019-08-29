package cn.pipilu.tensquare.split.service.impl;

import cn.pipilu.plus.common.util.IdUtils;
import cn.pipilu.tensquare.split.entity.SplitEntity;
import cn.pipilu.tensquare.split.mapper.SplitMapper;
import cn.pipilu.tensquare.split.service.SplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SplitServiceImpl implements SplitService{
    @Autowired
    private SplitMapper splitMapper;
    @Autowired
    private IdUtils idUtils;
    @Override
    public List<SplitEntity> findList() {
        return splitMapper.findAll();
    }

    @Override
    public void insert(SplitEntity splitEntity) {
        splitEntity.set_id(idUtils.getIdStr());
        splitMapper.insert(splitEntity);
    }
}
