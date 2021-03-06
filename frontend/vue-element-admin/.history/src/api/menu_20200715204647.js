import request from '@/utils/request'

export function deleteByUrlAndName(url, name) {
  return request({
    // url: '/vue-element-admin/user/info',
    url: 'menu/deleteByUrlAndName',
    method: 'post',
    params: { url, name }
  })
}

export function updateById(data) {
    return request({
        url: 'menu/updateById',
        method: 'post',
        data
    })
}

export function getMenuByRoleId(id) {
  return request({
      url: 'menu/getMenuByRoleId',
      method: 'post',
      params: {id}
  })
}
