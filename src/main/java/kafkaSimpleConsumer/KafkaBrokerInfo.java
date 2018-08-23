package kafkaSimpleConsumer;

/**
 * Created by jiangjingping on 2018/8/22.
 */
public class KafkaBrokerInfo {
    //主机名
    public final String brokerHost;
    //端口号
    public final  int brokerPort;

    //构造方法
    public KafkaBrokerInfo(String brokerHost, int brokerPort)
    {
        this.brokerHost = brokerHost;
        this.brokerPort = brokerPort;
    }

    public KafkaBrokerInfo(String brokerHost){
        this(brokerHost,9092);
    }


}
