package cn.pipilu.tensquare.split.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class QuerySplitReq implements Serializable {

    private static final long serialVersionUID = -1764904134157478913L;
    private String parentId;
    private int page;
    private int pageSize;
}
