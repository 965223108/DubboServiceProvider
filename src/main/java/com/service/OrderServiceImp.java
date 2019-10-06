package com.service;

import com.allinterface.OrderService;
import com.beans.Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderServiceImp implements OrderService {

    public List<Address> getAllAddressByUid(Integer integer)
    {
        List<Address> addresses = new ArrayList<Address>();
        Address address = new Address();
        address.setId(1);
        address.setDetailAddress("重庆市");
        addresses.add(address);
        Address address1 = new Address();
        address1.setId(1);
        address1.setDetailAddress("杭州市");
        addresses.add(address1);
        return addresses;
    }


}
