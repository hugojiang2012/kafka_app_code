package kafkaHighConsumer;
import kafkaHighConsumer.JavaKafkaConsumerHighAPI;

/**
 * Created by jiangjingping on 2018/8/23.
 */
public class JavaKafkaConsumerHighAPITest {
    public static void main(String[] args) {
        String zookeeper = "172.19.106.100:2181";
        String groupId = "test-consumer-group";
        String topic = "loganalysis";
        int threads = 3;

        JavaKafkaConsumerHighAPI example = new JavaKafkaConsumerHighAPI(topic, threads, zookeeper, groupId);
        new Thread(example).start();

        // 执行10秒后结束
        int sleepMillis = 6000000;
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 关闭
        example.shutdown();
    }
}
