package com.agrawal.KinesisConsumerLambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

import java.nio.charset.StandardCharsets;

public class OrdersLambda {

    public String handleRequest(KinesisEvent event, Context context){

        for(KinesisEvent.KinesisEventRecord record: event.getRecords()){
            //Because data in kinesis stream is in Byte form. We need to decode it
            String recordStr = StandardCharsets.UTF_8.decode(record.getKinesis().getData()).toString();
            System.out.println(recordStr);
        }
        return "SUCCESS";
    }
}
