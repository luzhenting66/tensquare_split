package cn.pipilu.tensquare.split.mapper;

import cn.pipilu.tensquare.split.entity.SplitEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SplitMapper extends MongoRepository<SplitEntity,String> {
}
