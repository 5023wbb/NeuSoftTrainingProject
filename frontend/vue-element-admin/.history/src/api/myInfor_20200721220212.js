// eslint-disable-next-line no-unused-vars
import request from '../utils/request'
export function getBVO(params) {
  return request({
    url: 'http://localhost:8888/getDropShipper',
    method: 'post',
    data: params
  })
}

export function editBVO(params) {
  return request({
    url: 'http://localhost:8888/updateDropShipper',
    method: 'post',
    data: params
  })
}
