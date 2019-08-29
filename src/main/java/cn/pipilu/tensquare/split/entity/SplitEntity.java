package cn.pipilu.tensquare.split.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@Data
public class SplitEntity implements Serializable {

    private static final long serialVersionUID = -313714918489693219L;
    @Id
    private String _id;
    private String content;
    private Date publishTime;
    private String userId;
    private String nickName;
    private Integer visit;
    private String parentId;
    private String state;
    private Integer comment;
    private Integer share;
    private Integer thumbup;

}
