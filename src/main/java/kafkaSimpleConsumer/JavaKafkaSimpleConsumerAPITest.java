package kafkaSimpleConsumer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangjingping on 2018/8/23.
 */
public class JavaKafkaSimpleConsumerAPITest {
    public static  void main(String[] args)
    {
        JavaKafkaSimpleConsumerAPI example = new JavaKafkaSimpleConsumerAPI();
        long maxReads = 300000000;
        String topic = "loganalysis";
        int partitionID = 0;
        KafkaTopicPartitionInfo topicPartitionInfo = new KafkaTopicPartitionInfo(topic,partitionID);
        List<KafkaBrokerInfo> seeds = new ArrayList<KafkaBrokerInfo>();
		//集群的ip,我的集群ip地址是172.19.106.100， 9092是broker的端口号
        seeds.add(new KafkaBrokerInfo("172.19.106.100", 9092));
        try
        {
            example.run(maxReads,topicPartitionInfo, seeds);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //获取该topic所属的所有分区ID列表
        System.out.println(example.fetchTopicPartitionIDs(seeds, topic, 100000, 64*1024, "client-id"));


    }
}
