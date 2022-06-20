package com.yao.yu.entity;


//import com.alibaba.fastjson.JSONObject;
//import com.hncr.common.constant.HttpStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: JsonResult
 * @Description: json 返回值
 * @Author: YuHao
 * @Date: 2021/11/25
 */
@Data
public class JsonResult<T>{

    @ApiModelProperty(notes = "响应码")
    private Integer code;

    @ApiModelProperty(notes = "响应消息")
    private String msg;

    @ApiModelProperty(notes = "返回数据")
    private T data;

    /**
     * 若没有数据返回，默认状态码为 0，提示信息为“操作成功！”
     */
//    public JsonResult() {
//        this.code = HttpStatus.SUCCESS;
//        this.msg = "success";
//    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code
     * @param msg
     */
    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

//    /**
//     * 有数据返回时，状态码为 0，默认提示信息为“操作成功！”
//     * @param data
//     */
//    public JsonResult(T data) {
//        this.data = data;
//        this.code = HttpStatus.SUCCESS;
//        this.msg = "success";
//    }

//    public static JsonResult success(){
//        return new JsonResult<>();
//    }
//
//    public static <T> JsonResult success(T data){
//        return new JsonResult(data);
//    }

//    public static JsonResult error(String msg){
//        return new JsonResult(HttpStatus.ERROR,msg);
//    }
//
//    public static JsonResult error(){
//        return new JsonResult(HttpStatus.ERROR,"error");
//    }

    public static JsonResult error(int code, String msg){
        return new JsonResult(code,msg);
    }

//    public static JsonResultBuilder builder(){
//        return new JsonResultBuilder();
//    }

//    public static class JsonResultBuilder{
//
//        private JSONObject buildData = new JSONObject();
//
//        public JsonResultBuilder put(String key,Object value){
//            buildData.put(key,value);
//            return this;
//        }
//
//        public JsonResult get(){
//            return JsonResult.success(buildData);
//        }
//    }
}


