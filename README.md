# microservice-common
microservice common lib for spring cloud

```
SUCCESS_CODE=0

SUCCESS_MESSAGE="SUCCESS"

```

通过如下方式构造通用响应

```
//没有数据返回的成功Response
ResultResponse.SUCCESS();

//有数据返回的成功Response
ResultResponse.SUCCESS(T data);

//已知错误码的Error Response
ResultResponse.ERROR(int code,String message);

//未知错误码的Error Response
ResultResponse.ERROR();

```

> T 类 必须实现`Serializable`接口
