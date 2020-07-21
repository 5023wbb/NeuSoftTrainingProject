import request from '../utils/request'

export function getMan(username) {
  return request({
    url: 'manManufacturer/getMVOReturnInfo',
    method: 'post',
    data: {
      username
    }
  })
}

export function getBrands(man_id) {
  return request({
    url: 'brdBrandController/getBrandInfo',
    method: 'post',
    data: {
      man_id
    }
  })
}

export function insertBrand(brdBrand,imgImage) {
  return request({
    url: 'brdBrandController/addBrand',
    method: 'post',
    data: {
      brdBrand,
      imgImage
    }
  })
}

export function updateBrand(brdBrand,imgImage) {

  return request({
    url: 'brdBrandController/updateBrand',
    method: 'post',
    data: {
      brdBrand,
      imgImage
    }
  })

}

export function deleteBrd(brd_id) {
  return request({
    url: 'brdBrandController/deleteBrand',
    method: 'post',
    data: {
      brd_id
    }
  })
}

export function addMan(manManufacturer,user) {
  return request({
    url: 'manManufacturer/addManInfo',
    method: 'post',
    data: {
      manManufacturer,
      user
    }
  })
}

export function getSao(username) {
  return request({
    url: 'salesOrderManagementController/searchBaseSao',
    method: 'post',
    data: {
      username
    }
  })
}

export function shipSao(sao_id) {
  return request({
    url: 'salesOrderManagementController/shipSao',
    method: 'post',
    data: {
      sao_id
    }
  })
}

export function cancelSao(sao_id) {
  return request({
    url: 'salesOrderManagementController/cancelSao',
    method: 'post',
    data: {
      sao_id
    }
  })
}

export function getExpress(com,nu,receiverPhone,senderPhone) {
  return request({
    url: 'salesOrderManagementController/getExpressInfo',
    method: 'post',
    data: {
      com,
      nu,
      receiverPhone,
      senderPhone
    }
  })
}
