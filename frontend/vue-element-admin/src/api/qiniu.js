import request from '@/utils/request'
import * as qiniu from 'qiniu'
// export function getToken() {
//   return request({
//     url: '/qiniu/upload/token', // 假地址 自行替换
//     method: 'get'
//   })
// }


export function getToken() {
  let accessKey = 'Js7IweSBygauEZXJTPw4F3UrSXKLVKfq0_BlEud9'; //可在个人中心=》秘钥管理查看
  let secretKey = 'k1k5SisGYW2ULWC-gMIrRPFtKcc86d7HbYDmB5JD'; //可在个人中心=》秘钥管理查看
  let bucket = "lys";  //存储空间名称
  let mac = new qiniu.auth.digest.Mac(accessKey, secretKey);
  let options = {
    scope: bucket,
    expires: 7200,
    returnBody: '{"key":"$(key)","hash":"$(etag)","fsize":$(fsize),"bucket":"$(bucket)","name":"$(x:name)"}'
  }
  let putPolicy = new qiniu.rs.PutPolicy(options);
  let uploadToken = putPolicy.uploadToken(mac);
  return this.jsonp({ 'token': uploadToken });

}
