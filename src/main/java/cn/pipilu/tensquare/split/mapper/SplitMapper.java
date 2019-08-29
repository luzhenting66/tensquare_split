package cn.pipilu.tensquare.split.mapper;

import cn.pipilu.tensquare.split.entity.SplitEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SplitMapper extends MongoRepository<SplitEntity,String> {
    List<SplitEntity> findByParentId(String parentId, Pageable of);
}
