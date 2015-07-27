import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.datastax.spark.connector._

object SimpleApp {
  def main(args: Array[String]) {
    val conf = new SparkConf()
    .setAppName("Simple Application")
    .setMaster("local")
    .set("spark.cassandra.connection.host", "127.0.0.1")
    val sc = new SparkContext(conf)
    //   val input = sc.textFile("input.json")
    //   val words = input.flatMap(line => line.split(" "))
    //   val counts = words.map(word => (word, 1)).reduceByKey{ case(x,y) => x+ y}
    //
    // counts.saveAsTextFile("output.txt")

    // val conf = new SparkConf(true)
    // .set("spark.cassandra.connection.host", "127.0.0.1")
    // val sc = new SparkContext("spark://127.0.0.1:7077", "test", conf)

    val rdd = sc.cassandraTable("test", "kv")
    println(rdd.count +" Yes MUTHAFUCKA!!!! AHAHAHAHAHAAHAH")
    println(rdd.first+" Yes MUTHAFUCKA!!!! AHAHAHAHAHAAHAH")
    println(rdd.map(_.getInt("value")).sum)
    val collection = sc.parallelize(Seq(("key3", 3), ("key4", 4)))
    collection.saveToCassandra("test", "kv", SomeColumns("key", "value"))

  }
}
