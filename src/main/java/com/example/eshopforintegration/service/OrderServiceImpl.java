package com.example.eshopforintegration.service;

import com.example.eshopforintegration.domain.Order;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("ALL")
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void save(Order order) {
        File orderFolder = new File("C:\\Users\\maryn\\Desktop\\orders");
        File orderFile = new File(orderFolder, order.getOrderId() + ".json");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(orderFile, order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
