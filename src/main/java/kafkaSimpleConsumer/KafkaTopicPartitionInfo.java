package kafkaSimpleConsumer;

/**
 * Created by jiangjingping on 2018/8/22.
 */
public class KafkaTopicPartitionInfo {
    //主题名称
    public final String topic;
    //分区id
    public final int partitionID;

    //构造函数
    public KafkaTopicPartitionInfo(String topic, int partitionID)
    {
        this.topic = topic;
        this.partitionID = partitionID;
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if(null == object || getClass() !=object.getClass())
        {
            return false;
        }
        KafkaTopicPartitionInfo that = (KafkaTopicPartitionInfo)object;
        if(partitionID != that.partitionID)
        {
            return false;
        }
        return topic != null ? topic.equals(that.topic):that.topic == null;

    }
    @Override
    public int hashCode()
    {
        int result = topic != null?topic.hashCode():0;
        result = 31 * result + partitionID;
        return result;
    }

}
