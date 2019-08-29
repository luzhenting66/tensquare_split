package cn.pipilu.tensquare.split.controller;

import cn.pipilu.plus.common.request.Request;
import cn.pipilu.plus.common.response.Response;
import cn.pipilu.plus.common.util.ResponseUtil;
import cn.pipilu.tensquare.split.entity.SplitEntity;
import cn.pipilu.tensquare.split.request.QuerySplitReq;
import cn.pipilu.tensquare.split.service.SplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/tensquare-split/split")
@RestController
public class SplitController {
    @Autowired
    private SplitService splitService;
    @Autowired
    private ResponseUtil responseUtil;
    @RequestMapping("/findList")
    public Response<List<SplitEntity>> findList(){
        Response<List<SplitEntity>> response = new Response<>();
        try {
            response.setRespData(splitService.findList());
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }
        return response;
    }
    @RequestMapping("/insert")
    public Response<Void> insert(@RequestBody Request<SplitEntity> reqData){
        Response<Void> response = new Response<>();
        try {
           splitService.insert(reqData.getReqData());
           responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }
        return response;
    }

    @RequestMapping("/findByParentId")
    public Response<List<SplitEntity>> findByParentId(@RequestBody Request<QuerySplitReq> reqData){
        Response<List<SplitEntity>> response = new Response<>();
        try {
            response.setRespData(splitService.findByParentId(reqData.getReqData()));
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }
        return response;
    }
}
